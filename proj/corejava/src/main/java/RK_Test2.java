import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RK_Test2
{
    public static void main(String[] args) throws InterruptedException
    {
        tripletCampare();
    }

    public static void tripletCampare()
    {
        String str1 = "1 2 4 2 6 4 9 23 1 5 ";
        String str2 = "5 2 4 3 3 4 3 20 5 5 ";

        List<Integer> list1 = Stream.of(str1.replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Stream.of(str2.replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(list2);

        Integer s1 = 0;
        Integer s2 = 0;
        for (int i = 0; i < list1.size(); i++)
        {
            if (list1.get(i) < list2.get(i))
            {
                s2 += 1;
            }
            else if (list1.get(i) > list2.get(i))
            {
                s1 += 1;
            }
        }
        ArrayList al = new ArrayList<Integer>();
        al.add(s1);
        al.add(s2);
        System.out.println(al);
    }

}
