public class Node implements Cloneable {
    Node next;
    Node last;
    Object data;
    public Node()
    {
        data = null;
        next = null;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
    public Node getLastPtr()
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
