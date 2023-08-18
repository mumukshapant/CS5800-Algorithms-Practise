import java.util.ArrayList;
import java.util.List;

public class Permutation
{


    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, result);
        for (int i =0; i<result.size(); i++)
            System.out.println(result.get(i));

        return result;
    }

    public void generate(int[] nums, int pos, List<List<Integer>> result)
    {
        if (pos == nums.length - 1)
        {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums)
            {
                permutation.add(num);
            }

            result.add(permutation);

            return;
        }

        for (int i = pos; i < nums.length; i++)
        {
            swap(nums, pos, i);
            generate(nums, pos + 1, result);
            swap(nums, pos, i);
        }

    }

    public void swap(int[] nums, int x, int j)
    {
        int temp = nums[x];
        nums[x] = nums[j];
        nums[j] = temp;
    }


    public void printing(List<List<Integer>> res)
    {
        for (int i=0;i<res.size(); i++)
            System.out.print(res.get(i));

        System.out.println(" ");


        //whitespaces
        String st="mumu is a girllllkfjewhfwehfjlkew";
        st= st.replaceAll(" ","")

                // regular expression
        st.replaceAll("[^]")
    }



}

