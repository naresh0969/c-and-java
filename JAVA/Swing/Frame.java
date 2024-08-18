package Swing;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
class Fdemo extends JFrame{
    public Fdemo(){
        super("frame");
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        Font style=new Font("consolas",Font.BOLD,25);
        JTextField f=new JTextField("Welcome",2);
        JTextField f2=new JTextField("World",2);

        f.setBounds(100,100,200,50);
        f.setBackground(Color.BLACK);
        f.setForeground(Color.white);
        f.setFont(style);
        f.select(2,5);

        f2.setBounds(100,200,200,50);
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.white);
        f2.setFont(style);
        f2.select(2,5);
//ActionListener
        f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String text=f.getText();
                System.out.println("You entered "+text);
                // f.setText("U entered a key");
            }
        });
//Focus
        f2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e){
                f2.setText("Focus");
            }
            public void focusLost(FocusEvent e){
                f2.setText("Lost");
            }
        });



        this.add(f);
        this.add(f2);

//KeyListener
        JTextField f3=new JTextField("key1",2);
        JTextField f4=new JTextField("key2",2);

        f3.setBounds(100,300,200,50);
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.white);
        f3.setFont(style);
        f3.select(2,5);

        f4.setBounds(100,400,200,50);
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.white);
        f4.setFont(style);
        f4.select(2,5);

        this.add(f3);
        this.add(f4);

        f3.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
                f4.setText("Pressed "+e.getKeyText(e.getKeyCode()));

            }
            public void keyReleased(KeyEvent e){
                f4.setText("Released");

            }
            public void keyTyped(KeyEvent e){
                //use KeyAdapter if keyTyped method is not used

            }
        });

        JLabel l1=new JLabel("Password");
        l1.setBounds(100,500,100,50);
        l1.setForeground(Color.black);
        this.add(l1);

//JPasswordField
        JPasswordField pass=new JPasswordField();
        pass.setBounds(200, 500, 100, 20);
        this.add(pass);

//checkbox
        JCheckBox c1=new JCheckBox("Java");
        c1.setBounds(100,600,70,70);
        this.add(c1);

    }


}
public class Frame {
    public static void main(String args[]){
        Fdemo f=new Fdemo();

    }
}
