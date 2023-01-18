package stack;

/**
 * 自己实现一个栈
 */
public class MyStatck2<T> {
    private StackNode<T> top;

    class StackNode<T>{
        private T val;
        private StackNode<T> next;

        StackNode(T val){
            this.val = val;
            this.next = null;
        }
    }

    public void push(T t){
      if(top == null) return;

      StackNode newNode = new StackNode<T>(t);
      newNode.next = top.next;
      top.next = newNode;
    }

    public T peek(){
        if(top == null){
            return null;
        }
        return top.val;
    }

    public T pop(){
        if(top == null) return null;
        top = top.next;
        return top.val;
    }


}
