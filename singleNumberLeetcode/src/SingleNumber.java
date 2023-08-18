import java.util.HashMap;
import java.util.Map;

public class SingleNumber
{
    public int singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> map= new HashMap();
        int count=0 ;
        for(int i=0;i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);

            else
                map.put(nums[i], 1);
        }

        System.out.println("The set is: " + map.entrySet());

        for(HashMap.Entry<Integer, Integer> entry: map.entrySet())
        {

            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }


        return 1;

    }
}
