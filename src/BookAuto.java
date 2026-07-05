package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookAuto extends JFrame implements ActionListener {
    JTextField t2,t3;
    JComboBox t5,t6;
    JButton b1,b2;
    BookAuto(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,1210,710);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        
        JLabel l8 = new JLabel("Thank You!!!");
        l8.setBounds(500,30,400,40);
        l8.setFont(new Font("Tahoma", Font.BOLD, 40));
        l8.setForeground(Color.WHITE);
        panel.add(l8);

        JLabel l2 = new JLabel("Estimated Fare");
        l2.setBounds(64,100,250,33);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        JButton btnFare = new JButton("100-200 Rs");
        btnFare.setBounds(260,100,156,40);
        btnFare.setBackground(new Color(16,108,115));
        btnFare.setForeground(Color.WHITE);
        panel.add(btnFare);
        btnFare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {                   
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        JLabel l3 = new JLabel("Vehicle Number");
        l3.setBounds(64,150,250,33);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        l3.setForeground(Color.WHITE);
        panel.add(l3);
        
        JButton btnAuto = new JButton("MH14ED5428");
        btnAuto.setBounds(260,150,156,40);
        btnAuto.setBackground(new Color(16,108,115));
        btnAuto.setForeground(Color.WHITE);
        panel.add(btnAuto);
        btnAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {                   
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        JLabel l5 = new JLabel("Driver Name");
        l5.setBounds(64,200,250,33);
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        l5.setForeground(Color.WHITE);
        panel.add(l5);
     
        JButton btnbike = new JButton("Rahul Khanna");
        btnbike.setBounds(260,200,156,40);
        btnbike.setBackground(new Color(16,108,115));
        btnbike.setForeground(Color.WHITE);
        panel.add(btnbike);
        btnbike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        JLabel l7 = new JLabel("Driver number");
        l7.setBounds(64,250,250,33);
        l7.setFont(new Font("Tahoma", Font.BOLD, 20));
        l7.setForeground(Color.WHITE);
        panel.add(l7);
     
        JButton btnCab = new JButton("9854624513");
        btnCab.setBounds(260,250,156,40);
        btnCab.setBackground(new Color(16,108,115));
        btnCab.setForeground(Color.WHITE);
        panel.add(btnCab);
        btnCab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
       

        JLabel l6 = new JLabel("OTP");
        l6.setBounds(64,300,250,33);
        l6.setFont(new Font("Tahoma", Font.BOLD, 20));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        JButton btnOtp = new JButton("5487");
        btnOtp.setBounds(260,300,156,40);
        btnOtp.setBackground(new Color(16,108,115));
        btnOtp.setForeground(Color.WHITE);
        panel.add(btnOtp);
        btnOtp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        JLabel l4 = new JLabel("See Driver");
        l4.setBounds(64,350,250,33);
        l4.setFont(new Font("Tahoma", Font.BOLD, 20));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        JButton btnOMaps = new JButton("Maps");
        btnOMaps.setBounds(260,350,156,40);
        btnOMaps.setBackground(new Color(16,108,115));
        btnOMaps.setForeground(Color.WHITE);
        panel.add(btnOMaps);
        btnOMaps.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new MainMap2();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/green.png"));
        Image image = imageIcon.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(760,130,350,350);
        panel.add(label);
        
        JButton btnBook = new JButton("Done");
        btnBook.setBounds(64,450,111,33);
        btnBook.setBackground(Color.BLACK);
        btnBook.setForeground(Color.WHITE);
        panel.add(btnBook);
        btnBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);                   
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        b2 = new JButton("Back");
        b2.setBounds(198,450,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);


        setUndecorated(true);
        setLocation(590,180);
        setLayout(null);
        setSize(1220,720);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
    }

    public static void main(String[] args) {
        new BookAuto();
    }
}
