import java.util.*;

public class Kth_max {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 2;
        int size = arr.length;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i< size; i++){
            pq.add(arr[i]);

            if(pq.size() > k){
                pq.remove();
            }
        }

        System.out.println(pq.peek());

    }
}
