import java.util.HashMap;

public class Flowers
{

    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int count=0;
        int len= flowerbed.length;

        for(int i=0;i<flowerbed.length; i++)
        {
            if(flowerbed[i]==0 )
            {
                if ((i==0 || flowerbed[i-1]==0) &&( i==len-1 || flowerbed[i+1]==0))
                {
                    flowerbed[i]=1;
                    count++;
                }
            }
        }


        if(count>=n)
            return true ;

        else
            return false;
    }
    }


