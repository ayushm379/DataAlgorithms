public class Lc206 {
    private static ListNode solution(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode q = p.next;
        ListNode r = q.next;

        p.next = null;
        while (q != null) {
            q.next = p;
            p = q;
            q = r;
            if (r != null) {
                r = r.next;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode l1 = CodeUtils.createLinkedList(new int[] { 1, 2, 3, 4 });
        ListNode l2 = solution(l1);
        l2.print();
    }
}
