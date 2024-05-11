package loople.init;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        int count = 1;
//        while(count != 5) {
//            System.out.println(count);
//            count++;
//        }

//        countNum();
//        reorderNum();
//        calculator();


        print();
    }

    // Check number frequency using modulus

    public static void print(){

    }

    public static void countNum(){
        int n = 1524525;
        int ref = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                ref++;
            }
            n = n / 10; // n /= 10
        }
        System.out.println("Frequency checker");
        System.out.println(ref);

    }

    // Reordering a number left to right
    public static void reorderNum() {
        int n = 1234567;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;  // get remainder
            n /= 10; // divide n by 10 to move down
            ans = ans * 10 + rem; // shift ans by write and add to reorder
        }
        System.out.println("Reordering numbers");
        System.out.println(ans);
    }

    static void calculator () {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x

        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.println("Enter operator");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.println("Enter two numbers");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                System.out.println();

                if (op == '+') {
                    ans = n1 + n2;
                }

                if (op == '-') {
                    ans = n1 - n2;
                }

                if (op == '*') {
                    ans = n1 * n2;
                }

                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }

                if (op == '%') {
                    ans = n1 % n2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }


}
