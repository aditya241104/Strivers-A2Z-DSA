package Arrays;

import java.util.Scanner;
//time complexity without divide and conqure o(n)
//same o(n) but less comparision
public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the new number of element ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a[]=minmax(arr, 0, n-1);
        System.out.println(a[0]+" "+ a[1]);
        sc.close();
    }
    static int[] minmax(int arr[],int left,int right){
        if(left==right){
            return new int [] {arr[left],arr[right]};
        }
        if(left+1==right){
            if(arr[left]>=arr[right]){
                return new int [] {arr[right],arr[left]};

            }
            else {
                return new int [] {arr[left],arr[right]};

            }
        }
        int mid=(left+right)/2;
        int l[]=minmax(arr, left,mid);
        int r[]=minmax(arr, mid+1, right);
        return new int[]{Math.min(l[0],r[0]),Math.max(r[1],l[1])};
    }
}
