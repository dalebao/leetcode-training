package No146LruCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LRUCache {

    Queue<Integer> queue;
    HashMap<Integer, Integer> map;
    int capacity;
    int size = 0;

    public LRUCache(int capacity) {
        this.queue = new LinkedList<>();
        this.map = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key);
        queue.remove(key);
        queue.add(key);

        return val;
    }

    public void put(int key, int value) {
        if (queue.contains(key)){
            queue.remove(key);
            queue.add(key);
            map.put(key,value);
        }else{
            queue.add(key);
            map.put(key, value);
            size++;
            if (size > capacity) {
                map.remove(queue.poll());
                size--;
            }
        }

    }
}
