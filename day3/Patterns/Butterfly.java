package day3.Patterns;

import java.util.*;

public class Butterfly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coloumn in the pattern: ");
        int a = sc.nextInt();
        for (int i = 0; i < (a / 2); i++) {
            for (int j = 0; j < a; j++) {
                if ((j <= i) || (j >= (a - 1 - i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = (a / 2); i > 0; i--) {
            for (int j = a; j > 0; j--) {
                if ((j <= i) || (j >= (a + 1 - i))) {
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