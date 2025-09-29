package day3.Patterns;
import java.util.*;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int a = sc.nextInt();
        int b=1;
        for(int i=0;i<a;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(b+ " ");
                b+=1;
            }
            System.out.println();
        }
        sc.close();
    }
}