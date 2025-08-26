import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class SignuTwo extends JFrame implements ActionListener {

    JTextField pan, adhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox<String> religion, categoryy, soccupation, education, incomee;
    String formno;

    SignuTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(260, 100, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(200, 150, 200, 30);
        add(name);

        String[] rl = {"Hindu", "Muslim", "Sikh"};
        religion = new JComboBox<String>(rl);
        religion.setBounds(380, 150, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fathername = new JLabel("Category:");
        fathername.setFont(new Font("Raleway", Font.BOLD, 20));
        fathername.setBounds(200, 200, 200, 30);
        add(fathername);

        String[] category = {"General", "OBC", "SC", "ST", "OTHER"};
        categoryy = new JComboBox<String>(category);
        categoryy.setBounds(380, 200, 400, 30);
        categoryy.setBackground(Color.WHITE);
        add(categoryy);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(200, 250, 200, 30);
        add(dob);

        String[] income = {"< 50000", "< 100000", "< 200000", "< 300000", "more than 500000"};
        incomee = new JComboBox<String>(income);
        incomee.setBounds(380, 250, 400, 30);
        incomee.setBackground(Color.WHITE);
        add(incomee);

        JLabel gender = new JLabel("Education:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(200, 300, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(200, 330, 200, 30);
        add(email);

        String[] edu = {"< 10th", "PUC", "< BSc", "BCA", "BTECH"};
        education = new JComboBox<String>(edu);
        education.setBounds(380, 320, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel maritalstatus = new JLabel("Occupation:");
        maritalstatus.setFont(new Font("Raleway", Font.BOLD, 22));
        maritalstatus.setBounds(200, 400, 200, 30);
        add(maritalstatus);

        String[] occupation = {"Salaried", "Self Employed", "Businessman", "Student", "Retired"};
        soccupation = new JComboBox<String>(occupation);
        soccupation.setBounds(380, 400, 400, 30);
        soccupation.setBackground(Color.WHITE);
        add(soccupation);

        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(200, 450, 200, 30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(380, 450, 400, 30);
        add(pan);

        JLabel city = new JLabel("Aadhar No:");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(200, 500, 200, 30);
        add(city);

        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", Font.BOLD, 20));
        adhar.setBounds(380, 500, 400, 30);
        add(adhar);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(200, 550, 200, 30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(400, 550, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(500, 550, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(200, 600, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(400, 600, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(500, 600, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 18));
        next.setBounds(680, 650, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String category = (String) categoryy.getSelectedItem();
        String income = (String) incomee.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String occupation = (String) soccupation.getSelectedItem();

        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String span = pan.getText();
        String sadhar = adhar.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + category + "','" + income + "','" + seducation + "','" + occupation + "','" + span + "','" + sadhar + "','" + seniorcitizen + "','" + existingaccount + "')";
            c.s.executeUpdate(query);

            // Go to next page
            setVisible(false);
            new Signup3(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignuTwo("");
    }
}
