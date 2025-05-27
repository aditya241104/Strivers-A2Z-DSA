package LinkedList;

public class DeletethemiddlenodeofLL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }


        public static ListNode deleteMiddle(ListNode head) {
                if (head == null || head.next == null) {
        return null;
    }
            ListNode fast=head;
            ListNode slow=head;
            ListNode preslow=null;
            while(fast!=null && fast.next!=null){
                preslow=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            preslow.next=slow.next;
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
        // Test 1: Odd number of nodes
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("Original: ");
        printList(head1);
        ListNode updated1 = deleteMiddle(head1);
        System.out.print("After deleting middle: ");
        printList(updated1);

        // Test 2: Even number of nodes
        ListNode head2 = new ListNode(10);
        head2.next = new ListNode(20);
        head2.next.next = new ListNode(30);
        head2.next.next.next = new ListNode(40);
        System.out.print("Original: ");
        printList(head2);
        ListNode updated2 = deleteMiddle(head2);
        System.out.print("After deleting middle: ");
        printList(updated2);

        // Test 3: Only two nodes
        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(9);
        System.out.print("Original: ");
        printList(head3);
        ListNode updated3 = deleteMiddle(head3);
        System.out.print("After deleting middle: ");
        printList(updated3);

        // Test 4: Only one node
        ListNode head4 = new ListNode(99);
        System.out.print("Original: ");
        printList(head4);
        ListNode updated4 = deleteMiddle(head4);
        System.out.print("After deleting middle: ");
        printList(updated4); // Expected: empty
    }
}