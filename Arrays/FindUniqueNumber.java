package Arrays;

import java.util.Scanner;

public class FindUniqueNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Elements");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            System.out.println(i +"th element "+a[i]+" res value "+res);
            res^=a[i];
            System.out.println("new res value"+res);
        }
        System.out.println(res +" is reapeted once");
        sc.close();

        
}
}
