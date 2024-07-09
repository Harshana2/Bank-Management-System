import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyGui extends JFrame implements ActionListener {
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<SavingAccount> savingAccounts = new ArrayList<>();
    ArrayList<CurrentAccount> currentAccounts = new ArrayList<>();
    ArrayList<FixedDeposit> fixedDeposits = new ArrayList<>();
    ArrayList<LoanAccount> loanAccounts = new ArrayList<>();
    JFrame frame1  = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();
    JLabel label1 = new JLabel("Select an Option");
    JLabel label2 = new JLabel("Name");
    JLabel label3 = new JLabel("ID Number");
    JLabel label4 = new JLabel("Gender");
    JLabel label5 = new JLabel("City");
    JLabel label6 = new JLabel("Phone Number");

    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JTextField textField4 = new JTextField();
    JTextField textField5 = new JTextField();



    Font fnt1 =new Font("Arial",Font.BOLD,24);
    Font fnt2 =new Font("Arial",Font.BOLD,20);
    JPanel panel1 =new JPanel();


    JButton button1 = new JButton("Create a Customer");
    JButton button2 = new JButton("Open an Account");
    JButton button3 = new JButton("Deposit");
    JButton button4 = new JButton("Withdraw");
    JButton button5 = new JButton("Money Transfer");
    JButton button6 = new JButton("Balance Inquiry");
    JButton button7 = new JButton("Customer Inquiry");
    JButton button8 = new JButton("Account Inquiry");
    JButton button9 = new JButton("Show All Customer Details");
    JButton button10 = new JButton("Exit");
    JButton button11 = new JButton("Submit");
    JButton button12 = new JButton("Back");
    JButton button = new JButton("OK");


    MyGui(){
        frame1.setTitle("Bank Management System");
        frame1.setSize(720,700);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        //frame1.getContentPane().setBackground(new Color(234,182,118));





        label1.setFont(fnt1);
        label1.setBounds(10,10,500,55);
        //label1.setLocation(10,10);

        button1.setSize(300,50);
        button1.setLocation(10,60);
        button1.setFont(fnt2);
        button1.setFocusable(false);
        button1.addActionListener(this);


        button2.setSize(300,50);
        button2.setLocation(10,115);
        button2.setFont(fnt2);
        button2.setFocusable(false);

        button3.setSize(300,50);
        button3.setLocation(10,170);
        button3.setFont(fnt2);
        button3.setFocusable(false);

        button4.setSize(300,50);
        button4.setLocation(10,225);
        button4.setFont(fnt2);
        button4.setFocusable(false);

        button5.setSize(300,50);
        button5.setLocation(10,280);
        button5.setFont(fnt2);
        button5.setFocusable(false);

        button6.setSize(300,50);
        button6.setLocation(10,335);
        button6.setFont(fnt2);
        button6.setFocusable(false);

        button7.setSize(300,50);
        button7.setLocation(10,390);
        button7.setFont(fnt2);
        button7.setFocusable(false);

        button8.setSize(300,50);
        button8.setLocation(10,445);
        button8.setFont(fnt2);
        button8.setFocusable(false);

        button9.setSize(300,50);
        button9.setLocation(10,500);
        button9.setFont(fnt2);
        button9.setFocusable(false);

        button10.setSize(300,50);
        button10.setLocation(10,555);
        button10.setFont(fnt2);
        button10.setFocusable(false);

        frame1.add(panel1);
        panel1.setLayout(null);

        panel1.add(label1);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button10);




    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){

            frame2.setTitle("Bank Management System");
            frame2.setSize(720,700);
            frame2.setResizable(false);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setVisible(true);
            frame1.dispose();

            JPanel panel2 = new JPanel();
            frame2.add(panel2);
            panel2.setLayout(null);


            label2.setFont(fnt2);
            label2.setVerticalAlignment(JLabel.TOP);
            label2.setHorizontalAlignment(JLabel.NORTH_EAST);
            label2.setBounds(10,20,500,55);
            textField1.setBounds(200,20,300,30);
            textField1.setFont(fnt2);

            label3.setFont(fnt2);
            label3.setVerticalAlignment(JLabel.TOP);
            label3.setHorizontalAlignment(JLabel.NORTH_EAST);
            label3.setBounds(10,70,500,55);
            textField2.setBounds(200,70,300,30);
            textField2.setFont(fnt2);

            label4.setFont(fnt2);
            label4.setVerticalAlignment(JLabel.TOP);
            label4.setHorizontalAlignment(JLabel.NORTH_EAST);
            label4.setBounds(10,120,500,55);
            textField3.setBounds(200,120,300,30);
            textField3.setFont(fnt2);

            label5.setFont(fnt2);
            label5.setVerticalAlignment(JLabel.TOP);
            label5.setHorizontalAlignment(JLabel.NORTH_EAST);
            label5.setBounds(10,170,500,55);
            textField4.setBounds(200,170,300,30);
            textField4.setFont(fnt2);

            label6.setFont(fnt2);
            label6.setVerticalAlignment(JLabel.TOP);
            label6.setHorizontalAlignment(JLabel.NORTH_EAST);
            label6.setBounds(10,220,500,55);
            textField5.setBounds(200,220,300,30);
            textField5.setFont(fnt2);

            button12.setBounds(10,400,100,50);
            button11.setBounds(250,300,100,50);
            button11.addActionListener(this);
            button12.addActionListener(this);


            panel2.add(label2);
            panel2.add(label3);
            panel2.add(label4);
            panel2.add(label5);
            panel2.add(label6);
            panel2.add(textField1);
            panel2.add(textField2);
            panel2.add(textField3);
            panel2.add(textField4);
            panel2.add(textField5);
            panel2.add(button12);
            panel2.add(button11);

        }
        if(e.getSource()==button11){
            String name = textField1.getText();
            String idNumber = textField2.getText();
            String gender = textField3.getText();
            String city = textField4.getText();
            String phoneNumber = textField5.getText();
            customers.add(new Customer(name, idNumber, gender, city, phoneNumber));

            frame3.setTitle("Bank Management System");
            frame3.setSize(400,300);
            frame3.setResizable(false);
            frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame3.setVisible(true);
            frame2.dispose();


            JPanel panel = new JPanel();
            panel.setLayout(null);
            frame3.add(panel);

            JLabel label = new JLabel("Account Created Successfully!");
            label.setBounds(100,70,300,20);



            button.setBounds(150,120,80,40);
            button.setFocusable(false);
            panel.add(button);
            panel.add(label);
            button.addActionListener(this);

        }
        if(e.getSource()==button){
            frame3.dispose();
            frame2.setVisible(true);
        }
        if(e.getSource()==button12){
            frame2.dispose();
            frame1.setVisible(true);
        }


        //for(Customer customer:customers) System.out.println(customer);
    }

}


