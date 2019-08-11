package bnym;

public class CandleResidue
{

    public static void main(String[] args)
    {

        // Total amount: 10
        // price: 2
        // Residue: 5
        // o/p: 6

        // Total amount: 6
        // price: 2
        // Residue: 2
        // o/p: 5

        int amount = 10;
        int price = 2;
        int residue = 5;

        int noOfCandles = amount / price;
        System.out.println(noOfCandles);
        int temp = noOfCandles;
        while (temp >= residue)
        {
            noOfCandles += (temp / residue);
            temp = (temp / residue) + (temp % residue);
        }
        System.out.println(noOfCandles);
    }

}
