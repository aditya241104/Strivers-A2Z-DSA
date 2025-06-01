package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentlyOccurringNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Elements");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
        map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int value=0;
        for(HashMap.Entry<Integer,Integer> item:map.entrySet()){
            if(max<item.getValue()){
                max=item.getValue();
                value=item.getKey();
            }
        }
        System.out.println(value+" is repeated most with "+max + " times");
        sc.close();

    }
}
