package day2;

import java.util.Scanner;

public class decToBin {
    public static long bin(int a) {
        int r = 0;
        for (int i = 0; a > 0; i++) {
            int d = a % 2;
            r += d * (Math.pow(10, i));
            a /= 2;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int a = sc.nextInt();
        long r = bin(a);
        System.out.println("Binary is : " + r);
        sc.close();
    }
}