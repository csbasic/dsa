package loople.init;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        print();
    }

    static void print() {
        int[] arr = {2 , 4, 5 ,10, 11, 13,  14, 15, 15, 15,15, 15, 19, 21, 24,  32, 35, 45, 55};
//        int[] arr = {89, 78, 77, 74, 64, 40, 40, 26, 13, 9, 8, 7, 6, 4, 2, 0};
        int target = 15;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] searchRange(int[] nums, int target) {
       int[] ans = {-1, -1};
        // check for first occurrence of target
         ans[0] = search(nums, target, true);
         if (ans[0] != -1) ans[1] = search(nums, target, false);

        return ans;
     }

    // function returns index of target
    static int search(int[] nums, int target, boolean searchLeft) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find middle
//            int mid = (start + end) / 2; this might result to a number bigger than Max int range
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                // if target is middle, possible to find more target left or rigt
                if (searchLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}