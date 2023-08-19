import java.util.Arrays;

public class CardinalitySorting
{

    // QUESTION :
    // https://www.chegg.com/homework-help/questions-and-answers/cardinality-sorting-binary-cardinality-number-total-number-1-s-contains-binary-representat-q100136477

public int[] cradinalitySort(int[] nums)
{
    for(int i=0;i<nums.length;i++)
    {
        nums[i]+=Integer.bitCount(nums[i])*10001;


    }
    Arrays.sort(nums);

    for(int i=0;i< nums.length;i++)
       nums[i]= nums[i]%10001 ;
    
return nums;
}
}
