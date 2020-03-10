package package0;


public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) { val = x; }
    public ListNode(int[] x) {

        ListNode listNode = new ListNode(0);
        ListNode temp =  listNode;
        for (int a : x) {
            temp.next = new ListNode(a);
            temp = temp.next;
        }
        this.val = listNode.next.val;
        this.next = listNode.next.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode tmp = this;

        while (tmp != null) {
            sb.append(" -> " + tmp.val);
            tmp = tmp.next;
        }
        return sb.toString();
    }

}
