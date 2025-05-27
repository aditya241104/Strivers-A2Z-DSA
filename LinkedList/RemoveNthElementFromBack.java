package LinkedList;

public class RemoveNthElementFromBack {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // You will implement this
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO: Implement the logic
        ListNode ptr=head;
        int size=0;
        while(ptr!=null){
            size++;
            ptr=ptr.next;
        }
        ptr=head;
        int p=size-n;
        ListNode prevptr=head;
        if (n == size) {
        return head.next;
        }

        while(p>0){
            p--;
            prevptr=ptr;
            ptr=ptr.next;
        }
        prevptr.next=ptr.next;
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test 1: Remove 2nd node from end in 1->2->3->4->5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("Original: ");
        printList(head1);
        ListNode updated1 = removeNthFromEnd(head1, 2);
        System.out.print("After removing 2nd from end: ");
        printList(updated1);

        // Test 2: Remove last node
        ListNode head2 = new ListNode(10);
        head2.next = new ListNode(20);
        System.out.print("Original: ");
        printList(head2);
        ListNode updated2 = removeNthFromEnd(head2, 1);
        System.out.print("After removing 1st from end: ");
        printList(updated2);

        // Test 3: Remove head node (n = length)
        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(9);
        head3.next.next = new ListNode(11);
        System.out.print("Original: ");
        printList(head3);
        ListNode updated3 = removeNthFromEnd(head3, 3);
        System.out.print("After removing 3rd from end: ");
        printList(updated3);

        // Test 4: Single node
        ListNode head4 = new ListNode(99);
        System.out.print("Original: ");
        printList(head4);
        ListNode updated4 = removeNthFromEnd(head4, 1);
        System.out.print("After removing 1st from end: ");
        printList(updated4); // Expected: empty
    }
}