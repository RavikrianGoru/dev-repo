package accessmodifiers;

import accessmodifiers.subpack.PublicClass;
//import accessmodifiers.subpack.DefaultClass;

public class AccessModifiers extends PublicClass
{

    public static void main(String[] args)
    {
        System.out.println("Access modifeirs scope: private->protected->default->public\n");

        System.out.println("private scope: \nA class cannot be private or protected except nested class.\n");

        System.out.println("default scope(Package level access modifier): \nCan create default class.but the scope is with in the package.");
        // pubC.defM(); C.T Error
        // DefaultClass defC=new DefaultClass(); //C.T Error

        System.out.println("\npublic scope:");
        PublicClass pubC = new PublicClass();
        pubC.pubM();
        System.out.println(pubC.pubInt);
        // System.out.println(pubC.defInt);//C.T Error
        // System.out.println(pubC.priInt);//C.T Error
        // System.out.println(pubC.proInt);//C.T Error
        pubC.pubM();
        // pubC.priM();//C.T Error
        // pubC.defM();//C.T Error
        // pubC.protM();//C.T Error

        System.out.println("The protected access modifier is accessible within package and outside the package but through inheritance only.\nThe protected access modifier can be applied on the data member, method and constructor.\nIt can't be applied on the class.");

    }

}
