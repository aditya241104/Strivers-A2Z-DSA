package simplemaths;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int original=sc.nextInt();
        int n=original;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        n=original;
        int temp=0;
        while(n!=0){
            temp+=Math.pow(n%10, count);
            n=n/10;
        }
        if(temp==original){
            System.out.println("number is arm strong");
        }
        else{
            System.out.println("number is not armstrong");
        }
        sc.close();
    }
}
