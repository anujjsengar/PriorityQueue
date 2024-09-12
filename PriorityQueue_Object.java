import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueue_Object {
    public static class Student implements Comparable<Student>{
        String name;
        String partner;
        public Student(String name,String partner){
            this.name=name;
            this.partner=partner;
        }
        public int compareTo(Student st){
            return this.name.compareTo(st.name);
        }
    }
    public static void main(String args[]){
        //Alphabetically Ascending Order
        System.out.println("        Alphabetically Ascending Order");
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("Lovely","Anuj"));
        pq.add(new Student("Kush","Khushi"));
        pq.add(new Student("Deepak","Bharti"));
        pq.add(new Student("Anuj","Lovely"));
        pq.add(new Student("Bharti","Deepak"));
        pq.add(new Student("Dev", ""));
        System.out.println(pq.peek().name+" --> "+pq.peek().partner);
        System.out.println();
        while(!pq.isEmpty()){
            Student obj=pq.poll();
            System.out.println(obj.name+" --> "+obj.partner);
        }
        System.out.println();
        System.out.println("        Alphabetically Descending Order");
        PriorityQueue<Student> pq_=new PriorityQueue<>(Comparator.reverseOrder());
        pq_.add(new Student("Lovely","Anuj"));
        pq_.add(new Student("Kush","Khushi"));
        pq_.add(new Student("Deepak","Bharti"));
        pq_.add(new Student("Anuj","Lovely"));
        pq_.add(new Student("Bharti","Deepak"));
        pq_.add(new Student("Dev", ""));
        
        System.out.println(pq_.peek().name+" --> "+pq_.peek().partner);
        System.out.println();
        while(!pq_.isEmpty()){
            Student obj_=pq_.poll();
            System.out.println(obj_.name+" --> "+obj_.partner);
        }

    }
}
