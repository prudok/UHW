package HW4_2.Task7;

public class Main {
    public static void main(String[] args) {

        Learner[] learners = {new Schoolboy("Max", "Maximov", 13, 5), new Student("Misha", "Mishanov", 19, 34.5)};
        for(Learner learner : learners) {
            System.out.println(learner);
        }
    }
}