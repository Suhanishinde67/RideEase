package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ratings extends JFrame implements ActionListener {
    JTextField t2,t3;
    
    JButton b1,b2;
    Ratings(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,1190,690);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("YOUR FEEDBACK HELPS US..");
        l1.setBounds(250,25,800,33);
        l1.setFont(new Font("Tahoma", Font.BOLD,40));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Would you like to share some feedback??");
        l2.setBounds(40,140,550,43);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
      
        t2 =new JTextField();
        t2.setBounds(40,190,420,110);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);
        
        JLabel l3 = new JLabel("What can we do more to improve your experience??");
        l3.setBounds(40,360,550,43);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        l3.setForeground(Color.WHITE);
        panel.add(l3);
        
        t3 =new JTextField();
        t3.setBounds(40,410,420,110);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);
        
        
        b1 = new JButton("Add");
        b1.setBounds(64,600,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,600,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/phone.png"));
        Image image = imageIcon.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(760,130,300,370);
        panel.add(label);

        setUndecorated(true);
        setLocation(600,200);
        setLayout(null);
        setSize(1200,700);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            try{
                Con c = new Con();
                String text1 = t2.getText();
                String text2 = t3.getText();
                
                String q = "insert into ratings values('"+text1+"', '"+text2+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Feedback Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Ratings();
    }
}
