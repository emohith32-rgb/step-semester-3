package assignment3;
class Employee1 {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee1(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("Alice", 50000);
        Employee1 emp2 = new Employee1("Bob", 60000);
        Employee1 emp3 = new Employee1("Charlie", 55000);

        Employee1.printCompanyInfo();
    }
}