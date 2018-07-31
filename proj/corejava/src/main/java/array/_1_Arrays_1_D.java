package array;

import java.util.Arrays;

public class _1_Arrays_1_D
{

    public static void main(String[] args)
    {
        // Declaring array literal
        int a1[] = new int[] { 10,20,30,40};
        int a2[] = { 100, 30, 4, 210, 5 };
        int a3[] = new int[3];
        
        Class c = a1.getClass();
        System.out.println("Array class Name:" + c.getName());
        
        System.out.println("\nArray elements:");
                _0_ArrayUtils.printArray(a1, ",");
        System.out.println("\nUpdate Array elements: Primitive call by Ref");
                _0_ArrayUtils.update_1D_Array(a1,5);
        System.out.println("\nArray elements:");
                _0_ArrayUtils.printArray(a1, ",");
        
                
        System.out.println("\nMin element of above array:");
        System.out.println(_0_ArrayUtils.minElementOfArray(a1));

        
        System.out.println("Array Copy:");
        System.arraycopy(a1, 1, a3, 0, 3);
            _0_ArrayUtils.printArray(a1, ",");
            
        Emp empA[]=new Emp[3];
        Emp e1=new Emp(1,"ravi");
        Emp e2=new Emp(2,"kiran");
        Emp e3=new Emp(3,"goru");
        empA[0]=e1;
        empA[1]=e2;
        empA[2]=e3;
        for(int i=0;i<empA.length;i++)
        {
            System.out.println(empA[i]);
        }
        
        System.out.println("Update emp obj: Object Call by reference");
        e1.setName("RAVI");
        
        for(int i=0;i<empA.length;i++)
        {
            System.out.println(empA[i]);
        }
        
    }

}
