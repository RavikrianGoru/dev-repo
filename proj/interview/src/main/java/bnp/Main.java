package bnp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main
{
    private static void process(char[] eachNoArr)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char each : eachNoArr)
        {
            Integer temp = hm.get(each);
            if(temp==null)
            {
                hm.put(each, 1);
            }else
            {
               hm.put(each, temp+1);
               if(temp==3)
               {
                   System.out.println("yes");
                   return;
               }
            }
        }
        System.out.println("no");

    }

    private static void process(String[] arr)
    {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
        {
            char[] eachNo = arr[i].toCharArray();
//            System.out.println(eachNo);
            boolean flag = false;
            for (int j = 2; j < eachNo.length; j++)
            {
                if (eachNo[j] == eachNo[j - 1] && eachNo[j] == eachNo[j - 2])
                {
                    flag = true;
                }
            }

            if (flag)
            {
                System.out.println("yes");
                continue;
            }

            process(eachNo);

        }
    }

    // you do not need to edit any code below this line
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[4];
        arr[0] = "9949776210";
        arr[1] = "9995665885";
        arr[2] = "8392780188";
        arr[3] = "8392780178";

        process(arr);
    }
}
