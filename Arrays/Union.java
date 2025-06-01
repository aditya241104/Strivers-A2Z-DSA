package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        System.out.println("Enter The Number Of Elements in First Array ");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.println("Enter The Number Of Element in Second Array ");
        int n1=sc.nextInt();
        System.out.println("Enter "+n1+" Elements");
        for(int i=0;i<n1;i++){
            set.add(sc.nextInt());
        }
        sc.close();
        System.out.println(set);
        
    }
}
