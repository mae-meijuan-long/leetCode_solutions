package list.solution_21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        var p = dummy;
        while(list1.next != null && list2.next != null){
            if(list1.val<=list2.val){
                dummy.val = list1.val;
                dummy.next = list1;
                list1 = list1.next;
            }else{
                dummy.val = list2.val;
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        dummy.next = null;

        while(p.next != null){

            System.out.println(p.next.val);
            p = p.next;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode14 = new ListNode(4);
        ListNode listNode21 = new ListNode(1);
        ListNode listNode23 = new ListNode(3);
        ListNode listNode24 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode14;
        listNode21.next = listNode23;
        listNode23.next = listNode24;
        solution.mergeTwoLists(listNode11,listNode21);
    }
}
