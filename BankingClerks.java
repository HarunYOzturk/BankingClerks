import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        customer c = new customer(5,2);
        customer c2 = new customer(7,5);
        customer c3= new customer(8,2);
        customer c4= new customer(2,2);


        PriorityQueue<customer> p = new PriorityQueue<>();
        PriorityQueue<customer> p2 = new PriorityQueue<>();
        p2.add(c);
        p2.add(c2);
        p2.add(c3);
        p2.add(c4);

        p.add(c);
        p.add(c2);
        p.add(c3);
        p.add(c4);

        int low = 1;
        int high = p.size();

        int maxWaiting = 5;


        while(low <= high){
            int clerks = (low+high)/2;
            PriorityQueue<customer> que = p;
            PriorityQueue<Integer> employees =  new PriorityQueue<>();

            for(int i = 0; i < clerks; i++){
                employees.add(0);

            }
        }

    }
}
