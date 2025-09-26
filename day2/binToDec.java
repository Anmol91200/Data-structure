package day2;

import java.util.Scanner;

public class binToDec {
    public static int dec(int a) {
        int d = 0;
        for (int i = 0; a != 0; i++) {
            int r = a % 10;
            a /= 10;
            d += r * (int)(Math.pow(2, i));
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the binary number : ");
        int b = sc.nextInt();
        int a = b;
        boolean t = true;
        while (a != 0) 
        {
            if ((a % 10 != 0) && (a % 10 != 1))
            {
                t = false;
            }
            a /= 10;
        }
        if (t==true){
            int Dec = dec(b);
            System.out.println("Decimal number is : " + Dec);
        } else {
            System.out.println("Number is not a binary");
        }
        sc.close();
    }
}
