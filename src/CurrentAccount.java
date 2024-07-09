import java.time.LocalDate;
import java.util.Date;

public class CurrentAccount extends Account implements Transaction{
    private double overDrawnLimit;
    public CurrentAccount() {
    }

    public CurrentAccount(Customer owner) {
        super(owner);
        this.overDrawnLimit=0;
    }

    public CurrentAccount(Customer owner, double balance) {
        super(owner, balance);
        this.overDrawnLimit=0;
    }
    public CurrentAccount(Customer owner, double balance, double overDrawnLimit) {
        super(owner, balance);
        this.overDrawnLimit=overDrawnLimit;
    }

    @Override
    public void setBalance(double amount) {
        super.setBalance(amount);
    }

    @Override
    public int getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public Customer getOwner() {
        return super.getOwner();
    }

    public double getOverDrawnLimit() {
        return overDrawnLimit;
    }

    public void setOverDrawnLimit(double overDrawnLimit) {
        this.overDrawnLimit = overDrawnLimit;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public LocalDate getOpenDate() {
        return super.getOpenDate();
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("The amount has been deposited!. Account balance is "+ getBalance());
        }
        else System.out.println("Amount is invalid!");
    }

    @Override
    public void withdraw(double amount) {
        if(amount>0 &&amount<=getBalance()+getOverDrawnLimit()){
            setBalance(getBalance()-amount);
            System.out.println("The amount has been successfully withdrew!. Account balance is "+getBalance());
        }
        else System.out.println("Account balance is not sufficient!");
    }

    @Override
    public void transferTo(Account account, double amount) {
        if(amount<=this.getBalance()+this.getOverDrawnLimit()&&amount>0){

            this.setBalance(getBalance()-amount);
            account.setBalance(account.getBalance()+amount);
            System.out.println("The amount has been successfully Transferred to Account : "+account.getAccountNumber());
            System.out.println("Remaining Account Balance: "+this.getBalance());
        }
        else if(amount>this.getBalance()+overDrawnLimit){
            System.out.println("Insufficient balance to make this transaction!");
        }
        else if(amount<0){
            System.out.println("Invalid input!");
        }
        else
        {
            System.out.println("You have exceeded transfer limit!");
            System.out.println("Maximum transfer Amount :"+(this.getBalance()+this.overDrawnLimit));
        }

    }

    @Override
    public String toString() {
        return "----------------------------------------------"+"\n"+
                "Account Number= "+getAccountNumber()+"\n"+
                "Account Type= Current "+"\n"+
                "Account Balance= "+getBalance()+"\n"+
                "Over Drawn Limit= "+overDrawnLimit+"\n"+
                "Account Open Date= "+getOpenDate()+"\n"+
                "----------------------------------------------";
    }
}
