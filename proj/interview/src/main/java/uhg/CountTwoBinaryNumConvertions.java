package uhg;

public class CountTwoBinaryNumConvertions
{
    public static boolean[] getBinary(int num)
    {
        boolean binary[]=new boolean[32];
        int index=31;
        int rem;
        
        boolean isNegative=false;
        
        if(num<0)
        {
            num*=-1;
            num--;
            isNegative=true;
        }
        
        while(num>0)
        {
            rem=num%2;
            binary[index]=(rem==0)?false:true;
            num=num/2;
            index--;
        }
        
        if(isNegative)
        {
            for(int i=0;i<binary.length;i++)
            {
                binary[i]=binary[i]?false:true;
            }
        }
            return binary;
    }
    
    public static int bitDifferences(boolean[]a, boolean b[])
    {
        int count=0;
        for(int i=0;i<32;i++)
        {
            if(a[i]!=b[i])
                count++;
        }
        return count;
    }
    
    public static void printBinary(boolean[] bin)
    {
        for(int i=0;i<bin.length;i++)
        {
            System.out.print((bin[i]==true)?1:0);
        }
    }
    public static void main(String[] args)
    {
        Integer num1=6;//Integer.MAX_VALUE;
        Integer num=5;//Integer.MIN_VALUE;
        
        System.out.println(num1);
        System.out.println(Integer.toBinaryString(num1));
        printBinary(getBinary(num1));

        System.out.println();
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));      
        printBinary(getBinary(num));
        
        System.out.println();
        System.out.println("Count :"+bitDifferences(getBinary(num1), getBinary(num)));
    }

}
