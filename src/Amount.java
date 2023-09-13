public class Amount {
    private double amount;
    private String transactionType;
    public Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public void setAmount(double a){
        amount = a;
    }
    public double getAmount(){
        return amount;
    }
    public void setTransactionType(String t){
        transactionType = t;
    }
    public String getTransactionType(){
        return transactionType;
    }

    public String getInfo(){
        return transactionType+":"+amount;
    }
}
