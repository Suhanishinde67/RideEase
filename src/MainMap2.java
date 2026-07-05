package cab;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javax.swing.*;

public class MainMap2 extends JFrame {
    
    public MainMap2() {
        setTitle("Google Maps in Java");
        setUndecorated(true);
        setLocation(1100, 250);
        setSize(600, 550);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JFXPanel fxPanel = new JFXPanel();
        add(fxPanel);
        
        javafx.application.Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebView webView = new WebView();
                WebEngine webEngine = webView.getEngine();
                webEngine.load("https://www.google.com/maps");                
                Scene scene = new Scene(webView);
                fxPanel.setScene(scene);
            }
        });
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainMap2();
    }
}
