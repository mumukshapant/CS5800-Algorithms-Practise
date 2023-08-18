import java.util.ArrayList;
import java.util.HashSet;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2)
    {


        //input the matching elements into HashSET
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();


        for( int i: nums1)
            list1.add(i);

        for(int i=0 ; i< nums2.length; i++)
        {
            if(list1.contains(nums2[i]) )
            {
                list2.add(nums2[i]);
                list1.remove(nums2[i]);
            }
        }

for(int i=0;i<list2.size(); i++)
   System.out.print(list2.get(i)+" ");













        return nums1;
    }
}

