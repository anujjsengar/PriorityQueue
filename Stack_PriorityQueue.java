import java.util.Stack;

public abstract class Stack_PriorityQueue {
    Stack<Integer> stack=new Stack<>();
    public abstract void add(int data);
    public int poll(){
        return stack.pop();
    }
    public int size(){
        return stack.size();
    }
}
