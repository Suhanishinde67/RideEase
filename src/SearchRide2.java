package cab;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRide2 extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTextField textField1, textField2;
    JTable table;
    JButton book, add, back;

    SearchRide2() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(5, 5, 1190, 690);
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom = new JLabel("Search For Driver");
        searchForRoom.setBounds(250, 11, 186, 31);
        searchForRoom.setForeground(Color.WHITE);
        searchForRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(searchForRoom);

        JLabel rbt = new JLabel("Driver Location:");
        rbt.setBounds(50, 73, 120, 20);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(rbt);
        textField1 = new JTextField();
        textField1.setBounds(200, 73, 150, 30);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField1.setBackground(Color.WHITE);
        panel.add(textField1);
        
        JLabel label15 = new JLabel("Destination:");
        label15.setFont(new Font("Tahoma", Font.BOLD, 14));
        label15.setForeground(Color.WHITE);
        label15.setBounds(400, 73, 120, 20);
        panel.add(label15);
        textField2 = new JTextField();
        textField2.setBounds(500, 73, 150, 30);
        textField2.setForeground(Color.BLACK);
        textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField2.setBackground(Color.WHITE);
        panel.add(textField2);
        
        

        JLabel name = new JLabel("AUTO");
        name.setBounds(50, 162, 150, 20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);
       
        JLabel gender = new JLabel("BIKE");
        gender.setBounds(240, 162, 150, 20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel ID = new JLabel("5 SEATERS");
        ID.setBounds(400, 162, 150, 20);
        ID.setForeground(Color.WHITE);
        ID.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(ID);

        JLabel licence = new JLabel("7 Seaters");
        licence.setBounds(580, 162, 150, 20);
        licence.setForeground(Color.WHITE);
        licence.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(licence);

        JLabel email = new JLabel("8 Seaters");
        email.setBounds(740, 162, 150, 20);
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(email);

        JLabel phone = new JLabel("9 Seaters");
        phone.setBounds(900, 162, 150, 20);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(phone);

        JLabel salary = new JLabel("DESTINATION");
        salary.setBounds(1050, 162, 150, 20);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(salary);

        
        table = new JTable();
        table.setBounds(0, 187, 1190, 370);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            Con c = new Con();
            String q = "select * from driver2";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        book = new JButton("Book");
        book.setBounds(50, 600, 120, 30);  
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
        book.addActionListener(this);
        panel.add(book);
        
        add = new JButton("Search");
        add.setBounds(200, 600, 120, 30);  
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);
 
        back = new JButton("Back");
        back.setBounds(380, 600, 120, 30);  
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(600, 200);
        setSize(1200, 700);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String location = textField2.getText();
            String query = "SELECT * FROM cab2 WHERE location = '" + location + "'";
            
            
            try {
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == book) {
            JOptionPane.showMessageDialog(null, "Please select your preferred vehicle type!!");
            new Last();
            setVisible(false);           
        }else if (e.getSource() == back) {
            setVisible(false);           
        }  
    }

    public static void main(String[] args) {
        new SearchRide2();
    }
}

