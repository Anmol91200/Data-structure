package day1;
import java.util.Scanner;

public class numReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int copy=num;
        int rev=0;
        while (copy>0) {
            rev=(rev*10)+copy%10;
            copy/=10;
        }
        System.out.println("reverse is : "+rev);
        sc.close();
    }
}
