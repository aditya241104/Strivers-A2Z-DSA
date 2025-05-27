package LinkedList;



public class OddEvenLL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // You will implement this method
    public static ListNode segregateOddEven(ListNode head) {
    if (head == null) return null;

    ListNode oddHead = new ListNode(0);  
    ListNode evenHead = new ListNode(0);  
    ListNode evenTail = evenHead;
    ListNode oddTail = oddHead;
    ListNode ptr=head;
    while(ptr!=null){
        if(ptr.val%2==0){
            evenTail.next=new ListNode(ptr.val);
            evenTail=evenTail.next;
        }
        else{
            oddTail.next=new ListNode(ptr.val);
            oddTail=oddTail.next;
        }
        ptr=ptr.next;
    }
    evenTail.next=oddHead.next;
    return evenHead.next;


    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test 1: Mixed odd and even
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("Original: ");
        printList(head1);
        System.out.print("After Segregation: ");
        printList(segregateOddEven(head1));  // Expected: 1 -> 3 -> 5 -> 2 -> 4

        // Test 2: All even
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);
        System.out.print("Original: ");
        printList(head2);
        System.out.print("After Segregation: ");
        printList(segregateOddEven(head2));  // Expected: 2 -> 4 -> 6

        // Test 3: All odd
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(3);
        head3.next.next = new ListNode(5);
        System.out.print("Original: ");
        printList(head3);
        System.out.print("After Segregation: ");
        printList(segregateOddEven(head3));  // Expected: 1 -> 3 -> 5

        // Test 4: Single element
        ListNode head4 = new ListNode(7);
        System.out.print("Original: ");
        printList(head4);
        System.out.print("After Segregation: ");
        printList(segregateOddEven(head4));  // Expected: 7

        // Test 5: Empty list
        ListNode head5 = null;
        System.out.print("Original: ");
        printList(head5);
        System.out.print("After Segregation: ");
        printList(segregateOddEven(head5));  // Expected: (nothing)
    }
}