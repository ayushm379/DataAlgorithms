public class Lc141 {
    private static boolean solution(ListNode node) {
        if(node == null || node.next == null)
        return false;
        ListNode slow = node, fast = node;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode list1 = CodeUtils.createLinkedList(new int[]{3,2,0,-4});
        // creating cycle
        list1.next.next.next.next = list1.next;
        System.out.println(solution(list1));
    }
}
