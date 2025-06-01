package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSum {
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
        int prefixsum=0;
        int maxLength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            prefixsum+=a[i];
            if(prefixsum ==k){
                maxLength=i+1;
            }
            if(map.containsKey(prefixsum-k)){
                maxLength=Math.max(maxLength, i-map.get(prefixsum-k));
            }
                        // Store only the first occurrence of each prefix sum
            if (!map.containsKey(prefixsum)) {
                map.put(prefixsum, i);
            }
        }
        System.out.println("Longest subarray with sum " + k + " is of length: " + maxLength);

        sc.close();
    }
}
