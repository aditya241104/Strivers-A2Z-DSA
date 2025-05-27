package LinkedList;

public class StartingLoop {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode findCycleStart(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
            if (fast == null || fast.next == null) {
        return null;
    }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // Test case 1: List with cycle starting at node with value 2
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle starts at node2

        ListNode start1 = findCycleStart(head1);
        System.out.println("Cycle starts at node with value: " + (start1 != null ? start1.val : "No cycle"));

        // Test case 2: List with no cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        ListNode start2 = findCycleStart(head2);
        System.out.println("Cycle starts at node with value: " + (start2 != null ? start2.val : "No cycle"));

        // Test case 3: Cycle starts at head node
        ListNode head3 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        head3.next = node5;
        node5.next = head3; // cycle starts at head3

        ListNode start3 = findCycleStart(head3);
        System.out.println("Cycle starts at node with value: " + (start3 != null ? start3.val : "No cycle"));

        // Test case 4: Single node cycle
        ListNode head4 = new ListNode(1);
        head4.next = head4; // cycle at single node

        ListNode start4 = findCycleStart(head4);
        System.out.println("Cycle starts at node with value: " + (start4 != null ? start4.val : "No cycle"));
    }
}
