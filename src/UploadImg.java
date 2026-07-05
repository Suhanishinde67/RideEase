package cab;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class UploadImg extends JFrame {

    private JLabel imageLabel;
    private JButton uploadButton;
    private JButton okButton;
    private JButton replaceButton;

    public UploadImg() {
        setTitle("Image Uploader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔹 Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(320, 5, 1615, 1080);
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

        // 🔹 Upload Button
        uploadButton = new JButton("Upload Image");
        uploadButton.setBounds(50, 30, 200, 40);
        uploadButton.addActionListener(e -> chooseImage());
        panel.add(uploadButton);

        // 🔹 Image Display
        imageLabel = new JLabel("No Image Uploaded", SwingConstants.CENTER);
        imageLabel.setBounds(300, 100, 500, 400);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        imageLabel.setForeground(Color.WHITE);
        panel.add(imageLabel);

        // 🔹 OK Button
        okButton = new JButton("OK");
        okButton.setBounds(50, 100, 200, 40);
        okButton.setEnabled(false);
        okButton.addActionListener(e -> confirmImage());
        panel.add(okButton);

        // 🔹 Replace Image Button
        replaceButton = new JButton("Replace Image");
        replaceButton.setBounds(50, 160, 200, 40);
        replaceButton.setEnabled(false);
        replaceButton.addActionListener(e -> replaceImage());
        panel.add(replaceButton);

        // 🔹 Frame Settings
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1920, 1140);
        setVisible(true);
    }

    private void chooseImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an Image");

        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image files", "jpg", "jpeg", "png", "gif"));

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = icon.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

            imageLabel.setIcon(new ImageIcon(image));
            imageLabel.setText("");

            okButton.setEnabled(true);   // Must confirm after selecting
        }
    }

    private void confirmImage() {
        uploadButton.setEnabled(false);
        okButton.setEnabled(false);
        replaceButton.setEnabled(true); // Only allow replace after confirm
        JOptionPane.showMessageDialog(this, "Image Confirmed!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void replaceImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a New Image");

        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image files", "jpg", "jpeg", "png", "gif"));

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = icon.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

            imageLabel.setIcon(new ImageIcon(image));
            imageLabel.setText("");

            // Require confirmation again
            okButton.setEnabled(true);
            replaceButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "New Image Selected. Please Confirm!", "Pending Confirmation", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UploadImg());
    }
}
