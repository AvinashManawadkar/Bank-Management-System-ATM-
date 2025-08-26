import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {
    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 360, 200);
        add(mini);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 200, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 60, 300, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 350, 20);
        add(balance);

        int bal = 0;

        try {
            Conn conn = new Conn();

            // ✅ Fetch transactions from bank table
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");

            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" 
                    + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;" 
                    + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;" 
                    + rs.getString("amount") + "<br><br></html>");

                String type = rs.getString("type");
                int amount = Integer.parseInt(rs.getString("amount"));

                // ✅ Proper balance calculation
                if (type.equalsIgnoreCase("Deposit")) {
                    bal += amount;
                } else if (type.equalsIgnoreCase("Withdraw")) {
                    bal -= amount;
                }
            }

            // ✅ Fetch card number from login table
            ResultSet rs2 = conn.s.executeQuery("select * from login where pin = '" + pinnumber + "'");
            if (rs2.next()) {
                String cardNum = rs2.getString("cardnumber");
                card.setText("Card Number: " + cardNum.substring(0, 4) + "XXXXXXXX" + cardNum.substring(12));
            }

            balance.setText("Your current account balance is Rs " + bal);

        } catch (Exception e) {
            e.printStackTrace();
        }

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("1234"); // Pass valid PIN here
    }
}
