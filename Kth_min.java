import java.util.*;

public class Kth_min {
   
    public static void main(String[] args){

        int[] arr = {7,10,4,3,20,15};
        int k = 4;
        int size = arr.length;

        // Apply max heap bcoz we want smallest element
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i = 0; i< size; i++){
            pq.add(arr[i]);

            if(pq.size() > k){
                pq.remove();
            }
        }

        System.out.println(pq.peek());

    }
}
