public abstract class PriorityQueueUsingArray{
        int max;
        int[] arr;
        int size;
        public PriorityQueueUsingArray(){
            max=10;
            arr=new int[max];
            size=0;
        }
    public abstract void add(int val);
    public int poll(){
        if(size==0){
            System.out.println("Empty!");
            return -1;
        }
        int x=arr[0];
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        return x;
    }
}