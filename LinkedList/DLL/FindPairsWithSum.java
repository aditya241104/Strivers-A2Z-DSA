package LinkedList.DLL;
import java.util.*;

public class FindPairsWithSum {

    // Utility: Create DLL from array
    public static DoublyListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        DoublyListNode head = new DoublyListNode(arr[0]);
        DoublyListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyListNode newNode = new DoublyListNode(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }
        return head;
    }

    // Utility: Print DLL
    public static void printList(DoublyListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" <-> ");
            head = head.next;
        }
        System.out.println();
    }

    // Utility: Print pairs
    public static void printPairs(List<int[]> pairs) {
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        }
    }

    public static void main(String[] args) {

        // Test Case 1: Normal case with multiple pairs
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        DoublyListNode head1 = createList(arr1);
        System.out.println("Test Case 1:");
        System.out.print("DLL: ");
        printList(head1);
        int target1 = 7;
        System.out.println("Target Sum: " + target1);
        List<int[]> pairs1 = findPairsWithSum(head1, target1);
        System.out.println("Pairs:");
        printPairs(pairs1);
        System.out.println();

        // Test Case 2: Empty list
        DoublyListNode head2 = null;
        System.out.println("Test Case 2:");
        System.out.println("DLL: null");
        int target2 = 5;
        System.out.println("Target Sum: " + target2);
        List<int[]> pairs2 = findPairsWithSum(head2, target2);
        System.out.println("Pairs:");
        printPairs(pairs2);
        System.out.println();

        // Test Case 3: No pairs found
        int[] arr3 = {1, 2, 3};
        DoublyListNode head3 = createList(arr3);
        System.out.println("Test Case 3:");
        System.out.print("DLL: ");
        printList(head3);
        int target3 = 10;
        System.out.println("Target Sum: " + target3);
        List<int[]> pairs3 = findPairsWithSum(head3, target3);
        System.out.println("Pairs:");
        printPairs(pairs3);
        System.out.println();

        // Test Case 4: Repeated elements
        int[] arr4 = {1, 1, 2, 3, 4, 4, 5};
        DoublyListNode head4 = createList(arr4);
        System.out.println("Test Case 4:");
        System.out.print("DLL: ");
        printList(head4);
        int target4 = 5;
        System.out.println("Target Sum: " + target4);
        List<int[]> pairs4 = findPairsWithSum(head4, target4);
        System.out.println("Pairs:");
        printPairs(pairs4);
        System.out.println();
    }

    public static List<int[]> findPairsWithSum(DoublyListNode head, int target) {
        ArrayList<int[]> n=new ArrayList<>();
        DoublyListNode ptr=head;
        
        while(ptr!=null){
            DoublyListNode ptr2=ptr.next;
            while(ptr2!=null){
                if(ptr.val+ptr2.val==target){
                    n.add(new int[]{ptr.val,ptr2.val});
                }
                ptr2=ptr2.next;
            }    
            ptr=ptr.next;
        }
        return n;
    }
}

class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
    }
}