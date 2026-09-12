package practise;

public class PayrollEmployee {
    private String id;
    private double salary;

    public PayrollEmployee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    // Resolves field/parameter naming clash using 'this'
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void displaySalary() {
        System.out.println(this.id + " | Final Salary: Rs " + this.salary);
    }

    public static void main(String[] args) {
        PayrollEmployee[] employees = {
            new PayrollEmployee("E-101", 40000),
            new PayrollEmployee("E-102", 55000),
            new PayrollEmployee("E-103", 62000),
            new PayrollEmployee("E-104", 48000)
        };

        double bonus = 5000;

        for (PayrollEmployee emp : employees) {
            emp.raiseSalary(bonus);
            emp.displaySalary();
        }
    }
}