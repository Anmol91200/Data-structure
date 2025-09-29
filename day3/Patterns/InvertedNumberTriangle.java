package day3.Patterns;

import java.util.*;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
