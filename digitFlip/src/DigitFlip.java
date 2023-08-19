import java.util.Arrays;

public class DigitFlip
{
    public int minimumflips(String target)
    {
//assuming that we start from all 0s
        int count=0;
        char prev= target.charAt(0);

        if(prev=='1')
            count++;

        for(int i=1;i<target.length(); i++)
        {
            char c = target.charAt(i);
            if(c!=prev)
                count++;

            prev= c;

        }

        return count;
    }

}
