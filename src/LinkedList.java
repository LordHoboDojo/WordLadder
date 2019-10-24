public class LinkedList implements Cloneable {
    Node head;
    Node tail;
    int count;
    public LinkedList()
    {
        tail = null;
        head = null;
        count =0;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @SuppressWarnings("Duplicates")
    public Node getHead() {
        return head;
    }
    @SuppressWarnings("Duplicates")
    public void addFront(Object object)
    {
        if (count==0)
        {
            head = new Node(object);
            tail = head;
            count++;
            return;
        }
        Node temp = head;
        head = new Node(object);
        head.setNextPtr(temp);
        temp.setLastPtr(head);
        count++;

    }
    @SuppressWarnings("Duplicates")
    public void addBack(Object object)
    {
        if (count==0)
        {
            head = new Node(object);
            tail = head;
            count++;
            return;
        }
        Node temp = tail;
        tail = new Node(object);
        tail.setNextPtr(temp);
        temp.setLastPtr(tail);
        count++;


    }
    public Object removeFront()
    {

        Object dat = head.get();
        head = head.getLastptr();
        count--;
        return dat;
    }
    public Object peekFront()
    {
        return head.get();
    }
    public Object get(int index){
        if (index < 0) return null;
        Node current;
        current = head;
        for (int i = 0; i < index; i++) {
             if (current == null) return null;
                current = current.getNextPtr();
            }
        return current.get();

    }
    public int size()
    {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("LinkedList{");
        Node current = head;
        while (current!=null)
        {
            res.append(current).append(",");
            current = current.getNextPtr();
        }
        return res +"}";
    }
}
