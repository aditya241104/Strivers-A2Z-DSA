package LinkedList.DLL;

public class DeleteKey {

// Function to be implemented
public static DoublyListNode deleteAllOccurrences(DoublyListNode head, int key) {
    DoublyListNode ptr=head;
    while(ptr!=null && ptr.val==key){
        ptr=ptr.next;
    }
    if(ptr==null){
        return null;
    }
    ptr.prev=null;
    head=ptr;
    ptr=ptr.next;
    while(ptr!=null){
        if(ptr.val==key){
            if(ptr.next==null){
                ptr.prev.next=null;
                return head;
            }
            ptr.prev.next=ptr.next;
            ptr.next.prev=ptr.prev;
        }
        ptr=ptr.next;

    }
    return head;
}

// Utility to create a doubly linked list from array
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

// Utility to print a doubly linked list
public static void printList(DoublyListNode head) {
    while (head != null) {
        System.out.print(head.val);
        if (head.next != null) System.out.print(" <-> ");
        head = head.next;
    }
    System.out.println();
}

public static void main(String[] args) {
    // Test Case 1: Delete value from middle
    int[] arr1 = {1, 2, 3, 4, 5};
    DoublyListNode head1 = createList(arr1);
    System.out.println("Test Case 1:");
    System.out.print("Original: ");
    printList(head1);
    System.out.println("Key to delete: 3");
    DoublyListNode result1 = deleteAllOccurrences(head1, 3);
    System.out.print("After Deletion: ");
    printList(result1);
    System.out.println();

    // Test Case 2: Delete all nodes (all are key)
    int[] arr2 = {7, 7, 7};
    DoublyListNode head2 = createList(arr2);
    System.out.println("Test Case 2:");
    System.out.print("Original: ");
    printList(head2);
    System.out.println("Key to delete: 7");
    DoublyListNode result2 = deleteAllOccurrences(head2, 7);
    System.out.print("After Deletion: ");
    printList(result2);
    System.out.println();

    // Test Case 3: Delete head node
    int[] arr3 = {9, 2, 3};
    DoublyListNode head3 = createList(arr3);
    System.out.println("Test Case 3:");
    System.out.print("Original: ");
    printList(head3);
    System.out.println("Key to delete: 9");
    DoublyListNode result3 = deleteAllOccurrences(head3, 9);
    System.out.print("After Deletion: ");
    printList(result3);
    System.out.println();

    // Test Case 4: Delete tail node
    int[] arr4 = {1, 2, 3, 5};
    DoublyListNode head4 = createList(arr4);
    System.out.println("Test Case 4:");
    System.out.print("Original: ");
    printList(head4);
    System.out.println("Key to delete: 5");
    DoublyListNode result4 = deleteAllOccurrences(head4, 5);
    System.out.print("After Deletion: ");
    printList(result4);
    System.out.println();

    // Test Case 5: Key not present
    int[] arr5 = {1, 3, 5};
    DoublyListNode head5 = createList(arr5);
    System.out.println("Test Case 5:");
    System.out.print("Original: ");
    printList(head5);
    System.out.println("Key to delete: 8");
    DoublyListNode result5 = deleteAllOccurrences(head5, 8);
    System.out.print("After Deletion: ");
    printList(result5);
    System.out.println();

    // Test Case 6: Empty list
    int[] arr6 = {};
    DoublyListNode head6 = createList(arr6);
    System.out.println("Test Case 6:");
    System.out.print("Original: ");
    printList(head6);
    System.out.println("Key to delete: 1");
    DoublyListNode result6 = deleteAllOccurrences(head6, 1);
    System.out.print("After Deletion: ");
    printList(result6);
    System.out.println();
        int[] arr7 = {1, 2, 2, 3, 4, 2, 5};
        DoublyListNode head7 = createList(arr7);
        System.out.println("Test Case 7 (Adjacent Duplicates):");
        System.out.print("Original: ");
        printList(head7);
        System.out.println("Key to delete: 2");
        DoublyListNode result7 = deleteAllOccurrences(head7, 2);
        System.out.print("After Deletion: ");
        printList(result7);
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
