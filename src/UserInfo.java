package cab;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UserInfo extends JFrame {
    UserInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,1190,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,50,1150,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            Con c = new Con();
            String driverSQL = "select * from userinfo";
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

        JLabel dname = new JLabel("DOCUMENT");
        dname.setBounds(30,11,90,19);
        dname.setForeground(Color.WHITE);
        dname.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(dname);

        JLabel id = new JLabel("ID NO.");
        id.setBounds(180,11,70,19);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(id);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(320,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Age);

        JLabel name = new JLabel("NAME");
        name.setBounds(470,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(620,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("COUNTRY");
        country.setBounds(750,11,70,19);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(country);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(900,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

       JLabel gmail = new JLabel("EMAIL");
        gmail.setBounds(1050,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);
        
        setUndecorated(true);
        setLayout(null);
        setLocation(430,300);
        setSize(1200,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new UserInfo();
    }
}
