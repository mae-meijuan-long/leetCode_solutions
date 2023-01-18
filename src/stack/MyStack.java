package stack;


/**
 * implements an stack based on linkedList data structure
 */
public class MyStack<T> {
    class StackNode{
        private T val;
        private StackNode next;

        StackNode(T val){
            this.val = val;
            this.next = null;
        }
    }
    private StackNode top;
    T peek(){
        return top.val;
    }

    public void push(T val){
        StackNode stackNode = new StackNode(val);
        top.next = stackNode;
        stackNode.next = top.next;
    }

    public T pop(){
        T topVal = top.val;
        top = top.next;
        return topVal;
    }

}
