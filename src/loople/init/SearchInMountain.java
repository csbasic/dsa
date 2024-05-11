package loople.init;

public class SearchInMountain {
    public static void main(String[] args) {
        print();
    }

    static void print() {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peack = peakValueIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peack);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, firstTry, peack + 1, arr.length);
    }


    static int peakValueIndex (int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > (arr[mid + 1])) {
                // focus is in descending part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                // this is a possible peak
                end = mid;

            } else {
                // The ascending part of array
                start = mid + 1;
            }
        }
        // at the end, start == end and po
        // focus is ascending part and pointing to the largest number of the 2 checks above
        // trying to find max element in the above 2 checks
        // The point of one element is the max value in the all elements
        return end; // or return end
    }


    static int orderAgnosticBS (int[] arr, int target, int start, int end) {


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
