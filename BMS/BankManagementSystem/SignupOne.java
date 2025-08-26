
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
    long random;
    
    JTextField nameTextfield, dobTextField, fathernameTextFild, emailTextFild, addressTextFild, cityTextFild, stateTextFild, pincodeTextFild;
    JButton next;
    JRadioButton male, Female, single, married;
    JDateChooser dateChooser;
   
    SignupOne() {
        setLayout(null);

        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L) + 1000L;

        JLabel formno = new JLabel("Application Form NO." + random);
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140, 50, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personDetails.setBounds(260, 100, 400, 30);
        add(personDetails);
     
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD,22));
        name.setBounds(200, 150, 200, 30);
        add(name);

        nameTextfield = new JTextField();
        nameTextfield.setFont(new Font("Raleway", Font.BOLD,20));
        nameTextfield.setBounds(380, 150, 400, 30);
        add(nameTextfield);

        JLabel fathername = new JLabel("Father Name:");
        fathername.setFont(new Font("Raleway", Font.BOLD,20));
        fathername.setBounds(200, 200, 200, 30);
        add(fathername);

        fathernameTextFild = new JTextField();
        fathernameTextFild.setFont(new Font("Raleway", Font.BOLD,20));
        fathernameTextFild.setBounds(380, 200, 400, 30);
        add(fathernameTextFild);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD,22));
        dob.setBounds(200, 250, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        this.dateChooser.setBounds(380, 250, 400, 30);
        this.dateChooser.setForeground(new Color(105, 105, 105));
        add(this.dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD,22));
        gender.setBounds(200, 300, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(380, 300, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);

        Female = new JRadioButton("Female");
        Female.setBounds(500, 300, 100, 30);
        Female.setBackground(Color.WHITE);
        add(Female);
 
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(Female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD,22));
        email.setBounds(200, 350, 200, 30);
        add(email);

        emailTextFild = new JTextField();
        emailTextFild.setFont(new Font("Raleway", Font.BOLD,20));
       emailTextFild.setBounds(380, 350, 400, 30);
        add(emailTextFild);

        JLabel maritalstatus = new JLabel("Marital Status:");
        maritalstatus.setFont(new Font("Raleway", Font.BOLD,22));
        maritalstatus.setBounds(200, 400, 200, 30);
        add(maritalstatus);

        single = new JRadioButton("Single");
        single.setBounds(380, 400, 100, 30);
        single.setBackground(Color.WHITE);
        add(single);

        married = new JRadioButton("Married");
        married.setBounds(500, 400, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
 
        ButtonGroup maritalstatusgroup = new ButtonGroup();
        maritalstatusgroup.add(single);
         maritalstatusgroup.add(married);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Raleway", Font.BOLD,22));
        address.setBounds(200, 450, 200, 30);
        add(address);

        addressTextFild = new JTextField();
        addressTextFild.setFont(new Font("Raleway", Font.BOLD,20));
       addressTextFild.setBounds(380, 450, 400, 30);
        add(addressTextFild);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD,22));
        city.setBounds(200, 500, 200, 30);
        add(city);

        cityTextFild = new JTextField();
        cityTextFild.setFont(new Font("Raleway", Font.BOLD,20));
       cityTextFild.setBounds(380, 500, 400, 30);
        add(cityTextFild);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD,22));
        state.setBounds(200, 550, 200, 30);
        add(state);

        stateTextFild = new JTextField();
        cityTextFild.setFont(new Font("Raleway", Font.BOLD,20));
       stateTextFild.setBounds(380, 550, 400, 30);
        add(stateTextFild);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD,22));
        pincode.setBounds(200, 600, 200, 30);
        add(pincode);

        pincodeTextFild = new JTextField();
        pincodeTextFild.setFont(new Font("Raleway", Font.BOLD,20));
       pincodeTextFild.setBounds(380, 600, 400, 30);
        add(pincodeTextFild);

        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.black);
        next.setFont(new Font("Raleway", Font.BOLD, 18));
        next.setBounds(680, 650, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
       setSize(850,800);
       setLocation(350, 10);
       setVisible(true);
}

    public void actionPerformed(ActionEvent ae) {
        String formno = ""  + random;
        String name = nameTextfield.getText();
        String fathername = fathernameTextFild.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (Female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextFild.getText();
        String maritalstatus = null;
        if (single.isSelected()) {
            maritalstatus = "single";
        } else if(married.isSelected()) {
            maritalstatus = "Married";
        }

        String address = addressTextFild.getText();
        String state = stateTextFild.getText();
        String pincode = pincodeTextFild.getText();
         String city = cityTextFild.getText();

        try {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "is Required");
        } else {
            Conn c = new Conn();
            
            String query = "insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+maritalstatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new SignuTwo(formno).setVisible(true);
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
       new SignupOne();
      
       
    }
}

