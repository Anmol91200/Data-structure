package day2;

import java.util.Scanner;

public class primerange {
    public static void p(int a) {
        for (int j = 2; j <= a; j++) {
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i != 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        p(num);
        sc.close();

    }
}
