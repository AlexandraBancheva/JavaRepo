public class BankAccount {
    private final static double Default_value_InterestRate = 0.02;
    private static int bankAccountCount = 1;
    private static double interestRate = Default_value_InterestRate;
    private int id;
    private double balance;

    public BankAccount(){
        this.id = bankAccountCount++;
    }

    public int getId() {
        return id;
    }

    public void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int Years){
        return BankAccount.interestRate * Years * this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}
