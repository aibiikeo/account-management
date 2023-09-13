public class Main {
    public static void main(String[] args) {
        PersonalAccount p1 = new PersonalAccount(9090, "p1");
        p1.deposit(900);
        p1.deposit(778);
        p1.withdraw(1600);
        p1.withdraw(100);
        System.out.println(p1.getBalance());
        p1.printTransactionHistory();
    }
}