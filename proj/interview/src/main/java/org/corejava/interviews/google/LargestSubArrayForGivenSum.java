package org.corejava.interviews.google;

public class LargestSubArrayForGivenSum
{
/*    private static int start=0,end=-1,tempSum=0;
    private static boolean isFound=false;
    
    private static boolean compare(int[] inputArray,int sum)
    {
        if(tempSum==sum)
        {
            end++;
            return true;
        }
        else if(tempSum<sum)
        {
            end++;
        }
        else if(tempSum>sum)
        {
            tempSum-=inputArray[start];
            start++;
            return compare(inputArray,sum);
        }
        return false;
    }
    private static void findSubArrayForGivenSum(int[] inputArray, int size, int sum) 
    {
        for(int i=0;i<size;i++)
        {
            tempSum+=inputArray[i];
            isFound=compare(inputArray,sum);
            if(isFound)
            {
                System.out.println(start+" to "+end);
                break;
            }
        }
        if(!isFound)
        {
            System.out.println("-1");
        }
    }
*/    
    private static int findSubArrayForGivenSum(int[] inputArray, int size, int sum) 
    {
        int curr_sum=inputArray[0];
        int str=0;
        for(int i=1;i<=size;i++)
        {
            while(curr_sum>sum&& str<i-1)
            {
                curr_sum-=inputArray[str];
                str++;
            }
            if(curr_sum==sum)
            {
                System.out.println(str +"  "+(i-1));
//                return 1;
            }
            if(i<size)
            {
                curr_sum+=inputArray[i];
            }
        }
        System.out.println("-1");
        return 0;
    }
    
    public static void main(String[] args) throws Exception
    {
        
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        if(tc<0 || tc>100)
        {
            throw new Exception("Invalid: Number of test cases.");
        }
        for(int i=0;i<tc;i++)
        {
            String input2=br.readLine();
            String[] strArray1=input2.split(" ");
            if(strArray1==null || strArray1.length!=2)
            {
                throw new Exception("Invalid: no of elements should be 2 (size and sum).");
            }
            int size=Integer.parseInt(strArray1[0]);
            if(size<1 || size>100)
            {
                throw new Exception("Invalid: array size.");
            }
            int sum=Integer.parseInt(strArray1[1]);
            if(sum<1 || sum>100)
            {
                throw new Exception("Invalid: sum.");
            }
            String input3=br.readLine();
            String [] strArray2=input3.split(" ");
            if(strArray2==null || strArray2.length!=size)
            {
                throw new Exception("Invalid: no array elements.");
            }
            int inputArray[]=new int[size];
            for(int j=0;j<strArray2.length;j++)
            {
                inputArray[j]=Integer.parseInt(strArray2[j]);//we validate here
            }
            findSubArrayForGivenSum(inputArray, size, sum);
            start=0;
            end=-1;
            tempSum=0;
            isFound=false;
        }*/
        int[] a= {11,8,4,5,63,21,3,4,16};
        int n=9,s=4;
        findSubArrayForGivenSum(a,n,s);
    }

}
