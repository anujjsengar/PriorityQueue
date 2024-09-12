import java.util.*;
public class PriorityQueueUsingArrayListMaxToMin extends PriorityQueueUsingArrayList{
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
        int x=list.get(list.size()-1);
        list.remove(list.size()-1);
        return x;
    }
    public static void main(String args[]){
        PriorityQueueUsingArrayListMaxToMin obj=new PriorityQueueUsingArrayListMaxToMin();
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
