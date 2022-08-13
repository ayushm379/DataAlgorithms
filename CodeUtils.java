

public class CodeUtils {
    
    public static ListNode createLinkedList(int[] nums) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int index = 0;
        while(index < nums.length) {
            temp.next = new ListNode(nums[index++]);
            temp = temp.next; 
        }
        return head.next;
    }

}
