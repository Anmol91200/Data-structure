package day2;

import java.util.*;


public class productByMethod{

    public static void multiplication(int a,int b){
    int p=a*b;
    System.out.print(p);

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("enter the second number : ");
        int b=sc.nextInt();
        multiplication(a,b);
        sc.close();
    }
}
