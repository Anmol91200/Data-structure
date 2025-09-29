package day3.Patterns;

import java.util.Scanner;

public class solidRohumbus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the height of the rohumbus : ");
        int a=sc.nextInt();
        for (int i=0;i<a;i++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<a;j++){
                if((i==0)||(i==a-1)||(j==0)||(j==a)){
                    System.out.print(" *" );
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    sc.close();
   }
    
}
