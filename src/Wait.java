package cab;
import java.awt.*;
import javax.swing.*;
public class Wait extends JFrame {
    
    Wait(){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,550,500);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/loading.gif"));
        Image image = imageIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(40,50,470,400);
        panel.add(label);
        
        setUndecorated(true);
        setLayout(null);
        setLocation(1130,300);
        setSize(550,500);
        setVisible(true);
        
        try{
            Thread.sleep(3000);
            new Book();
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();  
        }
    
    }
    
    public static void main(String[] args){
        new Wait();
    }
}
