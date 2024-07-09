import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerNumberWindow extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton submitButton;
    private JButton backButton;

    public CustomerNumberWindow() {
        super("Customer Number");

        // Initialize components
        label = new JLabel("Enter the Customer Number:");
        textField = new JTextField(20);
        submitButton = new JButton("Submit");
        backButton = new JButton("Back");

        // Set layout
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(label, gc);
        gc.gridy = 1;
        add(textField, gc);
        gc.gridy = 2;
        add(submitButton, gc);
        gc.gridx = 1;
        add(backButton, gc);

        // Set window properties
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add action listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BankManagementSystem bankManagementSystem = new BankManagementSystem();
            }
        });

        setVisible(true);
    }

    // Method to check if customer number is valid

}
