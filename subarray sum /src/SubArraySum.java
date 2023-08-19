public class SubArraySum
{
    public int subarraysum(int[] arr)
    {
        int res = 0 ;
        for(int i=0;i<arr.length;i++)
        {
            int sum = 0 ;
            for(int j=i;j<arr.length; j++)
            {
                sum+=arr[j];
                res+=sum;
            }
        }
        System.out.print(res);
        return res;
       }
}
