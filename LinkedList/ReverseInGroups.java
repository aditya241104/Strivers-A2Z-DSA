package LinkedList;
public class ReverseInGroups {

    // Function to be implemented
    public static ListNode reverseInGroups(ListNode head, int k) {
        ListNode ptr=head;
        ListNode newHead=null;
        int count=0;
        ListNode prev=null;
        //count the size
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        //reset the ptr
        ptr=head;
        //count number of division 
        int n=count/k;
        while(n>0){
            //Starting part of the group
            ListNode starting=ptr;
            int temp=1;
            while(temp<k &&ptr.next!=null){
                temp++;
                ptr=ptr.next;
            }
            n--;
            //ending of the group
            ListNode ending=ptr.next;
            ptr.next=null;
            ListNode revNode=reverse(starting);
            if(newHead==null){
                newHead=revNode;
            }
            else{
            prev.next=revNode;
        }
            while(revNode.next!=null){
                revNode=revNode.next;
            }
            prev=revNode;
            revNode.next=ending;
            ptr=ending;
        }
        return newHead;

    }

    public static ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        ListNode temp;
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
    // Utility to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
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

    public static void main(String[] args) {
        // Test Case 1: Simple case with k = 2
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(arr1);
        System.out.println("Test Case 1:");
        System.out.print("Original: ");
        printList(head1);
        System.out.println("K = 2");
        ListNode result1 = reverseInGroups(head1, 2);
        System.out.print("Reversed in Groups: ");
        printList(result1);
        System.out.println();

        // Test Case 2: k = 3, size is multiple of k
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        ListNode head2 = createList(arr2);
        System.out.println("Test Case 2:");
        System.out.print("Original: ");
        printList(head2);
        System.out.println("K = 3");
        ListNode result2 = reverseInGroups(head2, 3);
        System.out.print("Reversed in Groups: ");
        printList(result2);
        System.out.println();

        // Test Case 3: k > list size
        int[] arr3 = {1, 2};
        ListNode head3 = createList(arr3);
        System.out.println("Test Case 3:");
        System.out.print("Original: ");
        printList(head3);
        System.out.println("K = 5");
        ListNode result3 = reverseInGroups(head3, 5);
        System.out.print("Reversed in Groups: ");
        printList(result3);
        System.out.println();

        // Test Case 4: k = 1 (no change expected)
        int[] arr4 = {1, 2, 3, 4};
        ListNode head4 = createList(arr4);
        System.out.println("Test Case 4:");
        System.out.print("Original: ");
        printList(head4);
        System.out.println("K = 1");
        ListNode result4 = reverseInGroups(head4, 1);
        System.out.print("Reversed in Groups: ");
        printList(result4);
        System.out.println();

        // Test Case 5: Empty list
        int[] arr5 = {};
        ListNode head5 = createList(arr5);
        System.out.println("Test Case 5:");
        System.out.print("Original: ");
        printList(head5);
        System.out.println("K = 2");
        ListNode result5 = reverseInGroups(head5, 2);
        System.out.print("Reversed in Groups: ");
        printList(result5);
        System.out.println();

        // Test Case 6: k = list size (entire list should reverse)
        int[] arr6 = {1, 2, 3, 4};
        ListNode head6 = createList(arr6);
        System.out.println("Test Case 6:");
        System.out.print("Original: ");
        printList(head6);
        System.out.println("K = 4");
        ListNode result6 = reverseInGroups(head6, 4);
        System.out.print("Reversed in Groups: ");
        printList(result6);
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}