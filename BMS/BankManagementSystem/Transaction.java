import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener {

    JButton deposit, withdrawl, miniStatement, pinchange, fastcash, balanceenquiry, exit;
    String pinnumber;
    Transaction(String pinnumber) {
       
        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
      

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("Deposite");
               deposit.setBounds(170, 415, 150, 30);
               deposit.addActionListener(this);
               image.add(deposit);

                 withdrawl = new JButton("Withdraw");
               withdrawl.setBounds(355, 415, 150, 30);
             withdrawl.addActionListener(this);
               image.add(withdrawl);

               fastcash = new JButton("Fastcash");
               fastcash.setBounds(355, 450, 150, 30);
               fastcash.addActionListener(this);
               image.add(fastcash);

                miniStatement = new JButton("MiniStatement");
               miniStatement.setBounds(170, 450, 150, 30);
               miniStatement.addActionListener(this);
               image.add(miniStatement);

                pinchange = new JButton("Change Pin");
               pinchange.setBounds(170, 485, 150, 30);
               pinchange.addActionListener(this);
               image.add(pinchange);

                balanceenquiry = new JButton("Balance Enquiry");
               balanceenquiry.setBounds(355, 485, 150, 30);
               balanceenquiry.addActionListener(this);
               image.add(balanceenquiry);

                 exit = new JButton("Exit");
               exit.setBounds(355, 525, 150, 25);
               exit.addActionListener(this);
               image.add(exit);
 
       setSize(900, 900);
        setLocation(300,  0);
         setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == withdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new Faastcash(pinnumber).setVisible(true);
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new pinchange(pinnumber).setVisible(true);
        } else if (ae.getSource() == balanceenquiry) {
            setVisible(false);
            new balanceenquiry(pinnumber).setVisible(true);
        } else if (ae.getSource() == miniStatement) {
            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
new Transaction("");
    }
}
