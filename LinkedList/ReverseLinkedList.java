package LinkedList;
//in this using Iterative Method which is most efficient ;
public class ReverseLinkedList {
    
    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Reverse method
    public static ListNode reverse(ListNode head) {
        ListNode temp=null;
        ListNode ptr=head;
        ListNode ptr1=head;
        while(ptr.next!=null){
            ptr1=ptr.next;
            ptr.next=temp;
            temp=ptr;
            ptr=ptr1;
        }
        ptr.next=temp;
        return ptr;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        // Call the reverse method (to be implemented)
        ListNode reversedHead = reverse(head);

        System.out.print("Reversed List: ");
        printList(reversedHead);
    }
}
