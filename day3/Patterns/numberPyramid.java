package day3.Patterns;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the heighrt of the pyramid : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
