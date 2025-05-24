package Recursion;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
        sc.close();
    }
     static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
     }
}
