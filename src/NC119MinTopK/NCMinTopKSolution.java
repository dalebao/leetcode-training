package NC119MinTopK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NCMinTopKSolution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (queue.size() < k) {
                queue.offer(input[i]);
            } else if (queue.peek() != null && queue.peek() > input[k]) {
                queue.poll();
                queue.offer(input[k]);
            }

        }

        return new ArrayList<>(queue);
    }
}
