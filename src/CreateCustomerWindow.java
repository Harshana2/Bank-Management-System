import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CreateCustomerWindow extends JFrame implements ActionListener {
    ArrayList<Customer> customers = new ArrayList<>();
    private JTextField nameField, idNumberField, genderField, cityField, phoneNumberField;
    private JButton submitButton, backButton;


    public CreateCustomerWindow() {
        super("Create a Customer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create text fields for user input
        nameField = new JTextField(20);
        idNumberField = new JTextField(20);
        genderField = new JTextField(20);
        cityField = new JTextField(20);
        phoneNumberField = new JTextField(20);

        // Create buttons for submit and back
        submitButton = new JButton("Submit");
        backButton = new JButton("Back");

        // Add action listeners to buttons
        submitButton.addActionListener(this);
        backButton.addActionListener(this);

        // Create panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("ID Number:"));
        inputPanel.add(idNumberField);
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("City:"));
        inputPanel.add(cityField);
        inputPanel.add(new JLabel("Phone Number:"));
        inputPanel.add(phoneNumberField);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(submitButton);
        buttonPanel.add(backButton);

        // Add panels to frame
        getContentPane().add(inputPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String idNumber = idNumberField.getText();
            String gender = genderField.getText();
            String city = cityField.getText();
            String phoneNumber = phoneNumberField.getText();

            // Create new customer object
            Customer customer = new Customer(name, idNumber, gender, city, phoneNumber);
            customers.add(customer);

            // Add customer to list of customers
            // customers.add(customer);

            // Display success message
            JOptionPane.showMessageDialog(this, "Customer has been successfully created!\nCustomer number = " + customer.customerNumber);

            // Clear input fields
            nameField.setText("");
            idNumberField.setText("");
            genderField.setText("");
            cityField.setText("");
            phoneNumberField.setText("");
        } else if (e.getSource() == backButton) {
            dispose();// Close this window and go back to main menu
            BankManagementSystem bankManagementSystem = new BankManagementSystem();
        }
    }
}
