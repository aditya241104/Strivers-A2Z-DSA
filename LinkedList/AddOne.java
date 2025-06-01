package LinkedList;

public class AddOne {

    // Function to be implemented
    public static ListNode addOne(ListNode head) {
        
        ListNode ptr=Reverse(head);
        if(ptr.val!=9){
            ptr.val=ptr.val+1;
            return Reverse(ptr);
        }
        else{
            ListNode temp=ptr;
            ptr.val=0;
            ptr=ptr.next;
            while(ptr!=null && ptr.val==9){
                ptr.val=0;
                ptr=ptr.next;
            }

            if(ptr==null){
            ptr=new ListNode(1);
            ptr.next=temp;
            return ptr;
            }
            else {
             ptr.val=ptr.val+1;

            }
            
            return Reverse(temp);
        }
    }
    public static ListNode Reverse(ListNode head){
        ListNode ptr=head;
        ListNode prev=null;
        ListNode temp=head;
        while(ptr.next!=null){
            temp=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=temp;
        }
        ptr.next=prev;
        return ptr;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Utility method to create linked list from integer array
    public static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Test case 1: 123 -> 124
        ListNode head1 = createList(new int[]{1, 2, 3});
        System.out.print("Input:  ");
        printList(head1);
        ListNode result1 = addOne(head1);
        System.out.print("Output: ");
        printList(result1);

        // Test case 2: 129 -> 130
        ListNode head2 = createList(new int[]{1, 2, 9});
        System.out.print("\nInput:  ");
        printList(head2);
        ListNode result2 = addOne(head2);
        System.out.print("Output: ");
        printList(result2);

        // Test case 3: 999 -> 1000
        ListNode head3 = createList(new int[]{9, 9, 9});
        System.out.print("\nInput:  ");
        printList(head3);
        ListNode result3 = addOne(head3);
        System.out.print("Output: ");
        printList(result3);

        // Test case 4: 0 -> 1
        ListNode head4 = createList(new int[]{0});
        System.out.print("\nInput:  ");
        printList(head4);
        ListNode result4 = addOne(head4);
        System.out.print("Output: ");
        printList(result4);

        // Test case 5: 1999 -> 2000
        ListNode head5 = createList(new int[]{1, 9, 9, 9});
        System.out.print("\nInput:  ");
        printList(head5);
        ListNode result5 = addOne(head5);
        System.out.print("Output: ");
        printList(result5);
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}