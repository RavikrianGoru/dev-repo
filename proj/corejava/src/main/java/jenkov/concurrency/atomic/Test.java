package jenkov.concurrency.atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.atomic.LongAdder;

public class Test
{

    public static void main(String[] args)
    {

        System.out.println("AtomicBoolean------------------:");
        AtomicBoolean ab = new AtomicBoolean(false);
        System.out.println(ab.get());
        ab.set(true);
        System.out.println(ab.get());
        ab.compareAndSet(true, false);
        System.out.println(ab.get());
        ab.compareAndSet(true, false);
        System.out.println(ab.get());

        System.out.println("AtomicInteger------------------:");
        AtomicInteger ai = new AtomicInteger(1000);
        System.out.println(ai.get());
        System.out.println(ai.accumulateAndGet(2000, (left, right) -> {
            return (left + right);
        }));
        System.out.println(ai.compareAndSet(3000, 3002));
        System.out.println(ai.get());

        System.out.println("AtomicIntegerArray------------------:");
        AtomicIntegerArray aia = new AtomicIntegerArray(2);
        System.out.println("0th index :" + aia.get(0));
        System.out.println("1st index :" + aia.get(1));
        aia.set(0, 100);
        aia.set(1, 200);
        System.out.println("0th index :" + aia.get(0));
        System.out.println("1st index :" + aia.get(1));

        System.out.println("AtomicLong------------------:");
        AtomicLong al = new AtomicLong(1000);
        System.out.println(al.get());
        System.out.println(al.accumulateAndGet(2000, (left, right) -> {
            return (left + right);
        }));
        System.out.println(al.compareAndSet(3000, 3002));
        System.out.println(al.get());

        System.out.println("AtomicLongArray------------------:");
        AtomicLongArray ala = new AtomicLongArray(2);
        System.out.println("0th index :" + ala.get(0));
        System.out.println("1st index :" + ala.get(1));
        ala.set(0, 1000L);
        ala.set(1, 2000L);
        System.out.println("0th index :" + ala.get(0));
        System.out.println("1st index :" + ala.get(1));

        System.out.println("AtomicMarkableReference------------------:");
        AtomicMarkableReference<AtomicLong> amr = new AtomicMarkableReference<>(al, true);
        System.out.println(amr.get(new boolean[]
        { true }));
        System.out.println(amr.get(new boolean[]
        { true, false }));
        al.set(40004);
        amr.set(al, false);
        System.out.println(amr.get(new boolean[]
        { true }));
        System.out.println(amr.get(new boolean[]
        { true, false }));

        System.out.println("AtomicReference-----------------:");
        Integer a = 2000;
        AtomicReference<Integer> ar = new AtomicReference<>();
        ar.set(a);
        System.out.println(ar.get());

        System.out.println("AtomicReferenceArray------------:");
        Integer b = 3000;
        Integer[] iArray = new Integer[2];
        iArray[0] = a;
        iArray[1] = b;

        AtomicReferenceArray<Integer[]> ara = new AtomicReferenceArray(iArray);
        System.out.println(ara);

        System.out.println("AtomicStampedReference----------:");
        Integer a1 = new Integer(5000);
        AtomicStampedReference<Integer> asr = new AtomicStampedReference<Integer>(a1, 1);
        System.out.println(asr);
        System.out.println(asr.getStamp());
        asr.set(a1, 2);
        System.out.println(asr.getStamp());
        System.out.println(asr.get(new int[]
        { 1, 3, 5 }));

        System.out.println("LongAdder----------:");
        LongAdder la = new LongAdder();
        System.out.println(la);
        la.add(10);
        la.increment();// same as add(1)
        la.decrement();// same as add(-1)
        System.out.println(la);

    }

}
