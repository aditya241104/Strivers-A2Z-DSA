package Arrays;

import java.util.Scanner;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Elements");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxCount=1;
        int currentCount=1;
        int maxElement=a[0];
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                currentCount++;
            }
            else {
            currentCount = 1;

            }
            if(currentCount>maxCount){
                maxCount=currentCount;
                maxElement=a[i];
            }
        }
        System.out.println(maxElement + " is repeated most with " + maxCount + " times");

        sc.close();

    }
}
