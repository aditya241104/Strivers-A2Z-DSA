package LinkedList;

public class Intersection {

    // Function to be implemented by you
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA;
        ListNode ptr2=headB;
            //bruteForece less efficeint time complexity o(n^2)
        // while(ptr1!=null){
        //     ptr2=headB;
        //     while(ptr2!=null){
        //         if(ptr2==ptr1){
        //             return ptr2;
        //         }
        //         ptr2=ptr2.next;
        //     }
        //     ptr1=ptr1.next;
        // }
        //two pointer method more efficeint 
        while(ptr1!=ptr2){
            ptr1=(ptr1==null)?headB:ptr1.next;
            ptr2=(ptr2==null)?headA:ptr2.next;
        }
        return ptr1;
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Test method
    public static void main(String[] args) {
        /*
         * Constructing the following Y-shaped linked list:
         *
         * List A: 1 -> 2
         *                 \
         *                  8 -> 9 -> 10
         *                 /
         * List B:     3 -> 4
         */

        // Shared part
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(9);
        intersect.next.next = new ListNode(10);

        // List A
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = intersect;

        // List B
        ListNode headB = new ListNode(3);
        headB.next = new ListNode(4);
        headB.next.next = intersect;

        System.out.println("List A:");
        printList(headA);

        System.out.println("List B:");
        printList(headB);

        ListNode result = getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}