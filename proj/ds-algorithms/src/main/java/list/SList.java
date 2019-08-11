package list;

public class SList<T>
{
    private Node<T> head;
    private int length;

    public SList()
    {
        super();
        length = 0;
    }

    public int length()
    {
        return length;
    }

    public synchronized void addFirst(Node<T> temp)
    {
        temp.setNext(head);
        head = temp;
        length++;
    }

    public synchronized void addLast(Node<T> temp)
    {
        if (head == null)
        {
            head = temp;
        }
        else
        {
            Node<T> current = head;
            Node<T> reqNode = current;
            while (current != null)
            {
                current = current.getNext();
                if (current != null)
                {
                    reqNode = current;
                }
            }
            reqNode.setNext(temp);
        }
        length++;
    }

    public synchronized void add(T data, int index)
    {
        Node<T> newNode = new Node<T>(data);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            index = index < 0 ? 0 : index > length ? length : index;
            System.out.println(index);
            if (index == 0)
            {
                newNode.setNext(head);
                head = newNode;
            }
            else
            {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++)
                {
                    current = current.getNext();
                }
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            }
        }
        length++;
    }

    public synchronized Node<T> removeFirst()
    {
        Node<T> removedNode = null;
        if (head != null)
        {
            removedNode = head.getNext();
            head = head.getNext();
            length--;
        }
        return removedNode;
    }

    public synchronized Node<T> removeLast()
    {
        // A
        // A B C

        Node<T> removedNode = null;
        if (head != null)
        {
            Node<T> c = head;
            Node<T> cNext = c.getNext();
            Node<T> p = null;
            if (cNext == null)
            {
                removedNode = head;
                head = null;
            }
            while (cNext != null)
            {
                p = c;
                c = cNext;
                cNext = cNext.getNext();
            }
            removedNode = p.getNext();
            p.setNext(null);
            length--;
        }
        return removedNode;
    }

    public synchronized void remove(Node<T> node)
    {
        // node: B
        // null
        // B
        // A B C D

        if (head == null)
        {
            return;
        }
        if (node.getData().equals(head.getData()))
        {
            head = head.getNext();
            length--;
            return;
        }

        Node<T> c = head;
        Node<T> p = null;
        while (c.getNext() != null)
        {
            p = c;
            c = c.getNext();
            if (node.getData().equals(c.getData()))
            {
                p.setNext(c.getNext());
                length--;
                return;
            }
        }

    }

    public synchronized Node<T> remove(int index)
    {
        // index: 2
        // null
        // B
        // A B C D
        Node<T> removedNode = null;
        if (head == null)
        {
            return removedNode;
        }
        index = index < 0 ? 0 : index > length ? length : index;
        if(index==0)
        {
            removedNode=head;
            head=head.getNext();
        }else
        {
            Node<T> c =head;
            for(int i=1;i<index;i++)
            {
                
            }
        }
        
        length--;
        return removedNode;

    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        Node<T> current = head;
        sb.append("[");
        while (current != null)
        {
            sb.append(current.getData()).append(",");
            current = current.getNext();
        }
        sb.replace(sb.lastIndexOf(","), sb.length(), "");
        sb.append("]").append(", size=" + length);
        return sb.toString();
    }

    public static void main(String[] args)
    {
        SList<Integer> l = new SList<>();
        System.out.println("Initial size of list:" + l.length());
        l.addFirst(new Node<Integer>(100));
        l.addFirst(new Node<Integer>(300));
        l.addFirst(new Node<Integer>(200));
        l.addLast(new Node<Integer>(50));
        l.addLast(new Node<Integer>(55));
        l.add(100, -5);
        System.out.println(l);
        System.out.println("Add at 3 index");
        l.add(150, 3);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.remove(new Node<Integer>(200));
        System.out.println(l);
        l.remove(new Node<Integer>(100));
        System.out.println(l);
        l.remove(new Node<Integer>(50));
        System.out.println(l);
        l.remove(0);
        l.addFirst(new Node<Integer>(100));
        l.addFirst(new Node<Integer>(300));
        l.addFirst(new Node<Integer>(200));
        System.out.println(l);
    }
}
