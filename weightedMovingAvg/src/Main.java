import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        WMA obj = new WMA();


        Trade trade1 = new Trade(1, 2000, 5, 1);
        Trade trade2 = new Trade(1, 2050, 5, 9);
        Trade trade3 = new Trade(1, 3000, 10, 3);

        obj.tradeList.add(trade1);
        obj.tradeList.add(trade2);
        obj.tradeList.add(trade3);

       // Print the List
        for(int i = 0; i < obj.tradeList.size(); i++)
        {
            Trade currentTrade = obj.tradeList.get(i);
            System.out.println("Trade " + (i + 1) + ":");
            System.out.println("Key: " + currentTrade.key);
            System.out.println("Value: " + currentTrade.value);
            System.out.println("Seq: " + currentTrade.sequence);
            System.out.println("Qty: " + currentTrade.qty);
            System.out.println(); // Adding an empty line for separation
        }

        obj.output();

    }
}