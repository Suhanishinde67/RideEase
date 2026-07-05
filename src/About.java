package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    JButton  add_Ride, add_Sign, add_Profile, add_Shift, add_maps, logout, back, add_Password, add_Login2, add_Login;;

    About() {
        super("Cab Booking Application");

        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 3000)); 
        contentPanel.setBackground(Color.WHITE);

        add_Ride = new JButton("PLEASE READ IN DETAIL TO UNDERSTAND WHAT WE DO");
        add_Ride.setBounds(600, 10, 700, 30);
        add_Ride.setBackground(Color.GRAY);
        add_Ride.setForeground(Color.WHITE);
        add_Ride.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ride.addActionListener(this);
        contentPanel.add(add_Ride);
        
        add_Sign = new JButton("Back");
        add_Sign.setBounds(1770, 10, 100, 30);
        add_Sign.setBackground(Color.WHITE);
        add_Sign.setForeground(Color.BLACK);
        add_Sign.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Sign.addActionListener(this);
        contentPanel.add(add_Sign);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 1910, 50);
        panel2.setBackground(new Color(0, 0, 0));
        contentPanel.add(panel2);
        
       
        
        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/daily.png"));
        Image image1 = imageIcon1.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label1 = new JLabel(new ImageIcon(image1));
        label1.setBounds(150, 100, 700, 450);
        contentPanel.add(label1);
        
        
        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/outstation.png"));
        Image image0 = imageIcon2.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label2 = new JLabel(new ImageIcon(image0));
        label2.setBounds(1100, 650, 700, 450);
        contentPanel.add(label2);
        
        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/rental.jpg"));
        Image image3 = imageIcon4.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label4 = new JLabel(new ImageIcon(image3));
        label4.setBounds(150, 1150, 700, 450);
        contentPanel.add(label4);
        
      
        
        
        JPanel panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(150, 650, 700, 450);
        panel5.setBackground(new Color(255, 255, 255));
        contentPanel.add(panel5);
        JLabel label12 = new JLabel("Outstation");
        label12.setFont(new Font("Tahoma", Font.BOLD, 60));
        label12.setForeground(Color.BLACK);
        label12.setBounds(200, 70, 1000, 60);
        panel5.add(label12); 
        JLabel label13 = new JLabel("Log in to see your recent activity");
        label13.setFont(new Font("Tahoma", Font.BOLD, 40));
        label13.setForeground(Color.BLACK);
        label13.setBounds(5, 200, 1000, 40); 
        panel5.add(label13);
        JLabel label19 = new JLabel("Don’t have an account? Please sign up");
        label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label19.setForeground(Color.BLACK);
        label19.setBounds(170, 300, 1000, 20); 
        panel5.add(label19);
        
        
        JPanel panel6 = new JPanel();
        panel6.setLayout(null);
        panel6.setBounds(1100, 100, 700, 450);
        panel6.setBackground(new Color(255, 255, 255));
        contentPanel.add(panel6);
        JLabel label15 = new JLabel("Daily");
        label15.setFont(new Font("Tahoma", Font.BOLD, 60));
        label15.setForeground(Color.BLACK);
        label15.setBounds(250, 70, 1000, 60); 
        panel6.add(label15);
        JLabel label18 = new JLabel("Moving people, and the world");
        label18.setFont(new Font("Tahoma", Font.BOLD, 40));
        label18.setForeground(Color.BLACK);
        label18.setBounds(5, 200, 1000, 40); 
        panel6.add(label18);
        JLabel label20 = new JLabel("Already have an account? Please sign in");
        label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label20.setForeground(Color.BLACK);
        label20.setBounds(150, 300, 1000, 20); 
        panel6.add(label20);
        
        
        JPanel panel7 = new JPanel();
        panel7.setLayout(null);
        panel7.setBounds(1100, 1150, 700, 450);
        panel7.setBackground(new Color(255, 255, 255));
        contentPanel.add(panel7);
        JLabel label16 = new JLabel("Rental");
        label16.setFont(new Font("Tahoma", Font.BOLD, 60));
        label16.setForeground(Color.BLACK);
        label16.setBounds(250, 70, 1000, 60); 
        panel7.add(label16);
        JLabel label17 = new JLabel("Drive when and where you want");
        label17.setFont(new Font("Tahoma", Font.BOLD, 40));
        label17.setForeground(Color.BLACK);
        label17.setBounds(5, 200, 1000, 40); 
        panel7.add(label17);
        JLabel label14 = new JLabel("Already have an account? Please login");
        label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label14.setForeground(Color.BLACK);
        label14.setBounds(200, 300, 1000, 20); 
        panel7.add(label14);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 1920, 1080);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        getContentPane().setBackground(new Color(255, 255, 255));
        getContentPane().setLayout(null);
        getContentPane().add(scrollPane);
        setSize(1940, 1145);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add_Sign) {
            new Home2();
        } else if (e.getSource() == add_Shift) {
            new DriverShiftM();
        } else if (e.getSource() == add_maps) {
            new MainMap();
        } else if (e.getSource() == add_Ride) {
            // Ride search logic
        } else if (e.getSource() == logout) {
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new About();
    }
}
