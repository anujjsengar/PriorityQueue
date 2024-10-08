import java.util.*;
public class PriorityQueueUsingArrayListMinToMax extends PriorityQueueUsingArrayList{
    @Override
    public void add(int data){
        list.add(data);
        Collections.sort(list);
    }
    @Override
    public int poll(){
        if(list.size()==0){
        System.out.println("Empty !");
        return -1;
        }
        int i=list.get(0);
        list.remove(0);
        return i;
    }
    public static void main(String args[]){
        PriorityQueueUsingArrayListMinToMax obj=new PriorityQueueUsingArrayListMinToMax();
        obj.add(12);
        obj.add(10);
        obj.add(12);
        obj.add(24);
        obj.add(23);
        obj.add(4);
        obj.add(5);
        System.out.println(obj.size());
        System.out.println(obj.poll());
        System.out.println(obj.poll());
        System.out.println(obj.poll());
        System.out.println(obj.poll());
        System.out.println(obj.poll());
        System.out.println(obj.poll());
        System.out.println(obj.poll());
    }
}
