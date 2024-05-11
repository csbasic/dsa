package loople.init;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maxWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when start a new col, take a new sum of row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            // Sum of account of person
            // check overall ans

            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
