public class TestEmployee {
    public static void display(Developer emp1) {
        System.out.println("Position: " + emp1.getPosition());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Bonus rate: " + emp1.calculateBonus());
        System.out.println();
    }

    public static void main(String[] args) {
        Developer emp1 = new Developer("Batman");
        emp1.setDepartment("IT Solution");
        emp1.setPosition("Programmer");
        emp1.setSalary(35000);
        display(emp1);

        Tester emp2 = new Tester("Robin",true);
        emp2.setDepartment("Computer Audit");
        emp2.setPosition("Junior Tester");
        emp2.setSalary(25000);

        System.out.println("Position: " + emp2.getPosition());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Department: " + emp2.getDepartment());
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Bonus rate: " + emp2.calculateBonus());
    }
}
