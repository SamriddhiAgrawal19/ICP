package Day2;

import java.util.PriorityQueue;

public class kth_largest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            while(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

}
//sc=>O(k)
//because of priority queue of size k
//tc=>O(n.log k)
//doing push and pop operation in heap of size k for the array of size n
