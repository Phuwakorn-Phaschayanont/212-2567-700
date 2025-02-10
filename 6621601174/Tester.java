public class Tester extends Employee {
    private String position;
    private String department;
    private boolean testCertificated;

    public Tester(String name, boolean cert) {
        super(name);
        this.testCertificated = cert;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String dept) {
        this.department = dept;
    }
    public void displayInfo() {
        System.out.println(getPosition());
        System.out.println(getName());
        System.out.println(getDepartment());
        System.out.println(getSalary());
        System.out.println(calculateBonus());
    }
    public double calculateBonus() {
        return 1.5 * getSalary();
    }
}
