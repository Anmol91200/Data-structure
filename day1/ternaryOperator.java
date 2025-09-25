package day1;
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects");
        int [] marks=new int[5];
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        double result=0;
        for(int i=0;i<5;i++){
            result+=marks[i];
        }
        System.out.println("Gross marks is "+(result/5));
            
            
        String a=((result/5)>33)?"pass":"fail";
        System.out.println("Cndidate is "+a);
        sc.close();
    }
}
