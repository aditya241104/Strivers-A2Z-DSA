package LinkedList;

public class AddTwo {
    // Function to be implemented
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1=reverse(l1);
        ListNode ptr2=reverse(l2);
        ListNode head;
        ListNode ptr=new ListNode(0);
        head=ptr;
        int rem=0;
        int n=0;
        while(ptr1!=null && ptr2!=null){
            
            n=ptr2.val+ptr1.val+n;
            
            rem=n%10;
            n=n/10;
            
            ptr.next=new ListNode(rem);
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            ptr=ptr.next;
        }
        while(ptr1!=null){
            n=ptr1.val+n;
            rem=n%10;
            n=n/10;
            ptr.next=new ListNode(rem);
            ptr=ptr.next;
            ptr1=ptr1.next;

        }
        while(ptr2!=null){
            n=ptr2.val+n;
            rem=n%10;
            n=n/10;
            ptr.next=new ListNode(rem);
            ptr=ptr.next;
            ptr2=ptr2.next;
        }
        if(n!=0){
            ptr.next=new ListNode(n);
        }
        return reverse(head.next);
    }
    public static ListNode reverse(ListNode head){
        ListNode temp=null;
        ListNode prev=null;
        ListNode ptr=head;
        while(ptr.next!=null){
            temp=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=temp;
        }
        ptr.next=prev;
        return ptr;
    }
    // Utility to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Utility to create a linked list from array
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
        // Test Case 1: 342 + 465 = 807
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});
        System.out.println("Test Case 1:");
        System.out.print("Input 1: ");
        printList(l1);
        System.out.print("Input 2: ");
        printList(l2);
        ListNode result1 = addTwoNumbers(l1, l2);
        System.out.print("Output : ");
        printList(result1);

        // Test Case 2: 999 + 1 = 1000
        l1 = createList(new int[]{9, 9, 9});
        l2 = createList(new int[]{1});
        System.out.println("\nTest Case 2:");
        System.out.print("Input 1: ");
        printList(l1);
        System.out.print("Input 2: ");
        printList(l2);
        ListNode result2 = addTwoNumbers(l1, l2);
        System.out.print("Output : ");
        printList(result2);

        // Test Case 3: 0 + 0 = 0
        l1 = createList(new int[]{0});
        l2 = createList(new int[]{0});
        System.out.println("\nTest Case 3:");
        System.out.print("Input 1: ");
        printList(l1);
        System.out.print("Input 2: ");
        printList(l2);
        ListNode result3 = addTwoNumbers(l1, l2);
        System.out.print("Output : ");
        printList(result3);

        // Test Case 4: 1234 + 567 = 1801
        l1 = createList(new int[]{4, 3, 2, 1});
        l2 = createList(new int[]{7, 6, 5});
        System.out.println("\nTest Case 4:");
        System.out.print("Input 1: ");
        printList(l1);
        System.out.print("Input 2: ");
        printList(l2);
        ListNode result4 = addTwoNumbers(l1, l2);
        System.out.print("Output : ");
        printList(result4);
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
