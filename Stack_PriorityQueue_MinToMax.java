public class Stack_PriorityQueue_MinToMax extends Stack_PriorityQueue{
    @Override
    public void add(int data){
        if(stack.size()==0){
            stack.push(data);
            return ;
        }
        if(stack.peek()>data){
            stack.push(data);
            return ;
        }
        int x=stack.pop();
        add(data);
        stack.push(x);

    }
    public static void main(String args[]){
        Stack_PriorityQueue_MinToMax pq=new Stack_PriorityQueue_MinToMax();
        pq.add(6);
        pq.add(25);
        pq.add(10);
        pq.add(15);
        pq.add(13);
        pq.add(50);
        System.out.println("Size :" +pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
