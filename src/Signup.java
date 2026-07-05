package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Signup extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField textField2;
    JPasswordField passwordField1;

    Signup() {
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

        JPanel panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setBounds(650, 100, 650, 100);
        panel6.setBackground(Color.WHITE);
        contentPanel.add(panel6);

        JLabel label15 = new JLabel("Please enter your username");
        label15.setFont(new Font("Tahoma", Font.PLAIN, 30));
        label15.setForeground(Color.BLACK);
        label15.setBounds(140, 25, 500, 40);
        panel6.add(label15);

        textField2 = new JTextField();
        textField2.setBounds(850, 200, 250, 50);
        textField2.setForeground(Color.BLACK);
        textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField2.setBackground(Color.GRAY);
        contentPanel.add(textField2);

        JPanel panel7 = new JPanel();
        panel7.setLayout(null);
        panel7.setBounds(650, 280, 650, 100);
        panel7.setBackground(Color.WHITE);
        contentPanel.add(panel7);

        JLabel label16 = new JLabel("Please enter your password");
        label16.setFont(new Font("Tahoma", Font.PLAIN, 30));
        label16.setForeground(Color.BLACK);
        label16.setBounds(140, 25, 500, 40);
        panel7.add(label16);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(850, 380, 250, 50);
        passwordField1.setForeground(Color.BLACK);
        passwordField1.setBackground(Color.GRAY);
        contentPanel.add(passwordField1);

        b1 = new JButton("Sign Up");
        b1.setBounds(850, 480, 250, 50);
        b1.setFont(new Font("Serif", Font.BOLD, 15));
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        contentPanel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(850, 580, 250, 50);
        b2.setFont(new Font("Serif", Font.BOLD, 15));
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        contentPanel.add(b2);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 760, 1350, 300);
        panel.setBackground(new Color(254, 238, 226));
        contentPanel.add(panel);
        JLabel label89 = new JLabel("Moving people, and the world");
        label89.setFont(new Font("Tahoma", Font.BOLD, 60));
        label89.setForeground(Color.BLACK);
        label89.setBounds(220, 35, 1200, 60); 
        panel.add(label89);
        JLabel label79 = new JLabel("(Already have an account? Please sign in)");
        label79.setFont(new Font("Tahoma", Font.PLAIN, 40));
        label79.setForeground(Color.GRAY);
        label79.setBounds(305, 130, 1230, 60); 
        panel.add(label79);
        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/airport.jpg"));
        Image image1 = imageIcon1.getImage().getScaledInstance(600, 450, Image.SCALE_DEFAULT);
        JLabel label4 = new JLabel(new ImageIcon(image1));
        label4.setBounds(1300, 70, 600, 450);
        contentPanel.add(label4);
        
        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/Intercity.jpg"));
        Image image2 = imageIcon2.getImage().getScaledInstance(600, 450, Image.SCALE_DEFAULT);
        JLabel label5 = new JLabel(new ImageIcon(image2));
        label5.setBounds(10, 70, 600, 450);
        contentPanel.add(label5);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabBK", "root", "$uhan!@3110");
                String user = textField2.getText();
                String pass = new String(passwordField1.getPassword());

                if (user.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Username or password cannot be empty");
                    return;
                }

                String query = "INSERT INTO login(username, password) VALUES (?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, user);
                pstmt.setString(2, pass);
                int result = pstmt.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Signup Successful!");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Signup Failed. Try Again.");
                }
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while signing up.");
            }
        } else {
            new Home2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
