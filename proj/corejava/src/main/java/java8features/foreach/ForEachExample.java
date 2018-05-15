package java8features.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
public class ForEachExample
{
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args)
    {
        //forEach method can be used instead of Iterator
        insert();
        printList();
        dispListIterator();
        dispForEachMethod1();
        dispForEachMethod2();
    }

    public static void dispForEachMethod2()
    {
        System.out.println("Display list elements by myConsumer obj which  implements Consumer");
        MyConsumer action=new MyConsumer();
        list.forEach(action);
    }

    public static void dispForEachMethod1()
    {
        System.out.println("Display list elements by list.forEach(new Consumer{...});)");
        list.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t)
            {
                System.out.println(t);
            }
            
        });
    }

    public static void dispListIterator()
    {
        Iterator<Integer> itr=list.iterator();
        System.out.println("Display list elements by Iterator-while:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    public static void printList()
    {
        System.out.println("EntireList:"+list);
    }

    public static void insert()
    {
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(60);
    }

}
class MyConsumer implements Consumer<Integer>
{
    @Override
    public void accept(Integer t)
    {
        System.out.println(t);
    }
    
}