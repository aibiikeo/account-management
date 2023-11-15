public class Main {
    public static void main(String[] args) throws Exception{
        PersonalAccount p1 = new PersonalAccount(9090, "p1");
        try {
            p1.deposit(1900);
            System.out.println("Balance is: " + p1.getBalance() + "$.");
            p1.withdraw(1000);
            System.out.println("Balance is: " + p1.getBalance() + "$.");
            p1.deposit(900);
            System.out.println("Balance is: " + p1.getBalance() + "$.");
            p1.withdraw(2000);
            System.out.println("Balance is: " + p1.getBalance() + "$.");

        } catch (InsufficientBalanceException e) {
            System.out.println(e.toString());
        }
        System.out.println("\nTransactions history: ");
        p1.printTransactionHistory();
        System.out.println("Balance is: " + p1.getBalance() + "$.");

    }
}
