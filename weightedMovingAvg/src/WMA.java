import java.util.*;
//
// https://www.chegg.com/homework-help/questions-and-answers/weighted-moving-average-programming-challenge-description-given-series-trades-trade-key-va-q93206043?auth_provider=oa&nruuid=50ec85dd
public class WMA
{
    List<Trade> tradeList= new ArrayList<>(); // all inpouts here


Map<Integer, List<Integer>> result = new HashMap<>();
HashMap<Integer, Integer> weightsMap = new HashMap<>();
HashMap<Integer, Integer> qtyMap=new HashMap<>();
HashMap<Integer, Integer> sequenceMap=new HashMap<>();

int maxSequence= 0 ;
int weighted_Average = 0 ;
public Map<Integer, List<Integer>> output()
{

    // FORMULA For Weighted Avg is : M_{x+1} = ( M_{x} * Q_{x}) + (value_{x+1} * q_{x+1}  ) / Total Quantity
    for (Trade t : tradeList)
    {
        //IF
        if(weightsMap.containsKey(t.key) && maxSequence!=0 && maxSequence <t.sequence) // if the weight exists & the sequence of curr is less than its next sequence.
        {
            weighted_Average= ((weightsMap.get(t.key)* qtyMap.get(t.key))  + ((t.value)*(t.qty))) /( t.qty + qtyMap.get(t.key));
            int quantity = t.qty+qtyMap.get((t.key));


            // final result
            result.get(t.key).add(weighted_Average);

            //Updating the values in maps
            weightsMap.put(t.key, weighted_Average);
            qtyMap.put(t.key, quantity);
            maxSequence= t.sequence ;

        }

        else if (!weightsMap.containsKey(t.key) && (maxSequence!=0 ||  t.sequence>maxSequence))
        {
            weightsMap.put(t.key, t.value);
            sequenceMap.put(t.key, t.sequence);
            qtyMap.put(t.key, t.qty);

            //
            maxSequence= t.sequence;
            result.put(t.key, new ArrayList<>(Arrays.asList(t.value)));

        }

    }
    System.out.print(result);
    return result;
}

}