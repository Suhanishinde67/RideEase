package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUser extends JFrame implements ActionListener {

    JTextField nameText, ageText, countryText,IDText, phoneText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox; 
    JButton add, back;

    AddUser() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1190, 590);
        panel.setLayout(null);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60, 30, 150, 27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200, 30, 150, 40);
        nameText.setBackground(new Color(16, 108, 115));
        nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel ageLabel = new JLabel("AGE");
        ageLabel.setBounds(60, 80, 150, 27);
        ageLabel.setFont(new Font("serif", Font.BOLD, 17));
        ageLabel.setForeground(Color.WHITE);
        panel.add(ageLabel);
        ageText = new JTextField();
        ageText.setBounds(200, 80, 150, 27);
        ageText.setBackground(new Color(16, 108, 115));
        ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel genderLabel = new JLabel("GENDER");
        genderLabel.setBounds(60, 120, 150, 27);
        genderLabel.setFont(new Font("serif", Font.BOLD, 17));
        genderLabel.setForeground(Color.WHITE);
        panel.add(genderLabel);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200, 120, 70, 27);
        radioButtonM.setBackground(new Color(3, 45, 48));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD, 14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280, 120, 100, 27);
        radioButtonF.setBackground(new Color(3, 45, 48));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD, 14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel phoneLabel = new JLabel("PHONE");
        phoneLabel.setBounds(60, 170, 150, 27);
        phoneLabel.setFont(new Font("serif", Font.BOLD, 17));
        phoneLabel.setForeground(Color.WHITE);
        panel.add(phoneLabel);
        phoneText = new JTextField();
        phoneText.setBounds(200, 170, 150, 30);
        phoneText.setBackground(new Color(16, 108, 115));
        phoneText.setFont(new Font("Tahoma", Font.BOLD, 14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel emailLabel = new JLabel("EMAIL");
        emailLabel.setBounds(60, 220, 150, 27);
        emailLabel.setFont(new Font("serif", Font.BOLD, 17));
        emailLabel.setForeground(Color.WHITE);
        panel.add(emailLabel);
        emailText = new JTextField();
        emailText.setBounds(200, 220, 150, 27);
        emailText.setBackground(new Color(16, 108, 115));
        emailText.setFont(new Font("Tahoma", Font.BOLD, 14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        JLabel countryLabel = new JLabel("COUNTRY");
        countryLabel.setBounds(60, 270, 150, 27);
        countryLabel.setFont(new Font("serif", Font.BOLD, 17));
        countryLabel.setForeground(Color.WHITE);
        panel.add(countryLabel);
        countryText = new JTextField();
        countryText.setBounds(200, 270, 150, 27);
        countryText.setBackground(new Color(16, 108, 115));
        countryText.setFont(new Font("Tahoma", Font.BOLD, 14));
        countryText.setForeground(Color.WHITE);
        panel.add(countryText);

        JLabel docLabel = new JLabel("ID TYPE");
        docLabel.setBounds(60, 320, 150, 27);
        docLabel.setFont(new Font("serif", Font.BOLD, 17));
        docLabel.setForeground(Color.WHITE);
        panel.add(docLabel);

        comboBox = new JComboBox(new String[] { "Passport", "Aadhar Card", "Voter ID", "Driving License" });
        comboBox.setBounds(200, 320, 150, 27);
        comboBox.setBackground(new Color(16, 108, 115));
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);
        
        JLabel docLabe2 = new JLabel("ID NUMBER");
        docLabe2.setBounds(60, 370, 150, 27);
        docLabe2.setFont(new Font("serif", Font.BOLD, 17));
        docLabe2.setForeground(Color.WHITE);
        panel.add(docLabe2);
        IDText = new JTextField();
        IDText.setBounds(200, 370, 150, 27);
        IDText.setBackground(new Color(16, 108, 115));
        IDText.setFont(new Font("Tahoma", Font.BOLD, 14));
        IDText.setForeground(Color.WHITE);
        panel.add(IDText);

        JLabel titleLabel = new JLabel("ADD USER DETAILS");
        titleLabel.setBounds(450, 24, 445, 35);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
        titleLabel.setForeground(Color.WHITE);
        panel.add(titleLabel);

        add = new JButton("ADD");
        add.setBounds(80, 520, 100, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200, 520, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 100, 300, 300);
        panel.add(label);

        setUndecorated(true);
        setLocation(430, 300);
        setLayout(null);
        setSize(1200, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String name = nameText.getText();
            String idnumber = IDText.getText();
            String age = ageText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String country = countryText.getText();
            String document = (String) comboBox.getSelectedItem();
            String gender = null;
            
            if (radioButtonM.isSelected()) {
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = "Female";
            }

            // SQL query to insert data into the database
            try {
                Con c = new Con();
                String query = "INSERT INTO user (document, id, age, name, gender, country, phone, email) " +
                               "VALUES ('" + document + "','" + idnumber + "', '" + age + "', '" + name + "', '" + gender + "', '" + country + "', '" + phone + "', '" + email + "')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "User Added Successfully");
                setVisible(false);

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddUser();
    }
}
