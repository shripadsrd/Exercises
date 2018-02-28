public class CacheNode {

    private String key;
    private String value;
    private CacheNode next;
    private CacheNode prev;

    public CacheNode(final String key, final String value) {
        this.value = value;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public CacheNode getNext() {
        return next;
    }

    public void setNext(final CacheNode next) {
        this.next = next;
    }

    public CacheNode getPrev() {
        return prev;
    }

    public void setPrev(final CacheNode prev) {
        this.prev = prev;
    }
}
