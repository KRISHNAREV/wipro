public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Rahul", 50000);

        Employee e2 = (Employee) e1.clone();

        // Change original employee
        e1.id = 102;
        e1.name = "Ramesh";
        e1.salary = 60000;

        System.out.println("Original Employee");
        e1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        e2.display();
    }
}