package Task1;

public class Tester extends Student{

    private Student[] students;

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
    public Tester() {
        Student[] randStudents = new Student[5];
        for(int ind = 0; ind < 5; ++ind) {
            randStudents[ind] = new Student();
        }
        students = randStudents;
    }

    public void sort() {
        for (int left = 0; left < students.length; ++left) {
            int valueOfIDnumber = students[left].getIDnumber();
            int ind = left - 1;
            for (; ind >= 0; --ind) {
                if (valueOfIDnumber < students[ind].getIDnumber()) {
                    students[ind + 1].setIDnumber(students[ind].getIDnumber());
                } else {
                    break;
                }
            }
            students[ind + 1].setIDnumber(valueOfIDnumber);
        }
    }
    @Override
    public String toString() {
        for(int ind = 0; ind < Student.amount - 1; ++ind) {
            System.out.println(students[ind]);
        }
        return "";
    }

}
