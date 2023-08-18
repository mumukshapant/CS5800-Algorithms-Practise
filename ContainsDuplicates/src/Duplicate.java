import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

// 3 Approaches with Different Runtimes;

public class Duplicate {
    public boolean containsDuplicate(int[] nums)
    {

        //Approach 1 - Naive , Time Limited Exceeded . Complexity O(n^2)
        //TLE
//        for(int i=0;i<nums.length; i++)
//        {
//            for(int j=i+1; j<nums.length; j++)
//            {
//                if(nums[i]==nums[j])
//                    return true;
//            }
//        }
//        return false;



//        //Approach 2 - Time Complexity O(nlogn )
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1; i++)
//            if(nums[i]==nums[i+1])
//                return true;
//
//
//        return false;



        //Approach 3 - Hashing Time O(n)
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length; i++)
            map.add(nums[i]);

        if(map.size()==nums.length)
            return false;

        return true;




    }
}
