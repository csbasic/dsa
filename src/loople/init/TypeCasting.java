package loople.init;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();

        // narrow casting, converting from bigger type to smaller type
        int num = (int)(254.365);

        // automatic type promotion in expression

//        int a = 257;
//        byte b = (byte)(a); // this will do the modulus 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b) / c;

//        byte b = 50;
//        b = b * 2;

        int number = 'A';
        String unitCodeValues = "早上好"; // Java prints unit code values

        // There is type promotion rule - every higher data type into lower will give a higher.
        System.out.println(unitCodeValues);
    }
}
