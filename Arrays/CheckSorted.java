package Arrays;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        sc.close();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("sorted");
    }
}
