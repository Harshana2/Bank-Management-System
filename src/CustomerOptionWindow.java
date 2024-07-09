import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerOptionWindow extends JFrame implements ActionListener {
    private JButton newCustomerBtn;
    private JButton existingCustomerBtn;

    public CustomerOptionWindow() {
        setTitle("Customer Option");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 5, 5));

        newCustomerBtn = new JButton("New Customer");
        newCustomerBtn.addActionListener(this);
        panel.add(newCustomerBtn);

        existingCustomerBtn = new JButton("Existing Customer");
        existingCustomerBtn.addActionListener(this);
        panel.add(existingCustomerBtn);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newCustomerBtn) {
            dispose();
            CreateCustomerWindow createCustomerWindow = new CreateCustomerWindow();
        } else if (e.getSource() == existingCustomerBtn) {
            CustomerNumberWindow customerNumberWindow = new CustomerNumberWindow();
        }
        dispose();
    }
}
