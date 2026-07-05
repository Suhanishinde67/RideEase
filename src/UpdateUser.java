package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class UpdateUser extends JFrame {
    UpdateUser() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1140, 640);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        JLabel label1 = new JLabel("Update User Details");
        label1.setBounds(124, 11, 445, 35);  
        label1.setFont(new Font("Tahoma", Font.BOLD, 14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Name :");
        label2.setBounds(55, 88, 97, 14); 
        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248, 85, 156, 30);
        panel.add(c);

        try {
            Con C = new Con();
            ResultSet resultSet = C.statement.executeQuery("SELECT user_name FROM user3");
            while (resultSet.next()) {
                c.add(resultSet.getString("user_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Document :");
        label3.setBounds(55, 129, 97, 14);
        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);
        JTextField textField3 = new JTextField();
        textField3.setBounds(248, 129, 156, 30);  
        panel.add(textField3);

        JLabel label4 = new JLabel("ID NO. :");
        label4.setBounds(55, 174, 97, 14);
        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);
        JTextField textField4 = new JTextField();
        textField4.setBounds(248, 174, 156, 30);
        panel.add(textField4);

        JLabel label5 = new JLabel("Age :");
        label5.setBounds(55, 216, 97, 14);
        label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);
        JTextField textField5 = new JTextField();
        textField5.setBounds(248, 216, 156, 30);
        panel.add(textField5);

        JLabel label6 = new JLabel("Gender :");
        label6.setBounds(55, 256, 97, 14);
        label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);
        JTextField textField6 = new JTextField();
        textField6.setBounds(248, 256, 156, 30);
        panel.add(textField6);
        
        JLabel label7 = new JLabel("Country :");
        label7.setBounds(55, 296, 97, 14);
        label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label7.setForeground(Color.WHITE);
        panel.add(label7);
        JTextField textField7 = new JTextField();
        textField7.setBounds(248, 296, 156, 30);
        panel.add(textField7);
        
        JLabel label8 = new JLabel("Phone :");
        label8.setBounds(55, 346, 97, 14);
        label8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label8.setForeground(Color.WHITE);
        panel.add(label8);
        JTextField textField8 = new JTextField();
        textField8.setBounds(248, 346, 156, 30);
        panel.add(textField8);
        
        JLabel label9 = new JLabel("Email :");
        label9.setBounds(55, 386, 97, 14);
        label9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label9.setForeground(Color.WHITE);
        panel.add(label9);
        JTextField textField9 = new JTextField();
        textField9.setBounds(248, 386, 156, 30);
        panel.add(textField9);

        JButton update = new JButton("Update");
        update.setBounds(120, 500, 89, 23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Con C = new Con();
                    String query = "UPDATE user3 SET user_document = ?, user_idnumber = ?, user_age = ?, user_gender = ?, user_country = ?, user_phone = ?, user_email = ? WHERE user_name = ?";
                    PreparedStatement pst = C.connection.prepareStatement(query);
                    pst.setString(1, textField3.getText());
                    pst.setString(2, textField4.getText());
                    pst.setString(3, textField5.getText());
                    pst.setString(4, textField6.getText());
                    pst.setString(5, textField7.getText());
                    pst.setString(6, textField8.getText());
                    pst.setString(7, textField9.getText());
                    pst.setString(8, c.getSelectedItem());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                    dispose(); 
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(180, 550, 89, 23);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(60, 550, 89, 23);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = c.getSelectedItem();
                String q = "SELECT * FROM user3 WHERE user_name = ?";
                try {
                    Con con = new Con();
                    PreparedStatement pst = con.connection.prepareStatement(q);
                    pst.setString(1, id);
                    ResultSet resultSet = pst.executeQuery();

                    while (resultSet.next()) {
                        textField3.setText(resultSet.getString("user_document"));
                        textField4.setText(resultSet.getString("user_idnumber"));
                        textField5.setText(resultSet.getString("user_age"));
                        textField6.setText(resultSet.getString("user_gender"));
                        textField7.setText(resultSet.getString("user_country"));
                        textField8.setText(resultSet.getString("user_phone"));
                        textField9.setText(resultSet.getString("user_email"));
                    }
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(1150, 650);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateUser();
    }
}
