package loople.init;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
