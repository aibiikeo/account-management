import java.util.ArrayList;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;
    public PersonalAccount(int accountNumber, String accountHolder){
        transactions = new ArrayList<Amount>();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }
    public void deposit(double amount){
        balance = balance + amount;
        Amount amount1 = new Amount(amount, "deposit");
        transactions.add(amount1);
    }
    public void withdraw(double amount){
        if (balance > amount){
            balance = balance - amount;
            Amount amount2 = new Amount(amount, "withdraw");
            transactions.add(amount2);
        }
        else {
            System.out.println("not enough balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void printTransactionHistory(){
        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i).getInfo());
        }
    }
}
