import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

class LionDescription {
    public String name;
    public int height;

    public LionDescription(String name, int height) {
        this.name = name;
        this.height = height;
    }
}

class LionSchedule
{
    public String name;
    public int enterTime;
    public int exitTime;

    public LionSchedule(String name, int enterTime, int exitTime) {
        this.name = name;
        this.enterTime = enterTime;
        this.exitTime = exitTime;
    }
}

class LionCompetition {
    private List<LionDescription> lions;
    private List<LionSchedule> schedule;
    private List<String> currentLions;

    public LionCompetition(List<LionDescription> lions, List<LionSchedule> schedule) {
        this.lions = lions;
        this.schedule = schedule;
        this.currentLions = new ArrayList<>();
    }

    public void lionEntered(int currentTime, int height) {
        for (LionDescription lion : lions) {
            for (LionSchedule lionSchedule : schedule) {
                if (lionSchedule.name.equals(lion.name) && lionSchedule.enterTime == currentTime && lion.height >= height) {
                    currentLions.add(lion.name);
                }
            }
        }
    }

    public void lionLeft(int currentTime, int height) {
        currentLions.removeIf(lion -> {
            for (LionSchedule lionSchedule : schedule) {
                return lionSchedule.exitTime == currentTime && lionSchedule.name.equals(lion) && lion.height >= height;
            }
            return false;
        });
    }

    public List<String> getBiggestLions() {
        int maxCompetingHeight = -1;
        for (String lionName : currentLions) {
            for (LionDescription lion : lions) {
                if (lion.name.equals(lionName)) {
                    maxCompetingHeight = Math.max(maxCompetingHeight, lion.height);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (String lionName : currentLions) {
            for (LionDescription lion : lions) {
                if (lion.name.equals(lionName) && lion.height >= maxCompetingHeight) {
                    result.add(lion.name);
                    break;
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}

public class Main {
    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String operation;

        List<LionDescription> descriptions = new ArrayList<>();
        List<LionSchedule> schedule = new ArrayList<>();

        do {
            operation = scanner.next();

            if (operation.equals("definition")) {
                String name = scanner.next();
                int height = scanner.nextInt();
                LionDescription description = new LionDescription(name, height);
                descriptions.add(description);
            }

            if (operation.equals("schedule")) {
                String name = scanner.next();
                int enterTime = scanner.nextInt();
                int exitTime = scanner.nextInt();
                LionSchedule scheduleEntry = new LionSchedule(name, enterTime, exitTime);
                schedule.add(scheduleEntry);
            }

        } while (!operation.equals("start"));

        LionCompetition lionCompetition = new LionCompetition(descriptions, schedule);

        do {
            int currentTime = scanner.nextInt();
            operation = scanner.next();

            if (operation.equals("enter")) {
                int size = scanner.nextInt();
                lionCompetition.lionEntered(currentTime, size);
            }

            if (operation.equals("exit")) {
                int size = scanner.nextInt();
                lionCompetition.lionLeft(currentTime, size);
            }

            if (operation.equals("inspect")) {
                List<String> lions = lionCompetition.getBiggestLions();
                System.out.print(lions.size());

                for (String name : lions) {
                    System.out.print(" " + name);
                }

                System.out.println();
            }

        } while (!operation.equals("end"));
    }
}
