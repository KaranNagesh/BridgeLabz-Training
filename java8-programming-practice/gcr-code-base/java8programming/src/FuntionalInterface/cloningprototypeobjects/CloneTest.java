package FuntionalInterface.cloningprototypeobjects;

public class CloneTest {

    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee(101, "Karan");

        Employee e2 = (Employee) e1.clone();

        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}
