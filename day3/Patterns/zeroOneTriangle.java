package day3.Patterns;

import java.util.*;

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = a + i;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(b % 2 + " ");
                b--;
            }
            System.out.println();
        }
        sc.close();
    }
}