package LinkedList;



public class Sort012LinkedListTest {
        public static void main(String[] args) {
        ListNode head = null;

        // Add test data (you can modify or shuffle this list)
        int[] data = {2, 1, 0, 1, 2, 0, 1};
        for (int val : data) {
            head = addNode(head, val);
        }

        System.out.println("Original List:");
        printList(head);

        // Sort and print the result
        head = sortList(head);

        System.out.println("Sorted List:");
        printList(head);
    }
    // You will implement this
    public static ListNode sortList(ListNode head) {
        ListNode ptr=head;
        ListNode zeroHead,oneHead,TwoHead;
        ListNode zeros=new ListNode(0),ones=new ListNode(0),twos=new ListNode(0);
        zeroHead=zeros;
        oneHead=ones;
        TwoHead=twos;
        while(ptr!=null){
            if(ptr.val==0){
                zeros.next=ptr;
                zeros=zeros.next;
                
            }
            else if(ptr.val==1){
                ones.next=ptr;
                ones=ones.next;
            }
            else if(ptr.val==2){
                twos.next=ptr;
                twos=twos.next;
            }
            ptr=ptr.next;
        }
        ListNode h=zeroHead.next;
        zeros.next=oneHead.next;
        ones.next=TwoHead.next;
        twos.next=null;
        return h;
   
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper function to add a new node at the end
    public static ListNode addNode(ListNode head, int val) {
        if (head == null) return new ListNode(val);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        return head;
    }


}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}