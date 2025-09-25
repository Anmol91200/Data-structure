package day1;
import java.util.Scanner;

public class calculator {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first nuber : ");
        int a= sc.nextInt();
        System.out.print("Enter the second number : ");
        int b= sc.nextInt();
        System.out.print("Enter the operation : ");
        char c=sc.next().charAt(0);
        sc.close();
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                break;
        }
    }
}
