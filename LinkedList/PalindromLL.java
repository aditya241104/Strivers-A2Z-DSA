package LinkedList;

import java.util.Stack;

public class PalindromLL {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // You will implement this
public static boolean isPalindrome(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    ListNode ptr = head;

    // Step 1: Push all values onto the stack
    while (ptr != null) {
        stack.push(ptr.val);
        ptr = ptr.next;
    }

    // Step 2: Compare values while popping from the stack
    ptr = head;
    while (ptr != null) {
        if (ptr.val != stack.pop()) {
            return false;
        }
        ptr = ptr.next;
    }

    return true;
}

    public static void main(String[] args) {
        // Test 1: Palindrome [1 -> 2 -> 2 -> 1]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);
        System.out.println("Test 1 (Expected: true): " + isPalindrome(head1));

        // Test 2: Not a palindrome [1 -> 2 -> 3]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        System.out.println("Test 2 (Expected: false): " + isPalindrome(head2));

        // Test 3: Palindrome [1 -> 2 -> 1]
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(1);
        System.out.println("Test 3 (Expected: true): " + isPalindrome(head3));

        // Test 4: Single node [1]
        ListNode head4 = new ListNode(1);
        System.out.println("Test 4 (Expected: true): " + isPalindrome(head4));

        // Test 5: Empty list
        ListNode head5 = null;
        System.out.println("Test 5 (Expected: true): " + isPalindrome(head5));
    }
}
