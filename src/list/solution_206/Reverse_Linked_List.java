package list.solution_206;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class Reverse_Linked_List {

    public ListNode reverseList(ListNode head) {

//        while(head!=null){
//
//
//            head = head.next;
//        }

//        if(head == null){
//            return null;
//        }else{
//
//        }
        ListNode listNode = null;

        ListNode listNode1 = reverseList2(head, listNode);

        return null;
    }


    public ListNode reverseList2(ListNode head,ListNode reserved){

        if(head == null){
            return reserved;
        }
       return reverseList2(head.next, new ListNode(head.val,reserved));
    }



    public static void main(String[] args) {

        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode14 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode14;

        Reverse_Linked_List reverseLinkedList = new Reverse_Linked_List();
        reverseLinkedList.reverseList(listNode11);
    }
}
