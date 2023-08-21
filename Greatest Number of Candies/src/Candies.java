import java.util.ArrayList;
import java.util.List;

public class Candies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> res= new ArrayList<>();
        int max = Integer.MIN_VALUE;

        //maximum element in candies
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
                max=candies[i];
        }

        // Add the extra candies & check
        for(int i=0;i<candies.length;i++) {

//            We can REWRITE THIS ....

//            if (candies[i] + extraCandies < max)
//                res.add(false);
//            else
//            res.add(true);
//
            // .....as this :
            res.add(candies[i]+extraCandies<max?true:false);


        }

        return res;
    }
}
