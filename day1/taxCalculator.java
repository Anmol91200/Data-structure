package day1;
import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income : ");
        double income=sc.nextDouble();
        if (income<=500000) {
        System.out.println("your tax rate is 0%");
        }
        else if (income<1000000) {
            System.out.println("your tax rate is 20%");
            double tax=(income*20)/100;
            System.out.println("your tax will be Rs."+ tax);
        }
        else{
            System.out.println("your tax rate is 30%");
            double tax=(income*30)/100;
            System.out.println("your tax will be Rs."+ tax);
        }
        sc.close();
    }
    
}
