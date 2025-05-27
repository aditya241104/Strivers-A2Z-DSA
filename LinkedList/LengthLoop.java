package LinkedList;

public class LengthLoop {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // You will complete this function
    public static int lengthOfCycle(ListNode head) {
        if(head==null || head.next==null){
            return 0;
        }
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return 0;
        }
        slow=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        fast=fast.next;
        int count=1;
        while(fast!=slow){
            fast=fast.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Test case 1: Cycle of length 3 (1 -> 2 -> 3 -> 4 -> 2 ...)
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Cycle starts at node2, length = 3

        System.out.println("Test 1 - Expected: 3, Got: " + lengthOfCycle(head1));

        // Test case 2: No cycle
        ListNode head2 = new ListNode(10);
        head2.next = new ListNode(20);
        head2.next.next = new ListNode(30);

        System.out.println("Test 2 - Expected: 0, Got: " + lengthOfCycle(head2));

        // Test case 3: Cycle of length 1 (node points to itself)
        ListNode head3 = new ListNode(99);
        head3.next = head3;

        System.out.println("Test 3 - Expected: 1, Got: " + lengthOfCycle(head3));

        // Test case 4: Empty list
        ListNode head4 = null;
        System.out.println("Test 4 - Expected: 0, Got: " + lengthOfCycle(head4));
    }
}
