package Task1;
import java.lang.Comparable;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] students;
    public Comparator<Student> comparator = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getBall().compareTo(o2.getBall());
        }

        public int compareTo() {
            
        }
    };

    public quickSort() {

    }
    public SortingStudentsByGPA() {
        setArray();
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public Student[] getStudents() {
        return students;
    }

    public void setArray() {
        Student[] randStudents = new Student[5];
        for(int ind = 0; ind < randStudents.length; ++ind) {
            randStudents[ind] = new Student();
        }
        students = randStudents;
    }

    @Override
    public String toString() {
        for(int ind = 0; ind < students.length; ++ind) {
            System.out.println(students[ind]);
        }
        return "";
    }
}
