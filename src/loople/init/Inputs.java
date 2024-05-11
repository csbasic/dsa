package loople.init;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
//        int rollno = input.nextInt();
//
//        System.out.println("Your roll number is " + rollno);

        int marks = input.nextInt();
        int price = input.nextInt();

        int sum = marks + price;

        System.out.println(sum);
    }
}
