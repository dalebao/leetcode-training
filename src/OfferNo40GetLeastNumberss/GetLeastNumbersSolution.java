package OfferNo40GetLeastNumberss;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbersSolution {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        if (arr.length == 0) {
            return res;
        }
        // 最小用大顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            if (queue.size() < k) {
                queue.add(arr[i]);
            } else if (arr[i] < queue.peek()) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
