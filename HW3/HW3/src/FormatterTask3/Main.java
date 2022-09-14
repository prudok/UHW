package FormatterTask3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Mark T.G.", 100.3445), new Employee("Tony G.M.", 234.3250),
        new Employee("Jane V.M.", 456.234)};
        Report.generateReport(employees);
    }
}