package Swing;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

class Log2 extends JFrame{
    public Log2(){
        this.setTitle("Frame demo");
        this.setVisible(true);
        this.setSize(400,400);
        this.setLayout(null);
//password label
        JLabel l1=new JLabel("password");
        l1.setBounds(100,100,100,40);
//password
        JPasswordField pass=new JPasswordField();
        pass.setBounds(200,100,100,40);
//show password
        JCheckBox c1=new JCheckBox("Show password ");
        c1.setBounds(150,150,70,30);
//reset label
        JButton b1=new JButton("reset");
        b1.setBounds(200,300,70,30);
        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JCheckBox j1=(JCheckBox) e.getSource();
                if(j1.isSelected()){
                    pass.setEchoChar((char) 0);
                }
                else{
                    pass.setEchoChar('\u2022');
                }

            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                pass.setText("");

                getContentPane().setBackground(Color.BLACK);
                
            }
        });
        this.add(b1);
        this.add(c1);
        this.add(pass);
        this.add(l1);



    }


}
public class test2 {
    public static void main (String args[]){
        Log2 test=new Log2();

    }
}
