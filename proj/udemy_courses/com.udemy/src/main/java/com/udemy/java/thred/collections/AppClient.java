package com.udemy.java.thred.collections;

public class AppClient
{

    public static void main(String[] args) throws InterruptedException
    {
        final InventoryMgr invMgr = new InventoryMgr();

        Thread t1 = new Thread(() -> {
            invMgr.pupulateSoldItems();
        });
        Thread t2 = new Thread(() -> {
            invMgr.printSoldItems();
        });

        System.out.println("This will throw oncurrentModificationException as one thread modifying and other is iterating by forEach loop.");
        // t1.start();
        // Thread.sleep(5000);
        // t2.start();

        t1.start();
        t1.join();// Once t1 thread completed then only main thread/method will continue after join.
        t2.start();
    }

}
