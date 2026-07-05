       package cab;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import cab.Con;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class DriverSearchRide extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back, accept;

    DriverSearchRide() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(5, 5, 1190, 790);
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom = new JLabel("Search For Driver");
        searchForRoom.setBounds(250, 11, 186, 31);
        searchForRoom.setForeground(Color.WHITE);
        searchForRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(searchForRoom);

        

            JLabel age = new JLabel("Location");
        age.setBounds(160, 162, 150, 20);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(age);

        

        JLabel licence = new JLabel("Destination");
        licence.setBounds(570, 162, 150, 20);
        licence.setForeground(Color.WHITE);
        licence.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(licence);

        

        JLabel salary = new JLabel("Route");
        salary.setBounds(980, 162, 150, 20);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(salary);

        

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
            String q = "select * from bookRide";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(300, 600, 120, 30);  
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);
 
        back = new JButton("Back");
        back.setBounds(40, 600, 120, 30);  
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);
        
        accept = new JButton("Accept");
        accept.setBounds(560, 600, 120, 30);  
        accept.setBackground(Color.BLACK);
        accept.setForeground(Color.WHITE);
        accept.addActionListener(this);
        panel.add(accept);

        setUndecorated(true);
        setLayout(null);
        setLocation(650, 210);
        setSize(1200,800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String location = choice.getSelectedItem();
            String query = "SELECT * FROM bookRide WHERE location = '" + location + "'";
            
            if (checkBox.isSelected()) {
                query = "SELECT * FROM bookRide WHERE location = '" + location + "' AND destination = 'Available'";
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
           
        } else if (e.getSource() == accept) {
            JOptionPane.showMessageDialog(null, "Ride accepted!!");
            setVisible(false);
           
        }
    }

    public static void main(String[] args) {
        new DriverSearchRide();
    }
}
