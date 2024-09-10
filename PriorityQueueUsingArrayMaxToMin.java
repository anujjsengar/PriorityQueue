public class PriorityQueueUsingArrayMaxToMin extends PriorityQueueUsingArray{
    @Override
    public void add(int val){
        if(size==0){
            arr[size++]=val;
            return ;
        }
        if(size==max){
            System.out.println("Cannot Add Mode Size Overflow");
            return ;
        }
        int i;
        arr[size++]=val;
        for(i=size-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            else{
                break;
            }
        }
    }
    public static void main(String args[]){
        PriorityQueueUsingArrayMaxToMin pq=new PriorityQueueUsingArrayMaxToMin();
        pq.add(6);
        pq.add(25);
        pq.add(10);
        pq.add(15);
        pq.add(13);
        pq.add(50);
        System.out.println(pq.size);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
