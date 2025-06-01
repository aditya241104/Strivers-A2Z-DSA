package Arrays;

import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Elements");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //less eficient way 
        // int start=0;
        // int end=0;
        // int sum=0;
        // int maxlenght=0;
        // for(int i=0;i<n-1;i++){
        //     start=i;
        //     end=i+1;
        //     sum=a[i];
        //     while(sum<k && end<n){
        //         sum+=a[end];
        //         end++;
        //         if(sum==k && maxlenght<end-start){
        //             maxlenght=end-start;
        //             break;
        //         }
        //     }

        // }
        // System.out.println(maxlenght);
        //more efficient way 
        int start=0;
        int end=0;
        int sum=0;
        int maxLength=0;
        while(end<n){
            sum+=a[end];
            while(sum>k){
                sum-=a[start];
                start++;
            }
            if(sum==k && maxLength<end-start+1){
                maxLength=end-start+1;
                
            }
            end++;

        }
        sc.close();
        System.out.println(maxLength);

    }
    
}
