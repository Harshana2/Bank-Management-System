import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<SavingAccount> savingAccounts = new ArrayList<>();
        ArrayList<CurrentAccount> currentAccounts = new ArrayList<>();
        ArrayList<FixedDeposit> fixedDeposits = new ArrayList<>();
        ArrayList<LoanAccount> loanAccounts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int customerCount = 0;
        int savingAccountCount = 0;
        int currentAccountCount=0;
        int fixedDepositCount=0;
        int loanAccountCount=0;


        String response = null;
        int option;
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("---------------Bank Management System-----------------");
            System.out.println("------------------------------------------------------");
            System.out.println("(1) Create a Customer");
            System.out.println("(2) Open an Account");
            System.out.println("(3) Deposit");
            System.out.println("(4) Withdrawal");
            System.out.println("(5) Money Transfer");
            System.out.println("(6) Balance Inquiry");
            System.out.println("(7) Customer Inquiry");
            System.out.println("(8) Account Inquiry");
            System.out.println("(9) Show all customer details");
            System.out.println("(10) Exit");
            System.out.print("Select the option: ");
            option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1: {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Id Number: ");
                    String idNumber = scanner.nextLine();
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    customers.add(new Customer(name, idNumber, gender, city, phoneNumber));
                    customerCount++;
                    System.out.println("Customer has been successfully created!\nCustomer number = " + customers.get(customerCount - 1).customerNumber);
                    break;
                }
                case 2: {
                    System.out.println("(1) New Customer");
                    System.out.println("(2) Existing Customer");
                    System.out.print("Select the option : ");
                    int inputOpenAcc = scanner.nextInt();
                    scanner.nextLine();
                    switch (inputOpenAcc) {
                        case 1: {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter Id Number: ");
                            String idNumber = scanner.nextLine();
                            System.out.print("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter city: ");
                            String city = scanner.nextLine();
                            System.out.print("Enter Phone Number: ");
                            String phoneNumber = scanner.nextLine();
                            customers.add(new Customer(name, idNumber, gender, city, phoneNumber));
                            customerCount++;
                            System.out.println("Customer has been successfully created!\nCustomer number = " + customers.get(customerCount - 1).customerNumber);
                            System.out.print("Enter the Customer Number: ");
                            break;
                        }
                        case 2: {
                            System.out.print("Enter the Customer Number: ");
                            break;
                        }

                    }
                    int inputCustomerNumber = scanner.nextInt();
                    for (Customer customer : customers) {
                        if (customer.customerNumber == inputCustomerNumber) {
                            System.out.println("(1) Saving Account");
                            System.out.println("(2) Current Account");
                            System.out.println("(3) Fixed Deposit");
                            System.out.println("(4) Loan Account");
                            System.out.print("Enter account type: ");
                            int accountSelection = scanner.nextInt();
                            switch (accountSelection) {
                                case 1: {
                                    System.out.print("Enter the initial deposit amount: ");
                                    double amount = scanner.nextDouble();
                                    savingAccounts.add(new SavingAccount(customer, amount));
                                    savingAccountCount++;
                                    System.out.println("Account has been successfully created!");
                                    System.out.println(savingAccounts.get(savingAccountCount - 1).toString());
                                    break;
                                }
                                case 2: {
                                    System.out.print("Enter the initial deposit amount: ");
                                    double amount = scanner.nextDouble();
                                    System.out.print("Enter the Over Drawn Limit: ");
                                    double overDrawnLimit = scanner.nextDouble();
                                    currentAccounts.add(new CurrentAccount(customer, amount, overDrawnLimit));
                                    currentAccountCount++;
                                    System.out.println("Account has been successfully created!");
                                    System.out.println(currentAccounts.get(currentAccountCount - 1).toString());
                                    break;
                                }
                                case 3: {
                                    System.out.print("Enter the initial deposit amount: ");
                                    double amount = scanner.nextDouble();
                                    System.out.print("Enter the deposit period(months): ");
                                    int depositPeriod = scanner.nextInt();
                                    System.out.print("Enter the interest rate: ");
                                    double interestRate = scanner.nextDouble();
                                    fixedDeposits.add(new FixedDeposit(customer, amount, depositPeriod, interestRate));
                                    fixedDepositCount++;
                                    System.out.println("Account has been successfully created!");
                                    System.out.println(fixedDeposits.get(fixedDepositCount - 1).toString());
                                    break;
                                }
                                case 4: {
                                    System.out.print("Enter the loan amount: ");
                                    double amount = scanner.nextDouble();
                                    System.out.print("Enter the loan period(months): ");
                                    int period = scanner.nextInt();
                                    System.out.print("Enter the interest rate: ");
                                    double interestRate = scanner.nextDouble();
                                    loanAccounts.add(new LoanAccount(customer, amount, interestRate, period));
                                    loanAccountCount++;
                                    System.out.println(loanAccounts.get(loanAccountCount - 1).toString());
                                    break;
                                }
                                default:
                                    System.out.println("Invalid Input!");
                                    break;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    boolean isValidAccount = false;
                    do {
                        System.out.print("Enter the account number: ");
                        int accountNumber = scanner.nextInt();
                        for (CurrentAccount currentAccount : currentAccounts) {
                            if (currentAccount.getAccountNumber() == accountNumber) {
                                System.out.print("Enter the amount: ");
                                double amount = scanner.nextDouble();
                                currentAccount.deposit(amount);
                                isValidAccount = true;
                                break;
                            }

                        }
                        for (SavingAccount savingAccount : savingAccounts) {
                            if (savingAccount.getAccountNumber() == accountNumber) {
                                System.out.print("Enter the amount: ");
                                double amount = scanner.nextDouble();
                                savingAccount.deposit(amount);
                                isValidAccount = true;
                                break;
                            }
                        }
                        if (!isValidAccount) {
                            System.out.println("Invalid Account Number!");
                        }
                    } while (!isValidAccount);
                    break;
                }
                case 4: {
                    boolean isValidAccount = false;
                    do {
                        System.out.print("Enter the account number: ");
                        int accountNumber = scanner.nextInt();
                        for (CurrentAccount currentAccount : currentAccounts) {
                            if (currentAccount.getAccountNumber() == accountNumber) {
                                System.out.print("Enter the amount: ");
                                double amount = scanner.nextDouble();
                                currentAccount.withdraw(amount);
                                isValidAccount = true;
                                break;
                            }

                        }
                        for (SavingAccount savingAccount : savingAccounts) {
                            if (savingAccount.getAccountNumber() == accountNumber) {
                                System.out.print("Enter the amount: ");
                                double amount = scanner.nextDouble();
                                savingAccount.withdraw(amount);
                                isValidAccount = true;
                                break;
                            }
                        }
                        if (!isValidAccount) {
                            System.out.println("Invalid Account Number!");
                        }
                    } while (!isValidAccount);
                    break;
                }
                case 5: {
                    boolean isValidAccount = false;
                    do {
                        System.out.print("Enter the debit account: ");
                        int debitAccount = scanner.nextInt();
                        System.out.print("Enter the credit account: ");
                        int creditAccount = scanner.nextInt();
                        System.out.print("Enter the amount: ");
                        double amount = scanner.nextDouble();
                        for (SavingAccount savingAccount : savingAccounts) {
                            for (CurrentAccount currentAccount : currentAccounts) {
                                if ((savingAccount.getAccountNumber() == debitAccount) && currentAccount.getAccountNumber() == creditAccount) {
                                    savingAccount.transferTo(currentAccount, amount);
                                    isValidAccount = true;
                                }
                                if ((currentAccount.getAccountNumber() == debitAccount) && (savingAccount.getAccountNumber() == creditAccount)) {
                                    currentAccount.transferTo(savingAccount, amount);
                                    isValidAccount = true;
                                }
                            }
                            for (SavingAccount savingAccount1 : savingAccounts) {
                                if (savingAccount.getAccountNumber() == debitAccount && savingAccount1.getAccountNumber() == creditAccount) {
                                    savingAccount.transferTo(savingAccount1, amount);
                                    isValidAccount = true;
                                }
                            }
                        }
                        for (CurrentAccount currentAccount : currentAccounts) {
                            for (CurrentAccount currentAccount1 : currentAccounts) {
                                if (currentAccount.getAccountNumber() == debitAccount && currentAccount1.getAccountNumber() == creditAccount) {
                                    currentAccount.transferTo(currentAccount1, amount);
                                    isValidAccount = true;
                                }
                            }
                        }
                        if (!isValidAccount) {
                            System.out.println("Invalid Account Number!");
                        }
                    } while (!isValidAccount);
                    break;
                }
                case 6:{
                    boolean isValidAccount = false;
                    do {
                        System.out.print("Enter the account number: ");
                        int accountNumber = scanner.nextInt();
                        for (SavingAccount savingAccount : savingAccounts) {
                            if (savingAccount.getAccountNumber() == accountNumber) {
                                System.out.println("Account balance is " + savingAccount.getBalance());
                                isValidAccount = true;
                            }
                        }
                        for (CurrentAccount currentAccount : currentAccounts) {
                            if (currentAccount.getAccountNumber() == accountNumber) {
                                System.out.println("Account balance is " + currentAccount.getBalance());
                                isValidAccount = true;
                            }
                        }
                        for (FixedDeposit fd : fixedDeposits) {
                            if (fd.getAccountNumber() == accountNumber) {
                                System.out.println("Account Balance is " + fd.getBalance());
                                isValidAccount = true;
                            }
                        }
                        if (!isValidAccount) {
                            System.out.println("Invalid Account Number!");
                        }
                    } while (!isValidAccount);
                    break;
                }

                case 7: {
                    boolean isValidAccount = false;
                    do {
                        System.out.print("Enter the customer number: ");
                        int customerNumber = scanner.nextInt();
                        for (Customer customer : customers) {
                            if (customer.customerNumber == customerNumber) {
                                System.out.println(customer.toString());
                                isValidAccount = true;
                            }
                        }
                        if (!isValidAccount) {
                            System.out.println("Invalid Account Number!");
                        }
                    } while (!isValidAccount);
                    break;
                }
                case 8:{
                    boolean isValidAccount = false;
                    do {
                        System.out.print("Enter the account number: ");
                        int accountNumber = scanner.nextInt();
                        for(SavingAccount savingAccount:savingAccounts) {
                            if (savingAccount.getAccountNumber() == accountNumber) {
                                System.out.println(savingAccount);
                                isValidAccount = true;
                            }
                        }
                        for(CurrentAccount currentAccount : currentAccounts){
                            if(currentAccount.getAccountNumber()==accountNumber){
                                System.out.println(currentAccount);
                                isValidAccount = true;
                            }
                        }
                        for(FixedDeposit fd : fixedDeposits){
                            if(fd.getAccountNumber()==accountNumber){
                                System.out.println(fd);
                                isValidAccount = true;
                            }
                        }
                        for(LoanAccount loanAccount:loanAccounts){
                            if(loanAccount.getAccountNumber()==accountNumber){
                                System.out.println(loanAccount);
                                isValidAccount = true;
                            }

                        }
                        if (!isValidAccount) {
                            System.out.println("Invalid Account Number!");
                        }
                    } while (!isValidAccount);
                    break;

                }
                case 9:{
                        for(Customer customer: customers){
                            System.out.println(customer.toString());
                        }
                    break;
                }
            }
        }while (option<10 && option>0);
    }
}



