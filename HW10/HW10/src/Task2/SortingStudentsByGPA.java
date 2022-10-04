package Task2;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Arrays;

class SortingStudentsByGPA implements Comparator<Student>{
    private Student[] students;

    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getBall(), o2.getBall());
    }

    public void quickSort(Student[] students, int begin, int end) {
        if(begin < end) {
            int partitionIndex = partition(students, begin, end);

            quickSort(students, begin, partitionIndex - 1);
            quickSort(students, partitionIndex + 1, end);
        }
    }

    public int partition(Student[] students, int begin, int end) {
        int ind = begin - 1;

        for(int jnd = begin; jnd < end; ++jnd) {
            if(compare(students[jnd], students[end]) == -1 || compare(students[ind], students[end]) == 0)
             {
                ++ind;

                Student swapTemp = students[ind];
                students[ind] = students[jnd];
                students[jnd] = swapTemp;
            }
        }
        Student swapTemp = students[ind + 1];
        students[ind + 1] = students[end];
        students[end] = swapTemp;
        return ind + 1;
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