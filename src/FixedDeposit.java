import java.time.LocalDate;

public class FixedDeposit extends Account{
    private int period;
    private double interestRate;
    public FixedDeposit(){
    }

    public FixedDeposit(int period, double interestRate) {
        this.period = period;
        this.interestRate = interestRate;
    }

    public FixedDeposit(Customer owner, int period, double interestRate) {
        super(owner);
        this.period = period;
        this.interestRate = interestRate;
    }

    public FixedDeposit(Customer owner, double balance, int period, double interestRate) {
        super(owner, balance);
        this.period = period;
        this.interestRate = interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public LocalDate getOpenDate() {
        return super.getOpenDate();
    }
    public double interestPerMonth(){
        return getBalance()*interestRate/1200;
    }
    public double totalPayForMonth(){
        return (getBalance()/12)+(getBalance()*interestRate/1200);
    }
    public double totalPayForPeriod(){
        return getBalance()+(getBalance()*interestRate/1200)*period;
    }

    @Override
    public String toString() {
        return  "----------------------------------------------------------"+"\n"+
                "FixedDeposit account number = " +getAccountNumber()+"\n"+
                "Balance= "+getBalance()+"\n"+
                "Period= " + period +"\n"+
                "Interest Rate= " + interestRate +"\n"+
                "Interest per month= "+interestPerMonth()+"\n"+
                "Total payment per month= "+totalPayForMonth()+"\n"+
                "Total payment for period= "+totalPayForPeriod()+"\n"+
                "Account Open Date= "+getOpenDate()+"\n"+
                "-----------------------------------------------------------";
    }
}
