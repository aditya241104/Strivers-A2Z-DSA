package Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Elements");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Enter "+n+" Elements");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
            sum+=a[i];
        }
        int actualsum=(max*(max+1))/2 - (min*(min-1))/2;
        int missingnumber=actualsum-sum;
        System.out.println("Missing Number:"+ missingnumber);
        sc.close();
    }
}
