package Arrays;

import java.util.Scanner;

public class LeftShit {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("left shifted array ");
        int k=5;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            
            a[((i - k) % n + n) % n]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        sc.close();
    }
}
