package cab;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class DriverDetails extends JFrame {
    DriverDetails(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,1390,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,50,1400,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            Con c = new Con();
            String driverSQL = "select * from driverdetails";
            ResultSet resultSet = c.statement.executeQuery(driverSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("NAME");
        name.setBounds(10,11,100,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(160,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Age);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(290,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("ID");
        job.setBounds(430,11,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("LICENCE");
        salary.setBounds(570,11,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("EMAIL");
        phone.setBounds(710,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel gmail = new JLabel("PHONE");
        gmail.setBounds(850,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);

        JLabel pay = new JLabel("SALARY");
        pay.setBounds(980,11,70,19);
        pay.setForeground(Color.WHITE);
        pay.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(pay);
        
        JLabel status = new JLabel("STATUS");
        status.setBounds(1130,11,70,19);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(status);
        
        JLabel location = new JLabel("LOCATION");
        location.setBounds(1260,11,70,19);
        location.setForeground(Color.WHITE);
        location.setFont(new Font("Tahoma", Font.BOLD,12));
        panel.add(location);

        setUndecorated(true);
        setLayout(null);
        setLocation(430,300);
        setSize(1400,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new DriverDetails();
    }
}
