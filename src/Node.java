public class Node {
    Node next;
    Node last;
    Object data;
    public Node()
    {
        data = null;
        next = null;
    }
    public Node(Object data)
    {
        next = null;
        this.data = data;
    }

    public Object get() {
        return data;
    }
    public void set(String data)
    {
        this.data = data;
    }
    public Node getNextPtr()
    {
        return next;
    }
    public void setNextPtr(Node node)
    {
        this.next = node;
    }
    public Node getLastptr()
    {
        return last;
    }
    public void setLastPtr(Node node)
    {
        this.last = node;
    }
    @Override
    public String toString()
    {

        return data.toString();
    }
}
