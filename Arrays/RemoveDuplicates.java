package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] a = new int[n];
        a[0] = arr[0];
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != a[j]) {
                a[++j] = arr[i];
            }
        }

        System.out.println("Distinct array:");
        for (int i = 0; i <= j; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
