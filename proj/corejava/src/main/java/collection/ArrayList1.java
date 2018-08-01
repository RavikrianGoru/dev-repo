package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1
{

    public static void main(String[] args)
    {

        ArrayList<String> al = new ArrayList<String>();
        al.add("ravi");
        al.add("ravi1");
        al.add("ravi2");
        al.add("ravi3");
        al.add("ravi4");
        al.add("ravi5");
        al.add("ravi6");
        System.out.println(al);

        // delete ravi5

        /*
         * //way-1 if(al.contains("ravi5")) al.remove("ravi5");
         */

        /*
         * //way-2 Iterator<String> itr=al.iterator(); while(itr.hasNext()) { if(itr.next().equals("ravi5")) { al.remove("ravi1");//why it is not
         * throwing CME? } }
         */

        // way-3
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext())
        {
            if ("ravi5".equals(litr.next()))
            {
                // litr.remove();
                litr.set("KIRAN");
                litr.add("kiran");
                al.remove("ravi5");// why it is not throwing CME?
            }

        }

        System.out.println(al);

    }

}
