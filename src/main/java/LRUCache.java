import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.HashMap;
import java.util.Optional;

public class LRUCache {

    private HashMap<String, CacheNode> cache;
    private int cacheSize;
    private CacheNode head;
    private CacheNode tail;

    public LRUCache(int size) {
        this.cacheSize = size;
        head = null;
        tail = null;
        cache = new HashMap<>();
    }

    public void addItem(String key, String value) {
        if (key == null) throw new IllegalArgumentException("Key cannot be null");
        if (cache.size() == cacheSize) {
            // cache full, get first node after head, remove that node, remove key from hashmap
        }
        CacheNode node = new CacheNode(key, value);
        node.setPrev(tail);
        tail.setNext(node);
        tail = node;
        //what if tail is null? have to set head as well in that case

        cache.put(key, node);
    }

    public Optional<String> getItem(String key) {
        if (key == null) throw new IllegalArgumentException("Key cannot be null");
        // if key does not exist on hm, return absent
        // if key exists, get node and get value return
        // also need to move node to end of list

        return Optional.empty();

    }


}
