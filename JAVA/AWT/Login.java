package AWT;


import java.awt.*;

class Page extends Frame {
    public Page() {
        // Setting frame properties
        this.setTitle("Home Page");
        this.setSize(500, 600);
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);

        // Setting custom font (optional)
        Font f = new Font("Arial", Font.BOLD, 20);
        this.setFont(f);

        // Setting layout manager (optional, but recommended)
        this.setLayout(null);

        // Setting background color for components (optional)
        Color c = Color.WHITE;

        // User Name Label and TextField
        Label l1 = new Label("User Name ");
        l1.setForeground(c);
        l1.setBounds(100, 100, 200, 30); // Adjusted position and size
        this.add(l1);
        TextField f1 = new TextField("Enter User name");
        f1.setBounds(300, 100, 200, 30); // Adjusted position and size
        this.add(f1);

        // Password Label and TextField
        Label l2 = new Label("Password");
        l2.setForeground(c);
        l2.setBounds(100, 200, 200, 30); // Adjusted position and size
        this.add(l2);
        TextField f2 = new TextField();
        f2.setEchoChar('*');
        f2.setBounds(300, 200, 200, 30); // Adjusted position and size
        this.add(f2);

        // Log in Button
        Button b = new Button("Log in");
        b.setBounds(200, 300, 100, 30); // Adjusted position and size
        b.setBackground(Color.GREEN);
        b.setForeground(Color.white);
        this.add(b);
    }
}

public class Login {
    public static void main(String args[]) {
        Page p = new Page();
    }
}
