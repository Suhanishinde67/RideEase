package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FinalLoginAdmin extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField textField1, textField2;
    JPasswordField passwordField1;

    FinalLoginAdmin() {
        super("Cab Booking Application");
        setLayout(null);
        setSize(1950, 1160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBounds(0, 0, 1920, 1160);
        contentPanel.setBackground(Color.WHITE);
        add(contentPanel);  

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 1920, 50);
        panel2.setBackground(Color.BLACK);
        contentPanel.add(panel2);

        JPanel panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(1200, 200, 650, 100);
        panel4.setBackground(Color.WHITE);
        contentPanel.add(panel4);

        JLabel label9 = new JLabel("What's your phone number?");
        label9.setFont(new Font("Tahoma", Font.PLAIN, 30));
        label9.setForeground(Color.BLACK);
        label9.setBounds(140, 25, 500, 40);
        panel4.add(label9);

        textField1 = new JTextField();
        textField1.setBounds(1440, 320, 250, 50);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField1.setBackground(Color.BLACK);
        contentPanel.add(textField1);

        JPanel panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setBounds(1200, 390, 650, 100);
        panel6.setBackground(Color.WHITE);
        contentPanel.add(panel6);

        JLabel label15 = new JLabel("Please enter your username");
        label15.setFont(new Font("Tahoma", Font.PLAIN, 30));
        label15.setForeground(Color.BLACK);
        label15.setBounds(140, 25, 500, 40);
        panel6.add(label15);

        textField2 = new JTextField();
        textField2.setBounds(1440, 490, 250, 50);
        textField2.setForeground(Color.WHITE);
        textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField2.setBackground(Color.BLACK);
        contentPanel.add(textField2);

        JPanel panel7 = new JPanel();
        panel7.setLayout(null);
        panel7.setBounds(1200, 580, 650, 100);
        panel7.setBackground(Color.WHITE);
        contentPanel.add(panel7);

        JLabel label16 = new JLabel("Please enter your password");
        label16.setFont(new Font("Tahoma", Font.PLAIN, 30));
        label16.setForeground(Color.BLACK);
        label16.setBounds(140, 25, 500, 40);
        panel7.add(label16);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(1440, 680, 250, 50);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(Color.BLACK);
        contentPanel.add(passwordField1);

        b1 = new JButton("Login");
        b1.setBounds(1400, 800, 120, 40);
        b1.setFont(new Font("Serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        contentPanel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(1600, 800, 120, 40);
        b2.setFont(new Font("Serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        contentPanel.add(b2);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/way.jpg"));
        Image image1 = imageIcon1.getImage().getScaledInstance(1180, 990, Image.SCALE_DEFAULT);
        JLabel label4 = new JLabel(new ImageIcon(image1));
        label4.setBounds(5, 100, 1180, 990);
        contentPanel.add(label4);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Con c = new Con();
                String user = textField2.getText();
                String pass = passwordField1.getText();

                String q = "SELECT * FROM loginAdmin WHERE username = '" + user + "' AND password = '" + pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    new Admin2();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new FinalLoginAdmin();
    }
}
