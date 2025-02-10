public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String getName() {
        return this.name;
    }
    public abstract double calculateBonus();
}
