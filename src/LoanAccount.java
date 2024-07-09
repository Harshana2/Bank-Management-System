import java.time.LocalDate;
import java.util.Date;

public class LoanAccount extends Account{
    private double interestRate;
    private int period;
    private LocalDate endDate;

    public LoanAccount(Customer owner, double balance, double interestRate, int period) {
        super(owner, balance);
        this.interestRate = interestRate;
        this.period = period;
        endDate=super.getOpenDate().plusMonths(getPeriod());
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public LocalDate getOpenDate(){
        return super.getOpenDate();
    }
    public LocalDate getEndDate(){
        return super.getOpenDate().plusMonths(getPeriod());
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public double monthlyPay(){
        return (getBalance()+(getBalance()*interestRate)/100)/period;
    }
    public double totalPay(){
        return (getBalance()+(getBalance()*interestRate)/100);
    }

    @Override
    public String toString() {
        return  "----------------------------------------------"+"\n"+
                " Account Number= "+ getAccountNumber()+"\n"+
                " Interest Rate= " + interestRate +"\n"+
                " period= " + period +"\n"+
                " Loan Amount= "+getBalance()+"\n"+
                " Monthly Payment= "+monthlyPay()+"\n"+
                " Full Payment for Period= "+totalPay()+"\n"+
                " Account Open date: "+getOpenDate()+"\n"+
                " EndDate= " + getEndDate() +"\n"+
                "----------------------------------------------";
    }
}
