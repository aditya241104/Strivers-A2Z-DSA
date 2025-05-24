package sorting;

import java.util.Scanner;
//time complexity o(n log n ) for best and avg case
//for worst case o(n^2)

public class QuickSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sorted array is");
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    static void quicksort(int arr[],int left , int right){
        if(left>=right){
            return ;
        }
        int p=partition(arr, left, right);
        quicksort(arr, left, p-1);
        quicksort(arr, p+1, right);
    }
    static int partition(int arr[],int left,int right){
        int i=left+1;
        int p=left;
        int j=right;
        while(i <= j){
            while(i <= right && arr[i]<arr[p]){
                i++;
            }
            while(j >= left + 1 &&arr[j]>arr[p]){
                j--;
            }
            if(i<=j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        swap(arr, p, j);
        return j;

    }
static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
}
