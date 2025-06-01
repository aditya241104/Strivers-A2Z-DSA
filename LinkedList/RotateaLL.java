package LinkedList;

public class RotateaLL {

    // Function to be implemented later
    public static ListNode rotateRight(ListNode head, int k) {
        if(k==0){
            return head;
        }
        if(head==null){
            return null;
        }
        ListNode ptr=head;
        int length=1;
        while(ptr.next!=null){
            ptr=ptr.next;
            length++;
        }
        ListNode last=ptr;
 
        int newIndex=length - (k % length);
        if(newIndex==length){
            return head;
        }
        ptr=head;
        length=1;
        while(length!=newIndex){
            ptr=ptr.next;
            length++;
        }
        ListNode newHead=ptr.next;
        ptr.next=null;
        last.next=head;
        return newHead;
    }

    // Utility to create a linked list from array
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
        // Test Case 1: Rotate by 2
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(arr1);
        System.out.println("Test Case 1:");
        System.out.print("Original: ");
        printList(head1);
        System.out.println("Rotate by: 2");
        ListNode result1 = rotateRight(head1, 2);
        System.out.print("After Rotation: ");
        printList(result1);
        System.out.println();

        // Test Case 2: Rotate by 0 (should be same list)
        int[] arr2 = {10, 20, 30};
        ListNode head2 = createList(arr2);
        System.out.println("Test Case 2:");
        System.out.print("Original: ");
        printList(head2);
        System.out.println("Rotate by: 0");
        ListNode result2 = rotateRight(head2, 0);
        System.out.print("After Rotation: ");
        printList(result2);
        System.out.println();

        // Test Case 3: Rotate by length of list (should be same list)
        int[] arr3 = {1, 2, 3};
        ListNode head3 = createList(arr3);
        System.out.println("Test Case 3:");
        System.out.print("Original: ");
        printList(head3);
        System.out.println("Rotate by: 3");
        ListNode result3 = rotateRight(head3, 3);
        System.out.print("After Rotation: ");
        printList(result3);
        System.out.println();

        // Test Case 4: Empty list
        int[] arr4 = {};
        ListNode head4 = createList(arr4);
        System.out.println("Test Case 4:");
        System.out.print("Original: ");
        printList(head4);
        System.out.println("Rotate by: 1");
        ListNode result4 = rotateRight(head4, 1);
        System.out.print("After Rotation: ");
        printList(result4);
        System.out.println();

        // Test Case 5: Rotate by 1
        int[] arr5 = {9, 8, 7, 6};
        ListNode head5 = createList(arr5);
        System.out.println("Test Case 5:");
        System.out.print("Original: ");
        printList(head5);
        System.out.println("Rotate by: 1");
        ListNode result5 = rotateRight(head5, 1);
        System.out.print("After Rotation: ");
        printList(result5);
        System.out.println();
            int[] arr6 = {1, 2, 3, 4, 5};
    ListNode head6 = createList(arr6);
    System.out.println("Test Case 6:");
    System.out.print("Original: ");
    printList(head6);
    System.out.println("Rotate by: 7");
    ListNode result6 = rotateRight(head6, 7);  // 7 % 5 = 2 rotation expected
    System.out.print("After Rotation: ");
    printList(result6);
    System.out.println();

    // Test Case 7: Rotate single node list
    int[] arr7 = {100};
    ListNode head7 = createList(arr7);
    System.out.println("Test Case 7:");
    System.out.print("Original: ");
    printList(head7);
    System.out.println("Rotate by: 3");
    ListNode result7 = rotateRight(head7, 3);
    System.out.print("After Rotation: ");
    printList(result7);
    System.out.println();

    // Test Case 8: Rotate by length - 1
    int[] arr8 = {1, 2, 3, 4};
    ListNode head8 = createList(arr8);
    System.out.println("Test Case 8:");
    System.out.print("Original: ");
    printList(head8);
    System.out.println("Rotate by: 3");
    ListNode result8 = rotateRight(head8, 3);
    System.out.print("After Rotation: ");
    printList(result8);
    System.out.println();

    // Test Case 9: Rotate by length + 1
    int[] arr9 = {10, 20, 30, 40};
    ListNode head9 = createList(arr9);
    System.out.println("Test Case 9:");
    System.out.print("Original: ");
    printList(head9);
    System.out.println("Rotate by: 5");
    ListNode result9 = rotateRight(head9, 5); // 5 % 4 = 1 rotation expected
    System.out.print("After Rotation: ");
    printList(result9);
    System.out.println();

    // Test Case 10: Rotate empty list by 0
    int[] arr10 = {};
    ListNode head10 = createList(arr10);
    System.out.println("Test Case 10:");
    System.out.print("Original: ");
    printList(head10);
    System.out.println("Rotate by: 0");
    ListNode result10 = rotateRight(head10, 0);
    System.out.print("After Rotation: ");
    printList(result10);
    System.out.println();

    // Test Case 11: Rotate by 1 in a two-element list
    int[] arr11 = {1, 2};
    ListNode head11 = createList(arr11);
    System.out.println("Test Case 11:");
    System.out.print("Original: ");
    printList(head11);
    System.out.println("Rotate by: 1");
    ListNode result11 = rotateRight(head11, 1);
    System.out.print("After Rotation: ");
    printList(result11);
    System.out.println();

    // Test Case 12: Rotate by 0 in a single-element list
    int[] arr12 = {42};
    ListNode head12 = createList(arr12);
    System.out.println("Test Case 12:");
    System.out.print("Original: ");
    printList(head12);
    System.out.println("Rotate by: 0");
    ListNode result12 = rotateRight(head12, 0);
    System.out.print("After Rotation: ");
    printList(result12);
    System.out.println();

    // Test Case 13: Rotate by length in a large list
    int[] arr13 = new int[10];
    for(int i=0; i<10; i++) arr13[i] = i+1;
    ListNode head13 = createList(arr13);
    System.out.println("Test Case 13:");
    System.out.print("Original: ");
    printList(head13);
    System.out.println("Rotate by: 10");
    ListNode result13 = rotateRight(head13, 10);
    System.out.print("After Rotation: ");
    printList(result13);
    System.out.println();

    // Test Case 14: Rotate by 4 in a 5-element list
    int[] arr14 = {5, 10, 15, 20, 25};
    ListNode head14 = createList(arr14);
    System.out.println("Test Case 14:");
    System.out.print("Original: ");
    printList(head14);
    System.out.println("Rotate by: 4");
    ListNode result14 = rotateRight(head14, 4);
    System.out.print("After Rotation: ");
    printList(result14);
    System.out.println();

    // Test Case 15: Rotate by very large k value
    int[] arr15 = {1, 2, 3, 4, 5};
    ListNode head15 = createList(arr15);
    System.out.println("Test Case 15:");
    System.out.print("Original: ");
    printList(head15);
    System.out.println("Rotate by: 1000000007");
    ListNode result15 = rotateRight(head15, 1000000007); // rotation by 1000000007 % 5 = 2 expected
    System.out.print("After Rotation: ");
    printList(result15);
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