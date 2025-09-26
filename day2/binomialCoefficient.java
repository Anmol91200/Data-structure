package day2;

import java.util.Scanner;

class binomialCoefficient {
   public static int fac(int a) {
        int result=1;
        for(;a>0;a--){
            result=result*a;
        }
        return result;
    }
    public static int BC(int a,int b){
        int result=fac(a)/(fac(b)*fac(a-b));
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r=sc.nextInt();
        int BC=BC(n, r);
        System.out.println(BC);
        sc.close();
        
    }
    
}