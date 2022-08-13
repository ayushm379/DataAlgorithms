public class Lc2 {

    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode temp = l3;

        int carry = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            temp.next = new ListNode(sum);

            l1 = l1.next;   
            l2 = l2.next;
            temp = temp.next;
        }

        if(l2 != null) {
            l1 = l2;
        }

        while(l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            temp.next = new ListNode(sum);

            l1 = l1.next;
            temp = temp.next;
        }

        if(carry == 1) {
            temp.next = new ListNode(carry);
        }

        return l3.next;
    }

    public static void main(String[] args) {
        ListNode list1 = CodeUtils.createLinkedList(new int[]{2, 4, 3, 9});
        ListNode list2 = CodeUtils.createLinkedList(new int[]{5, 6, 7});
        ListNode sol = solution(list1, list2);
        sol.print();
    }
}
