public interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    void transferTo(Account account, double amount);

}
