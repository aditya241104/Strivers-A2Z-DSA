package LinkedList;

public class MergeSortLL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // Your existing sorting logic using PriorityQueue
    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;

        }
        return mergeSort(head, ptr);

    }
    public static ListNode mergeSort(ListNode start,ListNode end){
        if (start == null || start == end) return start;
        ListNode mid=getMiddle(start);
        ListNode temp=mid.next;
        mid.next=null;
        ListNode left = mergeSort(start, mid);
        ListNode right = mergeSort(temp, end);
        return merge(left, right);
    }
    public static ListNode merge(ListNode start,ListNode mid){
        ListNode i=start;
        ListNode j=mid;
        ListNode head;
        ListNode k=new ListNode(0);
        head=k;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        while(i!=null){
                k.next=i;
                i=i.next;
                k=k.next;
        }
        while(j!=null){
                k.next=j;
                j=j.next;
                k=k.next;
        }

        return head.next;
    }
    private static ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test 1: Random order
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(3);

        System.out.print("Original: ");
        printList(head1);
        ListNode sorted1 = sortList(head1);
        System.out.print("Sorted:   ");
        printList(sorted1);

        // Test 2: Already sorted
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.print("Original: ");
        printList(head2);
        ListNode sorted2 = sortList(head2);
        System.out.print("Sorted:   ");
        printList(sorted2);

        // Test 3: Reverse sorted
        ListNode head3 = new ListNode(5);
        head3.next = new ListNode(4);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(2);
        head3.next.next.next.next = new ListNode(1);

        System.out.print("Original: ");
        printList(head3);
        ListNode sorted3 = sortList(head3);
        System.out.print("Sorted:   ");
        printList(sorted3);

        // Test 4: Duplicates
        ListNode head4 = new ListNode(2);
        head4.next = new ListNode(3);
        head4.next.next = new ListNode(2);
        head4.next.next.next = new ListNode(1);

        System.out.print("Original: ");
        printList(head4);
        ListNode sorted4 = sortList(head4);
        System.out.print("Sorted:   ");
        printList(sorted4);

        // Test 5: Single node
        ListNode head5 = new ListNode(10);
        System.out.print("Original: ");
        printList(head5);
        ListNode sorted5 = sortList(head5);
        System.out.print("Sorted:   ");
        printList(sorted5);

        // Test 6: Empty list
        ListNode head6 = null;
        System.out.print("Original: ");
        printList(head6);
        ListNode sorted6 = sortList(head6);
        System.out.print("Sorted:   ");
        printList(sorted6);
    }
}
