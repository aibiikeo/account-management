public class Main {
    public static void main(String[] args) {
        PersonalAccount p1 = new PersonalAccount(9090, "p1");
        p1.deposit(900);
        p1.deposit(778);
        p1.withdraw(1600);
        p1.withdraw(100);
        System.out.println("Balance is: " + p1.getBalance() + "$.");
        System.out.println("Transactions history: ");
        p1.printTransactionHistory();
        System.out.println("Account number is: " + p1.getAccountNumber());
        System.out.println("Account holder is: " + p1.getAccountHolder());
        p1.deposit(78);
        p1.deposit(200);
        System.out.println("Balance is: " + p1.getBalance() + "$.");
        System.out.println("Transactions history: ");
        p1.printTransactionHistory();
    }
}
