package Swing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Login extends JFrame {
    public Login() {
        this.setTitle("testing");
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(null);

        JLabel l1 = new JLabel("Username ");
        l1.setBounds(200, 200, 150, 50);
        l1.setBackground(Color.BLACK);

        JTextField t1 = new JTextField("enter user name");
        t1.setBounds(300, 210, 150, 30);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(200, 250, 150, 50);

        
        JPasswordField password = new JPasswordField();
        password.setBounds(300, 260, 150, 30);

        JCheckBox c1 = new JCheckBox("Show password");
        c1.setBounds(330, 300, 150, 30);

        JButton b1 = new JButton("Reset");
        b1.setBounds(200, 310, 70, 20);
        b1.setBackground(Color.BLUE);

        JButton b2 = new JButton("Log in");
        b2.setBounds(250, 350, 70, 30);
        b2.setBackground(Color.GREEN);

        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                if (cb.isSelected()) {
                    password.setEchoChar((char) 0); // Show password in plain text
                } else {
                    password.setEchoChar('.'); // Show password as dots
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                password.setText("");

            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // JOptionPane.showMessageDialog(null, "Welcome"); // Show "Welcome" message
                getContentPane().setBackground(Color.green);
            }
        });


        this.add(password);

        this.add(b2);
        this.add(b1);
        this.add(c1);
        this.add(l2);
        this.add(t1);
        this.add(l1);

    }

}

public class test1 {
    public static void main(String args[]) {
        Login l = new Login();
    }

}
