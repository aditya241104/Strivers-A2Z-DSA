package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        revarray(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void revarray(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        revarray(arr, start+1, end-1);

    }
}
