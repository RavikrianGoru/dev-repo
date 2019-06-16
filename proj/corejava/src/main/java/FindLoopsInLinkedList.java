import org.apache.commons.lang.StringUtils;

class SingleLList
{
    private Node start;

    public void add(Integer data)
    {
        Node node = new Node(data);
        if (start == null)
        {
            start = node;
        }
        else
        {
            Node temp = start;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Node getStart()
    {
        return start;
    }

    static class Node
    {
        private Integer data;
        private Node next;

        public Node(Integer data)
        {
            this.data = data;
        }

        public Integer getData()
        {
            return data;
        }

        public void setData(Integer data)
        {
            this.data = data;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }
}

public class FindLoopsInLinkedList
{

    public static void main(String[] args)
    {
        FindLoopsInLinkedList obj = new FindLoopsInLinkedList();
        SingleLList sll = new SingleLList();
        for (int i = 0; i < 10; i++)
        {
            sll.add(i);
        }
        System.out.println("Loop Existence : " + obj.doesLoopExist(sll));
        System.out.println("Loop Existence : " + obj.doesLoopExist(obj.createLoop(sll)));
    }

    public boolean doesLoopExist(SingleLList listToCheck)
    {
        SingleLList.Node tortoise = listToCheck.getStart();
        SingleLList.Node hare = listToCheck.getStart();

        try
        {
            while (true)
            {
                tortoise = tortoise.getNext();
                hare = hare.getNext().getNext();
                if (tortoise == hare)
                {
                    return true;
                }
            }
        }
        catch (NullPointerException ne)
        {
            return false;
        }
    }

    private SingleLList createLoop(SingleLList sampleList)
    {
        sampleList.getStart().getNext().getNext().getNext().setNext(sampleList.getStart().getNext());
        return sampleList;
    }
}
