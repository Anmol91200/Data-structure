package day2.patterns;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of coloumns : ");
    int n=sc.nextInt();
    char b='A';
    for(int i = 0; i<n;i++){
        for(int j=0;j<=i;j++,b++){
            System.out.print(b);
        }
        System.out.println();
    }
    sc.close();
   } 
    
}
