package Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max,min;
        if(arr[0]>arr[1]){
            max=arr[0];
            min=arr[1];
        }
        else {
            max=arr[1];
            min=arr[0];
        }
    
        for(int i=1;i<n;i++){
        
            if(max<arr[i]){
                min=max;
                max=arr[i];
            }
            else if(arr[i]>min && arr[i]!=max){
                min=arr[i];
            }

        }
        System.out.println("second largest is "+min);
        sc.close();
    }
}
