package Task2;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        System.out.println(sortingStudentsByGPA);
        sortingStudentsByGPA.quickSort(sortingStudentsByGPA.getStudents(), 0, sortingStudentsByGPA.getStudents().length - 1);
        System.out.println(sortingStudentsByGPA);
    }

}