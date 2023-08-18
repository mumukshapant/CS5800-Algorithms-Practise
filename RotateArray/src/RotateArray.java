public class RotateArray {
    public void rotate(int[] nums, int k)
    {

        int n=nums.length;
        int[] temp= new int[n];

        // create a temp array which will be a clone of nums array
        for(int i=0;i< n; i++)
        {
            temp[i]=nums[i];
        }





        int j=0;

        for(int i=k; i<n ; i++)
        {

            nums[i]= temp[j++];
        }



        int x=n-k ;
        for(int i=0;i<k; i++)
        {
            nums[i]= temp[x++];
        }



    }
}

