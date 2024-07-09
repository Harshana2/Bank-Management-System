import java.time.LocalDate;
import java.util.Date;

public abstract class Account {
    private int accountNumber;
    private Customer owner;
    private double balance;
    private LocalDate openDate;
    private static int nextAccountNumber=200010;

    LocalDate date = LocalDate.now();

    public void setOpenDate() {
        this.openDate = date;
    }

    public Account() {
    }

    public Account(Customer owner) {
        this.owner = owner;
        accountNumber=nextAccountNumber;
        nextAccountNumber+=10;
        balance=0.0;
        this.openDate = date;
    }
    public Account(Customer owner, double balance) {
        accountNumber = nextAccountNumber;
        nextAccountNumber+=10;
        this.owner = owner;
        setBalance(balance);
        this.openDate = date;
    }
    public void setBalance(double amount){
         balance=amount;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", owner=" + owner +
                ", balance=" + balance +
                ", openDate=" + openDate +
                '}';
    }
}
