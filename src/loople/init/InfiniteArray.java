package loople.init;

public class InfiniteArray {
    public static void main(String[] args) {
        print();
    }

    static void print() {
        int[] arr = {2 , 4, 5 ,6, 8, 10, 11, 13, 15, 16, 18, 19, 21, 24, 29, 32, 35};
        int target = 10;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // Start with box size of 2
        int start = 0;
        int end =  1;

        while (target > arr[end]) {
            int tempStart = end + 1;
            // double the box size
            // end = prev end + boxSize x 2
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end)  {


        while (start <= end) {
            // find middle
//            int mid = (start + end) / 2; this might result to a number bigger than Max int range
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
