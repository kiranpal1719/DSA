class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode P1 = null;
        ListNode P2 = null;
        ListNode temp = head;
        while(temp != null){
            if(P2 != null){
                P2 = P2.next;
            }
            k--;
            if(k == 0){
                P1 = temp;
                P2 = head;
            }
            temp = temp.next;
        }
        int swap = P1.val;
        P1.val = P2.val;
        P2.val = swap;
        return head;
    }
}