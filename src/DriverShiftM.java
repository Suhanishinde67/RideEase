package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DriverShiftM extends JFrame implements ActionListener {
    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;
    DriverShiftM(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("ADD SHIFT");
        l1.setBounds(500,25,500,33);
        l1.setFont(new Font("Tahoma", Font.BOLD,40));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("NAME");
        l2.setBounds(64,70,152,33);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        t2 =new JTextField();
        t2.setBounds(200,70,156,30);
        t2.setFont(new Font("Tahoma", Font.BOLD, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel l3 = new JLabel("SHIFT");
        l3.setBounds(64,120,152,33);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 =new JComboBox(new String[] {"Morning", "noon", "evening", "night"});
        t3.setBounds(200,120,156,30);
        t3.setFont(new Font("Tahoma", Font.BOLD, 14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel l4 = new JLabel("ID NUMBER");
        l4.setBounds(64,170,152,33);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 =new JTextField();
        t4.setBounds(200,170,156,30);
        t4.setFont(new Font("Tahoma", Font.BOLD, 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);

        JLabel l5 = new JLabel("Vehicle Status");
        l5.setBounds(64,220,152,33);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 =new JComboBox(new String[]{"Available","Unavailable"});
        t5.setBounds(200,220,156,30);
        t5.setFont(new Font("Tahoma", Font.BOLD, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JLabel l6 = new JLabel("Vehicle Type");
        l6.setBounds(64,270,152,33);
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        t6 =new JComboBox(new String[]{"Bike","Auto","Five Seaters","Seven Seaters","Eight Seaters","Nine Seaters"});
        t6.setBounds(200,270,156,30);
        t6.setFont(new Font("Tahoma", Font.BOLD, 14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);

        b1 = new JButton("Add");
        b1.setBounds(64,350,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,350,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/tic.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);

        setUndecorated(true);
        setLocation(700,300);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            try{
                Con c = new Con();
                String name = t2.getText();
                String shift = (String) t3.getSelectedItem();            
                String status = (String)  t5.getSelectedItem();
                String idnumber = t4.getText();
                String type =  (String) t6.getSelectedItem();

                String q = "insert into driversm values('"+name+"', '"+shift+"', '"+idnumber+"', '"+status+"', '"+type+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Shift Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new DriverShiftM();
    }
}
