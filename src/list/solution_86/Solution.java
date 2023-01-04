package list.solution_86;


public class Solution {

    public ListNode partition(ListNode head, int x) {
        var lessThanX = new ListNode();
        var greaterThanX = new ListNode();
        var l = lessThanX;
        var r = greaterThanX;
        while(head != null){
            if(head.val >= x ){
                greaterThanX.next = head;
                greaterThanX = greaterThanX.next;
            }else{
                lessThanX.next = head;
                lessThanX = lessThanX.next;
            }
            head = head.next;
        }
        greaterThanX.next = null;
        lessThanX.next = r.next;

        return l.next;
    }
}
