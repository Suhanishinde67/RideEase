package cab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details extends JFrame implements ActionListener {
    JTextField t2,t3,t4;
    
    JButton b1,b2;
    Details(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,570,390);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Please enter your location and");
        l1.setBounds(4,25,800,40);
        l1.setFont(new Font("Tahoma", Font.PLAIN,40));
        l1.setForeground(Color.WHITE);
        panel.add(l1);
        
        JLabel l2 = new JLabel("destination to get more details");
        l2.setBounds(4,70,800,40);
        l2.setFont(new Font("Tahoma", Font.PLAIN,40));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

       
        JButton btnRoom = new JButton("Okk");
        btnRoom.setBounds(64,200,111,33);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        panel.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new MapConfrimation();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        

        b2 = new JButton("Back");
        b2.setBounds(190,200,111,33);
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
        setLocation(730,350);
        setLayout(null);
        setSize(580,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b2){
           setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Details();
    }
}
