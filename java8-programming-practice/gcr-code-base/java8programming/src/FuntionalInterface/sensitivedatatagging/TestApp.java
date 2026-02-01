package FuntionalInterface.sensitivedatatagging;

public class TestApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        if (account instanceof SensitiveData) {
            System.out.println("Sensitive data → encrypt it");
        } else {
            System.out.println("Normal data");
        }
    }
}
