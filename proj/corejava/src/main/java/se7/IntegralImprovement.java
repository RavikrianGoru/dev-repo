package se7;

/**
 * Created by ragoru on 5/31/2016.
 */
public class IntegralImprovement {
    public static void main(String[] args) {

        //we can user binary values directly.
        byte b1=0b1001011;
        int i1=0b11110001;
        System.out.println(b1+i1);

        //underscore between numbers
        int i2=123_443_22_4;
        System.out.println(i2);


        int i3=0b1101000101;
        int i4=0b1_10_100_01_01;

        System.out.println((i3==i4)?"y":"n");


        int h1=0xCAFE;
        int h2=0xCA_FE;
        System.out.println((h1==h2)?"Y":"N");
    }
}
