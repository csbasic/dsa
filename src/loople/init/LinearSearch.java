package loople.init;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {


        print();
    }

    public static void print(){
//        int[] nums = {12,345,2,6,1457,26,475,454875,36};
//        System.out.println("Find numbers");
//        System.out.println(findNums(nums));

        int[][] arr = new int[][]{
                {24,35,2,35},
                {52,78,3,8,12},
                {18,7,45,85}
        };

        int target = 85;
        int[] ans = search(arr, target);

//        int maxAns = max(arr);
        System.out.println(max(arr) );
        System.out.println(min(arr) );
//        System.out.println(Arrays.toString(ans));
        System.out.println(digits(-23));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++ ) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
            for (int element : ints) {

                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }


    static int min(int[][] arr) {
        int max = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
            for (int element : ints) {

                if (element < max) {
                    max = element;
                }
            }
        }
        return max;
    }

    /*
        Functions to know how many numbers of digits are even
        How many times a number occurs in a search
    */

    static int findNums(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (even(num)) { // even number function called
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums) {

        int numOfDigits = digits2(nums);
        return numOfDigits % 2 == 0; // shortcut - true or false
//        if (numOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;
    }

    // Second way of finding number of digits
    static int digits2(int num) {
        if(num < 0) { // check if number is -ve
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    private static int digits(int num) {

        if(num < 0) { // check if number is -ve
            num = num * -1;
        }

        if (num == 0) { // check if number is zero
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
