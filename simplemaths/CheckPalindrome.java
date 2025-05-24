package simplemaths;

import java.util.Scanner;

public class CheckPalindrome {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10 +n%10;
            n=n/10;
        }
        if(reverse == original){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
        sc.close();
    }
}
