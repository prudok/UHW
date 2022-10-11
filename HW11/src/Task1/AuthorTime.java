package Task1;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.*;

public class AuthorTime {
    private LocalTime gettingTaskTime = LocalTime.now();
    private LocalDate gettingTaskDate = LocalDate.now();

    private Random random = new Random();

    private LocalTime completedTaskTime = gettingTaskTime.plusHours(Math.abs(random.nextInt() % 10));
    private LocalDate completedTaskDate = gettingTaskDate.plusDays(Math.abs(random.nextInt() % 10));

    private String secondName;

    public Random getRandom() {
        return random;
    }

    public LocalTime getCompletedTaskTime() {
        return completedTaskTime.withNano(0);
    }

    public LocalDate getCompletedTaskDate() {
        return completedTaskDate;
    }

    public void setAuthorSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalTime getGettingTaskTime() {
        return gettingTaskTime.withNano(0);
    }

    public void setGettingTaskTime(LocalTime gettingTaskTime) {
        this.gettingTaskTime = gettingTaskTime;
    }

    public LocalDate getGettingTaskDate() {
        return gettingTaskDate;
    }

    public void setGettingTaskDate(LocalDate gettingTaskDate) {
        this.gettingTaskDate = gettingTaskDate;
    }

    @Override
    public String toString() {
        return "Second name: " + getSecondName() + ", Date task was received: " + getGettingTaskDate() +
                ", Time: " + getGettingTaskTime() + "\n" + "Date task was completed: " + getCompletedTaskDate() +
                ", Time: " + getCompletedTaskTime();
    }
}
