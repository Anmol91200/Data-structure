package day3.Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a / 2; i++) {
            for (int j = 0; j < a; j++) {
                if ((j >= ((a / 2) - i)) && j <= (((a / 2) + i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = a / 2 + 1; i > 0; i--) {
            for (int j = 0; j < a; j++) {
                if ((j >= ((a / 2) - i + 1)) && j <= (((a / 2) + i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
