package LinkedList;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class SortLL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // TODO: You will implement this method
    public static ListNode sortList(ListNode head) {
        ListNode ptr=head;
        PriorityQueue<Integer> sorted = new PriorityQueue<>();       
        while(ptr!=null){
            sorted.add(ptr.val);
            ptr=ptr.next;
        }
        ListNode head1;
        ListNode sort=new ListNode(0);;
        head1=sort;
        while (!sorted.isEmpty()) {
            sort.next=new ListNode(sorted.poll());
            sort=sort.next;
        }

        return head1.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test 1: Unsorted list
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(3);
        System.out.print("Original: ");
        printList(head1);
        ListNode sorted1 = sortList(head1);
        System.out.print("Sorted:   ");
        printList(sorted1);

        // Test 2: Already sorted
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        System.out.print("Original: ");
        printList(head2);
        ListNode sorted2 = sortList(head2);
        System.out.print("Sorted:   ");
        printList(sorted2);

        // Test 3: All elements same
        ListNode head3 = new ListNode(5);
        head3.next = new ListNode(5);
        head3.next.next = new ListNode(5);
        System.out.print("Original: ");
        printList(head3);
        ListNode sorted3 = sortList(head3);
        System.out.print("Sorted:   ");
        printList(sorted3);

        // Test 4: Single element
        ListNode head4 = new ListNode(9);
        System.out.print("Original: ");
        printList(head4);
        ListNode sorted4 = sortList(head4);
        System.out.print("Sorted:   ");
        printList(sorted4);

        // Test 5: Negative values
        ListNode head5 = new ListNode(-1);
        head5.next = new ListNode(3);
        head5.next.next = new ListNode(-5);
        head5.next.next.next = new ListNode(2);
        System.out.print("Original: ");
        printList(head5);
        ListNode sorted5 = sortList(head5);
        System.out.print("Sorted:   ");
        printList(sorted5);
    }
}
