package LinkedList;

public class CycleInLL {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Dummy hasCycle method for compilation (remove this if you have your own)
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null  && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        // Test case 1: No cycle - simple list 1->2->3->null
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        System.out.println("Test 1 (No cycle): " + hasCycle(head1)); // Expected: false

        // Test case 2: Cycle at last node pointing to node 2 (1->2->3->2 ...)
        ListNode head2 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head2.next = node2;
        node2.next = node3;
        node3.next = node2;  // cycle here

        System.out.println("Test 2 (Cycle present): " + hasCycle(head2)); // Expected: true

        // Test case 3: Single node without cycle
        ListNode head3 = new ListNode(1);
        System.out.println("Test 3 (Single node, no cycle): " + hasCycle(head3)); // Expected: false

        // Test case 4: Single node with cycle (points to itself)
        ListNode head4 = new ListNode(1);
        head4.next = head4;   // cycle to self
        System.out.println("Test 4 (Single node cycle): " + hasCycle(head4)); // Expected: true

        // Test case 5: Empty list
        ListNode head5 = null;
        System.out.println("Test 5 (Empty list): " + hasCycle(head5)); // Expected: false
    }


}
