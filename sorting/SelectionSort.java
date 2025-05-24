package sorting;

import java.util.Scanner;
//time complexity o(n^2) for every case;
public class SelectionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sorted array is");
        selectionsort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    static void swap(int [] arr,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
    static void selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!= i)
            swap(arr,i,min);
        }
    }

}
