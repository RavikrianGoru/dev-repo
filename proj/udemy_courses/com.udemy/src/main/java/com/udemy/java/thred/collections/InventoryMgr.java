package com.udemy.java.thred.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryMgr
{
    List<Product> soldProductList = new ArrayList<>();
    // Vector is thread safe
    // CopyOnWriteArrayList<Product>

    public void pupulateSoldItems()
    {
        for (int i = 0; i <= 10; i++)
        {
            soldProductList.add(new Product(i, "Product:" + i));
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Product:" + i + " added.");
        }
    }

    public void printSoldItems()
    {
        System.out.println(soldProductList);
        for (Product p : soldProductList)
        {
            System.out.println(p);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
