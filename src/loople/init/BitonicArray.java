package loople.init;

public class BitonicArray {
    // Bitonic array is also called mountain array
    public static void main(String[] args) {
        print();
    }

    static void print() {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 3, 2, 1};
        int ans = peakValueIndex(arr);
        System.out.println(ans);
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
}
