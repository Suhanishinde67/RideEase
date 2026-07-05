package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BookRide2 extends JFrame implements ActionListener {
    JTextField t2, t3, t4;
    JButton b1, b2;

    BookRide2() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1190, 690);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Please enter your details for confirmation");
        l1.setBounds(150, 25, 900, 50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 40));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Pickup Location");
        l2.setBounds(200, 180, 300, 40);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(480, 180, 200, 35);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16, 108, 115));
        panel.add(t2);

        JLabel l3 = new JLabel("Destination");
        l3.setBounds(200, 330, 300, 40);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 = new JTextField();
        t3.setBounds(480, 330, 200, 35);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16, 108, 115));
        panel.add(t3);

        JLabel l4 = new JLabel("Route (Via)");
        l4.setBounds(200, 480, 300, 40);
        l4.setFont(new Font("Tahoma", Font.BOLD, 25));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(480, 480, 200, 35);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16, 108, 115));
        panel.add(t4);

        b1 = new JButton("Confirm");
        b1.setBounds(64, 600, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198, 600, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/google.png"));
        Image image = imageIcon1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(80,150,100,100);
        panel.add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/google.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(80,300,100,100);
        panel.add(label2);

        ImageIcon imageIcon5 = new ImageIcon(ClassLoader.getSystemResource("icon/google.png"));
        Image image4 = imageIcon5.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon15 = new ImageIcon(image4);
        JLabel label5 = new JLabel(imageIcon15);
        label5.setBounds(80,450,100,100);
        panel.add(label5);

        setUndecorated(true);
        setLocation(600, 200);
        setLayout(null);
        setSize(1200, 700);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Con c = new Con();
                String location = t2.getText();
                String destination = t3.getText();
                String route = t4.getText();

                if (location.isEmpty() || destination.isEmpty() || route.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required!");
                    return;
                }

                String q = "INSERT INTO bookRide (location, destination, route) VALUES (?, ?, ?)";
                PreparedStatement pstmt = c.connection.prepareStatement(q);
                pstmt.setString(1, location);
                pstmt.setString(2, destination);
                pstmt.setString(3, route);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Please select your ride");
                    new SearchRide2();
                    setVisible(false);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in booking ride!");
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookRide2();
    }
}
