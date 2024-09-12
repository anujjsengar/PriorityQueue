import java.util.*;
public abstract class PriorityQueueUsingArrayList{
    ArrayList<Integer> list=new ArrayList<>();
    public int size(){
        return list.size();
    }
    public abstract void add(int data);
    public abstract int poll();
}