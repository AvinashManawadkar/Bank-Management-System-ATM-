import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener{

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    Signup3(String formno) {
       this.formno = formno;
        setLayout(null);

JLabel l1 = new JLabel("Page 3: Account Details");
l1.setFont(new Font("Raleway", Font.BOLD, 22));
l1.setBounds(280, 40, 400, 40);
add(l1);

JLabel type = new JLabel("Account Type");
type.setFont(new Font("Raleway", Font.BOLD, 22));
type.setBounds(100, 140, 200, 30);
add(type);

r1 = new JRadioButton("Saving Account");
        r1.setBounds(120, 180, 200, 30);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Fixed account");
        r2.setBounds(400, 180, 200, 30);
        r2.setBackground(Color.WHITE);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(120, 220, 200, 30);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4 = new JRadioButton("Recurring Account");
        r4.setBounds(400, 220, 200, 30);
        r4.setBackground(Color.WHITE);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number");
card.setFont(new Font("Raleway", Font.BOLD, 22));
card.setBounds(100, 280, 200, 30);
add(card);

JLabel number = new JLabel("xxxx-xxxx-xxxx-1193");
number.setFont(new Font("Raleway", Font.BOLD, 22));
number.setBounds(300, 280, 300, 30);
add(number);

JLabel cardDetail = new JLabel("This is your 16 digit number");
cardDetail.setFont(new Font("Raleway", Font.BOLD, 12));
cardDetail.setBounds(100, 320, 300, 20);
add(cardDetail);

 JLabel pin = new JLabel("PIN");
pin.setFont(new Font("Raleway", Font.BOLD, 22));
pin.setBounds(100, 350, 200, 30);
add(pin);

JLabel pinDetail = new JLabel("This is your 4 digit pin");
pinDetail.setFont(new Font("Raleway", Font.BOLD, 12));
pinDetail.setBounds(100, 390, 300, 20);
add(pinDetail);


JLabel pnumber = new JLabel("xxxx");
pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
pnumber.setBounds(300, 350, 300, 30);
add(pnumber);

JLabel service = new JLabel("Srevices Required");
service.setFont(new Font("Raleway", Font.BOLD, 22));
service.setBounds(100, 430, 200, 30);
add(service);

c1 = new JCheckBox("ATM CARD");
c1.setBackground(Color.white);
c1.setFont(new Font("Raleway", Font.BOLD, 16));
c1.setBounds(120, 480, 200, 30);
add(c1);

c2 = new JCheckBox("Internet Banking");
c2.setBackground(Color.white);
c2.setFont(new Font("Raleway", Font.BOLD, 16));
c2.setBounds(400, 480, 200, 30);
add(c2);

c3 = new JCheckBox("Mobile Banking");
c3.setBackground(Color.white);
c3.setFont(new Font("Raleway", Font.BOLD, 16));
c3.setBounds(120, 540, 200, 30);
add(c3);

c4 = new JCheckBox("Email and SMS Alerts");
c4.setBackground(Color.white);
c4.setFont(new Font("Raleway", Font.BOLD, 16));
c4.setBounds(400, 540, 200, 30);
add(c4);

c5 = new JCheckBox("Check Book");
c5.setBackground(Color.white);
c5.setFont(new Font("Raleway", Font.BOLD, 16));
c5.setBounds(120, 600, 200, 30);
add(c5);

c6 = new JCheckBox("E-Statement");
c6.setBackground(Color.white);
c6.setFont(new Font("Raleway", Font.BOLD, 16));
c6.setBounds(400, 600, 200, 30);
add(c6);

c7 = new JCheckBox("I heared by declares that the above entered details are correct to the best of my knowledge.");
c7.setBackground(Color.white);
c7.setFont(new Font("Raleway", Font.BOLD, 12));
c7.setBounds(80, 680, 700, 30);
add(c7);

 submit = new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.black);
        submit.setFont(new Font("Raleway", Font.BOLD, 18));
        submit.setBounds(200, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.black);
        cancel.setFont(new Font("Raleway", Font.BOLD, 18));
        cancel.setBounds(400, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);


setSize(850, 820);
setLocation(350, 0);
setVisible(true);
    }

public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == submit) {
            String accountType = null;
             if (r1.isSelected()) {
           accountType = "Saving Account";
        } else if (r2.isSelected()) {
            accountType = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            accountType = "Current Account";
        } else if (r4.isSelected()) {
            accountType = "Recurring Deposit Account";
        } 

        Random random = new Random();
     String cardnumber ="" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

     String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

     String facility = "";

     if (c1.isSelected()) {
        facility = facility + "ATM Card";
     } else if (c2.isSelected()) {
        facility = facility + " Internet Banking";
     } else if (c3.isSelected()) {
        facility = facility + " Mobile Banking";
     } else if (c4.isSelected()) {
        facility = facility + " Email & SMS Alerts";
     } else if (c5.isSelected()) {
        facility = facility + " Check Book";
     } else if (c6.isSelected()) {
        facility = facility + " E-Statement";
     }

      try {
if (accountType.equals("")) {
    JOptionPane.showMessageDialog(null, "Account Type is Required");
} else {
    Conn c = new Conn();
    String query1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
        c.s.executeUpdate(query1);
    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
        c.s.executeUpdate(query2);
        JOptionPane.showMessageDialog(null, "Card number " + cardnumber + "\n pin: " + pinnumber);
         setVisible(false);
         new Deposit(pinnumber).setVisible(false);
}
      } catch (Exception e) {
        System.out.println(e);
      }

    } else if (ae.getSource() == cancel) {
    setVisible(false);
    new Login().setVisible(true);
    }      
  }
    public static void main(String args[]) {
   new Signup3("");
    }
}
