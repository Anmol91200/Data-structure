package day3.Patterns;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of squre : ");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if ((i == 0) || (i == s - 1) || (j == 0) || (j == s - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
        sc.close();
    }

}
