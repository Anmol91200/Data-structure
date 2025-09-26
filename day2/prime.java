package day2;

import java.util.Scanner;

public class prime {
    public static boolean p(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number : ");
      int num=sc.nextInt();
      boolean b=p(num);
      if (b) {
        System.out.println("number is prime");
      }
      else{
        System.out.println("number is not prime");
      }
      sc.close();
   }    
}
