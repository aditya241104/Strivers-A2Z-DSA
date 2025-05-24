package sorting;

import java.util.Scanner;
//complexity 0(n logn) for every case
public class MergeSort {
            public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sorted array is");
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    static void mergesort(int arr[],int left , int right){
        if(left<right){
        int mid=(left+right)/2;
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);
        merge(arr,left,mid,right);
        }
    }
    static void  merge(int arr[],int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int temp_arr[]=new int[right-left+1];
        int k=0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp_arr[k++]=arr[i++];
            }
            else if(arr[i]>arr[j]){
                temp_arr[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp_arr[k++]=arr[i++];

        }
        while(j<=right){
            temp_arr[k++]=arr[j++];

        }
        k=0;
        for(int l=left;l<=right;l++){
            arr[l]=temp_arr[k++];
        }
    }
    
}
