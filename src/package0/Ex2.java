package package0;

public class Ex2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode res = l;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int n1 = l1!=null? l1.val:0;
            int n2 = l2!=null? l2.val:0;
            l1 = l1!=null? l1.next:null;
            l2 = l2!=null? l2.next:null;
            int sum = (n1+n2+carry) % 10;
            carry = (n1+n2+carry) / 10;
            l.next = new ListNode(sum);
            l = l.next;
        }
        return res.next;
    }
}
