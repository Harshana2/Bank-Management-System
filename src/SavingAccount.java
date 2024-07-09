import java.time.LocalDate;
import java.util.Date;

public class SavingAccount extends Account implements Transaction {
    public SavingAccount() {
    }

    public SavingAccount(Customer owner) {
        super(owner);
    }

    public SavingAccount(Customer owner, double balance) {
        super(owner, balance);
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

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public LocalDate getOpenDate() {
        return super.getOpenDate();
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        super.setAccountNumber(accountNumber);
    }

    @Override
    public void setOwner(Customer owner) {
        super.setOwner(owner);
    }

    public void deposit(double amount){
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("The amount has been deposited!."+"\n"+"Account balance is "+ getBalance());
        }
        else System.out.println("Amount is invalid!");
    }
    public void withdraw(double amount){
        if(amount>0 &&amount<=getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("The amount has been successfully withdrew!."+"\n"+"Account balance is "+getBalance());
        }
        else System.out.println("Account balance is not sufficient!");
    }

    @Override
    public void transferTo(Account account, double amount) {
        if(amount<=this.getBalance()&&amount>0){
            this.setBalance(getBalance()-amount);
            account.setBalance(account.getBalance()+amount);
            System.out.println("The amount has been successfully Transferred to Account : "+account.getAccountNumber());
            System.out.println("Remaining Account Balance: "+this.getBalance());
        }
        else if(amount>this.getBalance()){
            System.out.println("Insufficient balance to make this transaction!");
        }
        else if(amount<0){
            System.out.println("Invalid input!");
        }
    }

    @Override
    public String toString() {
        return  "----------------------------------------------"+"\n"+
                "Account Number= "+getAccountNumber()+"\n"+
                "Account Type= Saving "+"\n"+
                "Account Balance= "+getBalance()+"\n"+
                "Account Open Date= "+getOpenDate()+"\n"+
                "----------------------------------------------";
    }
}
