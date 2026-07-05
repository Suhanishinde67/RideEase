package cab;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchDriver extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back;

    SearchDriver() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(5, 5, 1390, 790);
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

        JLabel name = new JLabel("Name");
        name.setBounds(10, 162, 150, 20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(160, 162, 150, 20);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(290, 162, 150, 20);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel ID = new JLabel("ID");
        ID.setBounds(430, 162, 150, 20);
        ID.setForeground(Color.WHITE);
        ID.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(ID);

        JLabel licence = new JLabel("Licence");
        licence.setBounds(570, 162, 150, 20);
        licence.setForeground(Color.WHITE);
        licence.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(licence);

        JLabel email = new JLabel("Email");
        email.setBounds(710, 162, 150, 20);
        email.setForeground(Color.WHITE);
        email.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(email);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(850, 162, 150, 20);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(phone);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(980, 162, 150, 20);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(salary);

        JLabel status = new JLabel("Status");
        status.setBounds(1130, 162, 150, 20);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(status);

        JLabel location = new JLabel("Location");
        location.setBounds(1260, 162, 150, 20);
        location.setForeground(Color.WHITE);
        location.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(location);

        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400, 69, 205, 23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3, 45, 48));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Pune");
        choice.add("Hadapsar");
        choice.add("Koregaon park");
        choice.add("Hinjewadi");
        choice.add("Viman Nagar");
        choice.add("Kharadi");
        choice.add("PCMC");
        choice.add("Wakad");
        choice.add("kalyani Nagar");
        choice.add("Kothrud");
        choice.setBounds(170,70,120,20);
        panel.add(choice);
        
        table = new JTable();
        table.setBounds(0, 187, 1400, 370);
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
        setLocation(430, 200);
        setSize(1400, 800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String location = choice.getSelectedItem();
            String query = "SELECT * FROM driverdetails WHERE location = '" + location + "'";
            
            if (checkBox.isSelected()) {
                query = "SELECT * FROM driverdetails WHERE location = '" + location + "' AND status = 'Available'";
            }

            try {
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == back) {
            setVisible(false);
           
        }
    }

    public static void main(String[] args) {
        new SearchDriver();
    }
}
