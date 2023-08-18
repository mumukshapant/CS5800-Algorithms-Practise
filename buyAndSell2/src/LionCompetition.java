import java.util.ArrayList;
import java.util.List;

class LionCompetition
{

    public LionCompetition(List<LionDescription> lions, List<LionSchedule> schedule)
    {

        /* Enter your code here. */

    }



    public void lionEntered(int currentTime, int height)
    {

        /* Enter your code here. */




        for (LionDescription description : LionDescription.name) {
            for (LionSchedule schedule : lionSchedules) {
                if (schedule.enterTime == currentTime && schedule.name.equals(description.name) && description.height >= height) {
                    currentLions.add(new Lion(description.name, description.height, schedule.enterTime, schedule.exitTime));
                }
            }


    }



    public void lionLeft(int currentTime, int height)
    {

        /* Enter your code here. */

    }



    public List<String> getBiggestLions()

    {

        /* Enter your code here. */

        return new ArrayList<String>();

    }

}