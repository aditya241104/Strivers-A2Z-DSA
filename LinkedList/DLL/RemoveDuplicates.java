package LinkedList.DLL;

public class RemoveDuplicates {
    

    public static DoublyListNode removeDuplicates(DoublyListNode head) {
        if(head==null){
            return null;
        }
        DoublyListNode ptr=head;
        while(ptr.next!=null){
            if(ptr.val==ptr.next.val){
                if(ptr.next.next==null){
                    ptr.next=null;
                    return head;
                }
                ptr.next=ptr.next.next;
                ptr.next.prev=ptr;
            }
            else{
            ptr=ptr.next;
            }
        }
        return head;
    }

    public static DoublyListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        DoublyListNode head = new DoublyListNode(arr[0]);
        DoublyListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyListNode newNode = new DoublyListNode(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }
        return head;
    }

    public static void printList(DoublyListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" <-> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1: Duplicates in middle
        int[] arr1 = {1, 2, 2, 3, 4, 4, 5};
        DoublyListNode head1 = createList(arr1);
        System.out.println("Test Case 1:");
        System.out.print("Original: ");
        printList(head1);
        DoublyListNode result1 = removeDuplicates(head1);
        System.out.print("After Removing Duplicates: ");
        printList(result1);
        System.out.println();

        // Test Case 2: All nodes are the same
        int[] arr2 = {7, 7, 7, 7};
        DoublyListNode head2 = createList(arr2);
        System.out.println("Test Case 2:");
        System.out.print("Original: ");
        printList(head2);
        DoublyListNode result2 = removeDuplicates(head2);
        System.out.print("After Removing Duplicates: ");
        printList(result2);
        System.out.println();

        // Test Case 3: No duplicates
        int[] arr3 = {1, 2, 3, 4};
        DoublyListNode head3 = createList(arr3);
        System.out.println("Test Case 3:");
        System.out.print("Original: ");
        printList(head3);
        DoublyListNode result3 = removeDuplicates(head3);
        System.out.print("After Removing Duplicates: ");
        printList(result3);
        System.out.println();

        // Test Case 4: Duplicates at end
        int[] arr4 = {1, 2, 3, 5, 5};
        DoublyListNode head4 = createList(arr4);
        System.out.println("Test Case 4:");
        System.out.print("Original: ");
        printList(head4);
        DoublyListNode result4 = removeDuplicates(head4);
        System.out.print("After Removing Duplicates: ");
        printList(result4);
        System.out.println();

        // Test Case 5: Empty list
        int[] arr5 = {};
        DoublyListNode head5 = createList(arr5);
        System.out.println("Test Case 5:");
        System.out.print("Original: ");
        printList(head5);
        DoublyListNode result5 = removeDuplicates(head5);
        System.out.print("After Removing Duplicates: ");
        printList(result5);
        System.out.println();
        // Test Case 6: Duplicates at the end - should NOT return early
        int[] arr6 = {1, 2, 2, 3, 3};  // Duplicates present at the end
        DoublyListNode head6 = createList(arr6);
        System.out.println("Test Case 6:");
        System.out.print("Original: ");
        printList(head6);
        DoublyListNode result6 = removeDuplicates(head6);  // Your code may return early here
        System.out.print("After Removing Duplicates: ");
        printList(result6);  // Should be: 1 <-> 2 <-> 3
        System.out.println();
    }
}

class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
    }
}