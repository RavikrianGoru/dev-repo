package dbs;

import java.util.HashMap;
import java.util.Map;

public class FindBiggestRepeatedElement
{

    public static void main(String[] args)
    {
        int[] ary =
        { 1, 5, 4, 2, 3, 2, 4, 5, 5, 2 , 6, 4 ,4, 5};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < ary.length; i++)
        {
            hm.put(ary[i], hm.get(ary[i]) == null ? 0 : hm.get(ary[i]) + 1);
        }
        int tempKey=0;
        int tempValue=0;
        for (Map.Entry<Integer, Integer> each : hm.entrySet())
        {
            if(each.getValue()>=tempValue && each.getKey()>=tempKey)
            {
                tempKey=each.getKey();
                tempValue=each.getValue();
            }
        }
        System.out.println(tempKey); 
    }



}
