package cab;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javax.swing.*;

public class MapConfrimation extends JFrame {
    
    public MapConfrimation() {
        setTitle("Google Maps that makes your life easy");
        setUndecorated(false);
        setLocation(700, 180);
        setSize(1000, 800);  
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
        new MapConfrimation();
    }
}
