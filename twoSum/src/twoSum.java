public class twoSum {
    public int[] twoSum(int[] nums, int target)
    {
        int[] count= new int[2];

        for(int i=0;i<nums.length; i++)
        {
            for (int j=i+1; j< nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    count[0]=i;
                    count[1]=j;
                }
            }
        }
        System.out.println(count[0]+" "+count[1]);
        return count;

    }
}
