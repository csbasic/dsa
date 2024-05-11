package loople.init;

public class SmallestLetter {
    public static void main(String[] args) {
        print();
    }

    static void print() {
        int[] letters = {'c','d','f','j'};
//        int[] arr = {89, 78, 77, 74, 64, 62, 51, 40, 26, 13, 9, 8, 7, 6, 4, 2, 0};
        int target = 'i';
        int ans = smallestLetter(letters, target);
//        int ans2 = orderAgnosticBS(arr, target);
        System.out.println(ans);
//        System.out.println(letters[ans]);
    }

    // return index of smallest n >= target
    static int smallestLetter(int[] letters, int target) {
        /*
            Searching in ascending order
            1st step - find the middle element
            2nd step - if target element > middle element
                        Search the right <> else search the left
            3rd step - if target element == middle element = ans
            * if Start element > end End element <> element does not exist
        */

        int start = 0;
        int end = letters.length - 1;



        while (start <= end) {
            // find middle
//            int mid = (start + end) / 2; this might result to a number bigger than Max int range
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
