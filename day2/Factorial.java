package day2;
import java.util.*;

public class Factorial {

    public static int fac(int a) {
        int result=1;
        for(;a>0;a--){
            result=result*a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int b=fac(sc.nextInt());
        System.out.println(b);
        sc.close();
    }
    
}
