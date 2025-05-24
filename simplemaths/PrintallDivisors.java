package simplemaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintallDivisors {
    public static void main(String args[]){
        List<Integer> min= new ArrayList<>();
        List<Integer> max= new ArrayList<>();

        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                min.add(i);
                  if (i != n / i) {
                    max.add(n / i);
                }

            }
        }
        Collections.reverse(max);
        min.addAll(max);
        System.out.println(min);
        sc.close();
    }
}
