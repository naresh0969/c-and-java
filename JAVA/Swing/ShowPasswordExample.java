package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowPasswordExample extends JFrame {
    private JPasswordField passwordField;
    private JToggleButton showPasswordButton;a
    private JButton resetButton;
    private JButton submitButton;

    public ShowPasswordExample() {
        setTitle("Show Password Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        passwordField = new JPasswordField(20);
        showPasswordButton = new JToggleButton("Show Password");
        showPasswordButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    passwordField.setEchoChar((char) 0); // Show password
                } else {
                    passwordField.setEchoChar('*'); // Hide password
                }
            }
        });

        resetButton = new JButton("Reset Password");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                passwordField.setText(""); // Reset password
            }
        });

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ShowPasswordExample.this, "Hello, welcome");
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(passwordField);
        panel.add(showPasswordButton);
        panel.add(resetButton);
        panel.add(submitButton);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ShowPasswordExample example = new ShowPasswordExample();
                example.setVisible(true);
            }
        });
    }
}


