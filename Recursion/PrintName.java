package Recursion;

import java.util.Scanner;

public class PrintName {
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    printName(sc.nextInt());
    sc.close();
}
static void printName(int n){
    if(n==0){
        return;
    }
    else {
        System.out.println("Aditya");
        printName(n-1);
    }

}
}
