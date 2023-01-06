package list.solution_19;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //find it
        ListNode target  = head;
        ListNode nextNNode  = head;
        for(int i = 0;i<n;i++){
            if(nextNNode.next!=null){
                nextNNode = nextNNode.next;
            }else{
                nextNNode = head;
            }
        }

        if(nextNNode.equals(target)){
            return target.next;
        }

        while( nextNNode.next != null){
            nextNNode = nextNNode.next;
            target = target.next;
        }

        var removed = target.next;
        if(removed == null){
            return null;
        }
        if( removed.next == null){
            target.next = null;
            return head;
        }

        if(removed != null && removed.next != null){
            target.next = removed.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        new Solution().removeNthFromEnd(listNode,2);
    }
}
