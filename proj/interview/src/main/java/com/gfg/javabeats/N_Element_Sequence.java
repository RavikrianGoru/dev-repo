package com.gfg.javabeats;

import java.util.HashMap;
import java.util.TreeMap;

public class N_Element_Sequence
{

    static TreeMap<Integer, HashMap<String, Integer>> map = new TreeMap();

    public static void main(String[] args)
    {
        int[] a =
        { 1, 2, 3, 4, 5, 7, 8, 9, 20, 24, 26, 29, 1, 2, 3, 5, 6, 7, 3, 4, 5, 6, 10, 11, 12, 13, 15, 16, 17, 26, 34, 42, 50, 1, 2, 3, 7, 8, 9 };
        Integer seq = 2;
        int initIndex = 0;
        int lastIndex = 0;
        int initDiff = a[1] - a[0];
        int secLastIndex = a.length - 2;
        for (int i = 1; i <= secLastIndex; i++)
        {
            if (a[i] - a[i - 1] == a[i + 1] - a[i])
            {
                seq++;
                if (i == secLastIndex)
                {
                    updateMap(a, initIndex, i + 1, seq);
                }
            }
            else
            {
                if (seq >= 3)
                {
                    updateMap(a, initIndex, i, seq);
                }
                initIndex = i;
                lastIndex = i + 1;
                seq = 2;
                initDiff = a[i + 1] - a[i];
            }
        }
        printSeq(map);
    }

    public static void printSeq(TreeMap<Integer, HashMap<String, Integer>> map)
    {
        map.forEach((k, v) -> {
            System.out.println(k + " Elements sequence:");
            v.forEach((k1, v1) -> {
                System.out.println(k1 + " ---- " + v1);
            });
        });
    }

    public static void updateMap(int[] a, int i, int j, Integer n)
    {

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int x1 = i; x1 < j; x1++)
        {
            sb.append(a[x1]).append(",");
        }
        sb.append(a[j]);
        sb.append(")");

        HashMap<String, Integer> hm = new HashMap();
        if (map.get(n) == null)
        {
            hm.put(sb.toString(), 1);
            map.put(n, hm);
        }
        else
        {
            hm = map.get(n);
            if (hm.get(sb.toString()) == null)
            {
                hm.put(sb.toString(), 1);
            }
            else
            {
                hm.put(sb.toString(), hm.get(sb.toString()) + 1);
            }
        }
    }

}
