package simplemaths;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n<=0){
     System.out.println("not prime");
    }
    else if(n==2 || n==3){
        System.out.println("prime");
    }
    else if(n%2==0 || n%3==0){
        System.out.println("not a  prime ");
    }
    else {
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0){
                System.out.println("not prime");
            }
        }
        System.out.println("prime");
    }
    sc.close();
    
}}
