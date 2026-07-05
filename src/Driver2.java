package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.Main;

public class Driver2 extends JFrame implements ActionListener {

    JButton add_Profile, add_Shift, add_Ride, add_maps, logout, back;
    Driver2(){

        add_Profile = new JButton( "PROFILE MANAGEMENT");
        add_Profile.setBounds(250,230,300,30);
        add_Profile.setBackground(Color.WHITE);
        add_Profile.setForeground(Color.BLACK);
        add_Profile.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Profile.addActionListener(this);
        add(add_Profile);

        add_Shift = new JButton( "SHIFT MANAGEMENT");
        add_Shift.setBounds(250,380,300,30);
        add_Shift.setBackground(Color.WHITE);
        add_Shift.setForeground(Color.BLACK);
        add_Shift.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Shift.addActionListener(this);
        add(add_Shift);

        add_Ride = new JButton( "SEARCH RIDE");
        add_Ride.setBounds(250,530,300,30);
        add_Ride.setBackground(Color.WHITE);
        add_Ride.setForeground(Color.BLACK);
        add_Ride.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ride.addActionListener(this);
        add(add_Ride);
        
        add_maps = new JButton( "GOOGLE MAPS");
        add_maps.setBounds(250,690,300,30);
        add_maps.setBackground(Color.WHITE);
        add_maps.setForeground(Color.BLACK);
        add_maps.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_maps.addActionListener(this);
        add(add_maps);

        logout = new JButton( "Logout");
        logout.setBounds(80,855,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton( "Back");
        back.setBounds(250,855,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);


        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/google.png"));
        Image image3 = imageIcon4.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon14 = new ImageIcon(image3);
        JLabel label4 = new JLabel(imageIcon14);
        label4.setBounds(70,660,120,120);
        add(label4);
        
        
        

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1920,1145);
        setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Profile){
            new DriverProfileM();
        } else if (e.getSource() == add_Shift) {
            new DriverShiftM();
        }else if (e.getSource() == add_maps) {
            new MapConfrimation();
        } else if (e.getSource() ==  add_Ride) {
            new DriverSearchRide();
        } else if (e.getSource() == logout){
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Driver2();
    }
}
