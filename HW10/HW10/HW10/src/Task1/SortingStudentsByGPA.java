package Task1;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Arrays;

class SortingStudentsByGPA implements Comparator<Student>{
    private Student[] students;

    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getBall(), o2.getBall());
    }

    public void quickSort() {

    }
    public double maxOrMinValue(int req) {
        double value = students[0].getBall();
        if(req == 1) {
            for(Student ind : students)
                if(value < ind.getBall()) value = ind.getBall();
        }
        else
            for(Student ind : students)
                if(value < ind.getBall()) value = ind.getBall();
        return value;
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
