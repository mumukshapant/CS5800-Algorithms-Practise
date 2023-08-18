import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates
{
    public int removeDuplicates(int[] nums)
    {
        int n = nums.length;

        int j=0; //this will be used to enter duplicate elements into "nums" array

        if(n==0 || n==1) //base case
            return n;

        //FOR loop till n-1 else it will throw OUT OF BOUND Error
        for(int i=0;i<nums.length-1; i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[j]= nums[i];
                j++;
            }
        }


        // since we have our FOR Loop only till n-1, we have to add the last element in our array . so adding this condition
        nums[j]=nums[n-1];

            System.out.println(j+1);

        return j+1;
    }

}
