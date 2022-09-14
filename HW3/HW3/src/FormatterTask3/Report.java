package FormatterTask3;

public class Report {

    public static void generateReport(Employee[] employeeList) {
        for(Employee ind : employeeList) {
            System.out.println(String.format("Name: %s, salary: %.2f.", ind.getFullName(), ind.getSalary()));
        }
    }
}
