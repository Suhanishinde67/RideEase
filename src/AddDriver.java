package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

public class AddDriver extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, statusText, licenceText, phoneText, aadharText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox, t5;
    JButton add,back;
    AddDriver(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1190, 590);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,40);
        nameText.setBackground(new Color(16,108,115));
        nameText.setFont(new Font("Tahoma", Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif", Font.BOLD, 17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(16,108,115));
        ageText.setFont(new Font("Tahoma", Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(3,45,48));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel licence = new JLabel("LICENCE");
        licence.setBounds(60,170,150,27);
        licence.setFont(new Font("serif", Font.BOLD, 17));
        licence.setForeground(Color.WHITE);
        panel.add(licence);
        licenceText = new JTextField();
        licenceText.setBounds(200,170,150,30);
        licenceText.setBackground(new Color(16,108,115));
        licenceText.setFont(new Font("Tahoma", Font.BOLD,14));
        licenceText.setForeground(Color.WHITE);
        panel.add(licenceText);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(16,108,115));
        salaryText.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);
        

        JLabel phone = new JLabel("PHONE ");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(16,108,115));
        phoneText.setFont(new Font("Tahoma", Font.BOLD,14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("serif", Font.BOLD, 17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);
        aadharText = new JTextField();
        aadharText.setBounds(200,320,150,27);
        aadharText.setBackground(new Color(16,108,115));
        aadharText.setFont(new Font("Tahoma", Font.BOLD,14));
        aadharText.setForeground(Color.WHITE);
        panel.add(aadharText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(new Color(16,108,115));
        emailText.setFont(new Font("Tahoma", Font.BOLD,14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);
        
        JLabel status = new JLabel("STATUS");
        status.setBounds(60,420,420,27);
        status.setFont(new Font("serif", Font.BOLD, 17));
        status.setForeground(Color.WHITE);
        panel.add(status);
        statusText = new JTextField();
        statusText.setBounds(200,420,150,27);
        statusText.setBackground(new Color(16,108,115));
        statusText.setFont(new Font("Tahoma", Font.BOLD,14));
        statusText.setForeground(Color.WHITE);
        panel.add(statusText);

        JLabel l5 = new JLabel("Location");
        l5.setBounds(64,470,152,33);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 =new JComboBox(new String[]{"Pune","Hadapsar","Koregaon park","Hinjewadi","Viman Nagar","Kharadi","PCMC","Wakad","Kalyani Nagar","Kothrud"});
        t5.setBounds(200,470,156,30);
        t5.setFont(new Font("Tahoma", Font.BOLD, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);
        
        JLabel AED = new JLabel("ADD DRIVER DETAILS");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,520,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,520,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(430,300);
        setLayout(null);
        setSize(1200,600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String licence = licenceText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();  
            String salary = salaryText.getText();
            String location = (String)  t5.getSelectedItem();
            String status = statusText.getText();
            String ID = aadharText.getText(); 
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = " Female";
            }

            
            try{
                Con c = new Con();
                String q = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+ID+"', '"+licence+"','"+email+"', '"+phone+"', '"+salary+"','"+status+"','"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Added Successfully");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }


        }else{
           setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddDriver();
    }
}
