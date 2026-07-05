package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home2 extends JFrame implements ActionListener {

    JButton add_Profile, add_Shift, add_Ride, add_maps, logout, back, add_Password, add_Sign, add_Login2, add_Login;

    Home2() {
        super("Cab Booking Application");

        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 3000)); 
        contentPanel.setBackground(Color.WHITE);

        add_Profile = new JButton("Login");
        add_Profile.setBounds(1600, 10, 100, 30);
        add_Profile.setBackground(Color.GRAY);
        add_Profile.setForeground(Color.WHITE);
        add_Profile.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Profile.addActionListener(this);
        contentPanel.add(add_Profile);

        add_Shift = new JButton("SIGN UP");
        add_Shift.setBounds(1770, 10, 100, 30);
        add_Shift.setBackground(Color.WHITE);
        add_Shift.setForeground(Color.BLACK);
        add_Shift.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Shift.addActionListener(this);
        contentPanel.add(add_Shift);


        add_maps = new JButton("Get started");
        add_maps.setBounds(1370, 10, 150, 30);
        add_maps.setBackground(Color.GRAY);
        add_maps.setForeground(Color.WHITE);
        add_maps.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_maps.addActionListener(this);
        contentPanel.add(add_maps);
        
        logout = new JButton("About");
        logout.setBounds(10, 10, 100, 30);
        logout.setBackground(Color.GRAY);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        contentPanel.add(logout);

        back = new JButton("Ride");
        back.setBounds(180, 10, 100, 30);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        contentPanel.add(back);
        
        
        add_Login = new JButton("Get Started");
        add_Login.setBounds(340, 565, 390, 80);
        add_Login.setBackground(Color.BLACK);
        add_Login.setForeground(Color.PINK);
        add_Login.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login.addActionListener(this);
        contentPanel.add(add_Login);
        

        add_Password = new JButton("Login");
        add_Password.setBounds(760, 565, 390, 80);
        add_Password.setBackground(Color.BLACK);
        add_Password.setForeground(Color.PINK);
        add_Password.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Password.addActionListener(this);
        contentPanel.add(add_Password);

        add_Sign = new JButton("Sign up");
        add_Sign.setBounds(1180, 565, 390, 80);
        add_Sign.setBackground(Color.BLACK);
        add_Sign.setForeground(Color.PINK);
        add_Sign.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign.addActionListener(this);
        contentPanel.add(add_Sign);
        

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 1910, 50);
        panel2.setBackground(new Color(0, 0, 0));
        contentPanel.add(panel2);


        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(280, 470, 550, 60);
        panel3.setBackground(new Color(255, 255, 255));
        contentPanel.add(panel3);
        JLabel label5 = new JLabel("DAILY");
        label5.setFont(new Font("Tahoma", Font.BOLD, 22));
        label5.setForeground(Color.BLACK);
        label5.setBounds(5, 5, 100, 30); 
        panel3.add(label5);
        
        JLabel label6 = new JLabel("RENTAL");
        label6.setFont(new Font("Tahoma", Font.BOLD, 22));
        label6.setForeground(Color.BLACK);
        label6.setBounds(115, 5, 100, 30); 
        panel3.add(label6);
        
        JLabel label7 = new JLabel("OUTSTATION");
        label7.setFont(new Font("Tahoma", Font.BOLD, 22));
        label7.setForeground(Color.BLACK);
        label7.setBounds(235, 5, 150, 30); 
        panel3.add(label7);
        
        JLabel label8 = new JLabel("COURIER");
        label8.setFont(new Font("Tahoma", Font.BOLD, 22));
        label8.setForeground(Color.BLACK);
        label8.setBounds(420, 5, 150, 30); 
        panel3.add(label8);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 530, 1350, 150);
        panel.setBackground(new Color(211, 211, 211));
        contentPanel.add(panel);


        JPanel panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(280, 800, 1350, 250);
        panel4.setBackground(new Color(254, 238, 226));
        contentPanel.add(panel4);
        JLabel label9 = new JLabel("Global mobility ecosystem driving");
        label9.setFont(new Font("Tahoma", Font.BOLD, 60));
        label9.setForeground(Color.GRAY);
        label9.setBounds(170, 35, 1200, 60); 
        panel4.add(label9); 
        JLabel label10 = new JLabel("communities forward");
        label10.setFont(new Font("Tahoma", Font.BOLD, 60));
        label10.setForeground(Color.GRAY);
        label10.setBounds(380, 130, 1200, 60); 
        panel4.add(label10);
        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/daily.png"));
        Image image1 = imageIcon1.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label1 = new JLabel(new ImageIcon(image1));
        label1.setBounds(150, 1350, 700, 450);
        contentPanel.add(label1);
        
        
        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/outstation.png"));
        Image image0 = imageIcon2.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label2 = new JLabel(new ImageIcon(image0));
        label2.setBounds(1100, 1900, 700, 450);
        contentPanel.add(label2);
        
        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/rental.jpg"));
        Image image3 = imageIcon4.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label4 = new JLabel(new ImageIcon(image3));
        label4.setBounds(150, 2500, 700, 450);
        contentPanel.add(label4);
        
        
        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/very.png"));
        Image image2 = imageIcon3.getImage().getScaledInstance(1920, 600, Image.SCALE_DEFAULT);
        JLabel label3 = new JLabel(new ImageIcon(image2));
        label3.setBounds(0, 0, 1900, 600);
        contentPanel.add(label3);

       
        
        
        JPanel panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(150, 1900, 700, 450);
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
        panel6.setBounds(1100, 1350, 700, 450);
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
        panel7.setBounds(1100, 2500, 700, 450);
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
        if (e.getSource() == add_Profile) {
            new FinalLogin();
        } else if (e.getSource() == add_Shift) {
            new Signup();
        } else if (e.getSource() == add_maps) {
            new Signup();
        } else if (e.getSource() == add_Ride) {
            // Ride search logic
        } else if (e.getSource() == logout) {
            new About();
        } else if (e.getSource() == add_Login) {
            new Signup();
        } else if (e.getSource() == add_Password) {
            new FinalLogin();
        } else if (e.getSource() == add_Sign) {
            new Signup();
        } else if (e.getSource() == back) {
            new Signup();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Home2();
    }
}
