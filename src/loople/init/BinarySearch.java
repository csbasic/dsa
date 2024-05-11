package loople.init;

public class BinarySearch {
    public static void main(String[] args) {
        print();
    }

    static void print() {
//        int[] arr = {2 , 4, 5 ,6, 8, 10, 11, 13, 15, 16, 18, 19, 21, 24, 29, 32, 35};
        int[] arr = {89, 78, 77, 74, 64, 62, 51, 40, 26, 13, 9, 8, 7, 6, 4, 2, 0};
        int target = 40;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int  binarySearch (int[] arr, int target) {
        /*
            Searching in ascending order
            1st step - find the middle element
            2nd step - if target element > middle element
                        Search the right <> else search the left
            3rd step - if target element == middle element = ans
            * if Start element > end End element <> element does not exist
        */
        int start = 0;
        int end = arr.length - 1;
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
