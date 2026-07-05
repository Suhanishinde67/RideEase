package cab;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Last extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTextField textField1, textField2;
    JTable table;
    JButton book, user, last, driv, last2, add, back;

    Last() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(5, 5, 1190, 690);
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom = new JLabel("Please select your preferred vehicle type");
        searchForRoom.setBounds(150, 20, 1000, 40);
        searchForRoom.setForeground(Color.WHITE);
        searchForRoom.setFont(new Font("Tahoma", Font.BOLD, 40));
        panel.add(searchForRoom);

        JLabel rbt = new JLabel("Note: Most frequently selected and loved type :- Auto");
        rbt.setBounds(50, 160, 1000, 30);
        rbt.setForeground(Color.GRAY);
        rbt.setFont(new Font("Tahoma", Font.BOLD, 30));
        panel.add(rbt);

        
        user = new JButton("5 seaters");
        user.setBounds(500,400,120, 40);
        user.setBackground(Color.BLACK);
        user.setForeground(Color.WHITE);
        user.addActionListener(this);
        panel.add(user);

        driv = new JButton("7 seaters");
        driv.setBounds(650,400,120, 40);
        driv.setBackground(Color.BLACK);
        driv.setForeground(Color.WHITE);
        driv.addActionListener(this);
        panel.add(driv);
        
        last = new JButton("8 seaters");
        last.setBounds(800,400,120, 40);
        last.setBackground(Color.BLACK);
        last.setForeground(Color.WHITE);
        last.addActionListener(this);
        panel.add(last);
        
        last2 = new JButton("9 seaters");
        last2.setBounds(950,400,120, 40);
        last2.setBackground(Color.BLACK);
        last2.setForeground(Color.WHITE);
        last2.addActionListener(this);
        panel.add(last2);
        
        
        book = new JButton("Back");
        book.setBounds(50, 400, 120, 40);  
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
        book.addActionListener(this);
        panel.add(book);
        
        add = new JButton("Auto");
        add.setBounds(200, 400, 120, 40);  
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);
 
        back = new JButton("Bike");
        back.setBounds(350, 400, 120, 40);  
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
    public void actionPerformed(ActionEvent e) 
    {
    if (e.getSource() == book) {
        setVisible(false);
    } else if (e.getSource() == add) {
        JOptionPane.showMessageDialog(null, "You sure!! You want to proceed with auto??");
        new BookAuto();
        setVisible(false);
    } else if (e.getSource() == back) {
        JOptionPane.showMessageDialog(null, "You sure!! You want to proceed with bike??");
        new BookBike();
        setVisible(false);
    } else if (e.getSource() == user) {
        JOptionPane.showMessageDialog(null, "You sure!! You want to proceed with 5 seaters??");
        new Book5();
        setVisible(false);
    } else if (e.getSource() == driv) {
        JOptionPane.showMessageDialog(null, "You sure!! You want to proceed with 7 seaters??");
        new Book7();
        setVisible(false);
    } else if (e.getSource() == last) {
        JOptionPane.showMessageDialog(null, "You sure!! You want to proceed with 8 seaters??");
        new Book8();
        setVisible(false);
    } else {
        JOptionPane.showMessageDialog(null, "You sure!! You want to proceed with 9 seaters ??");
        new Book9();
        setVisible(false);
    }
    }

    
    public static void main(String[] args) {
        new Last();
    }
}






