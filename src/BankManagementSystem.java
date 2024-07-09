import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankManagementSystem extends JFrame {

    public BankManagementSystem() {
        setTitle("Bank Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400, 300);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton btnCreateCustomer = new JButton("Create a Customer");
        JButton btnOpenAccount = new JButton("Open an Account");
        JButton btnDeposit = new JButton("Deposit");
        JButton btnWithdrawal = new JButton("Withdrawal");
        JButton btnMoneyTransfer = new JButton("Money Transfer");
        JButton btnBalanceInquiry = new JButton("Balance Inquiry");
        JButton btnCustomerInquiry = new JButton("Customer Inquiry");
        JButton btnAccountInquiry = new JButton("Account Inquiry");
        JButton btnShowAllCustomers = new JButton("Show all customer details");
        JButton btnExit = new JButton("Exit");

        panel.add(btnCreateCustomer);
        panel.add(btnOpenAccount);
        panel.add(btnDeposit);
        panel.add(btnWithdrawal);
        panel.add(btnMoneyTransfer);
        panel.add(btnBalanceInquiry);
        panel.add(btnCustomerInquiry);
        panel.add(btnAccountInquiry);
        panel.add(btnShowAllCustomers);
        panel.add(btnExit);

        btnCreateCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                CreateCustomerWindow createCustomerWindow = new CreateCustomerWindow();
            }
        });

        btnOpenAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                CustomerOptionWindow customerOptionWindow = new CustomerOptionWindow();
            }
        });

        btnDeposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle deposit button click
            }
        });

        btnWithdrawal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle withdrawal button click
            }
        });

        btnMoneyTransfer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle money transfer button click
            }
        });

        btnBalanceInquiry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle balance inquiry button click
            }
        });

        btnCustomerInquiry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle customer inquiry button click
            }
        });

        btnAccountInquiry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle account inquiry button click
            }
        });

        btnShowAllCustomers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle show all customers button click
            }
        });

        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BankManagementSystem();
    }
}
