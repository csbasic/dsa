package loople.init;

public class OrderAnosticsBinarySearch {
    public static void main(String[] args) {
        print();
    }

    static void print() {
//        int[] arr = {2 , 4, 5 ,6, 8, 10, 11, 13, 15, 16, 18, 19, 21, 24, 29, 32, 35};
        int[] arr = {89, 78, 77, 74, 64, 62, 51, 40, 26, 13, 9, 8, 7, 6, 4, 2, 0};
        int target = 40;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // * Find Whether array is sorted in ascending or descending order
        Boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find middle
//            int mid = (start + end) / 2; this might result to a number bigger than Max int range
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
