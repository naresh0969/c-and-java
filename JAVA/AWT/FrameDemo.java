 package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;



class Sample extends Frame{
    public Sample(){
        
//Frame
        // Frame fr=new Frame("My Frame");
        this.setTitle("My Frame");
        this.setVisible(true);
        this.setSize(500,500);

//Color
        //method 1
        Color c=Color.green;
        this.setBackground(c);
        //method 2
        Color a=new Color(225,255,255);
        this.setBackground(a);

//Label
        Font f1=new Font("Arial",1,25);
        this.setFont(f1);
        Label l1=new Label("User Name");
        Label l2=new Label("Password");
        l1.setBounds(300,200,200,50);
        l2.setBounds(300,300,200,50);
        this.add(l1);
        this.add(l2);
//

//TextField
        TextField t=new TextField("Enter User Name");
        t.setBounds(500,200,250,50);
        this.add(t);
        TextField t2=new TextField();
        t2.setBounds(500,300,250,50);
        t2.setEchoChar('*');
        this.add(t2);
//Button
        Button b=new Button("Log In");
        b.setBounds(550,450,100,100);
        this.add(b);
        add(new GExample());
//Window Exit
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });


    }
}

class GExample extends Canvas{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 100);
        g.setColor(Color.CYAN);
        g.drawOval(200,200 , 50, 50);
        g.fillOval(200,200 , 50, 50);

        g.setColor(Color.blue);
        g.drawRect(300, 200, 100, 50);
//Font
        Font f=new Font("Times New Roman",2,25);
        g.setFont(f);
        g.drawString("Naresh", 100, 100);


    }

}

public class FrameDemo {

    public static void main(String args[]){
        Sample obj=new Sample();

    }
    
}

// import java.awt.*;

// class Sample extends Frame {
//     public Sample() {
//         add(new GExample());

//         setTitle("My Frame");
//         setSize(500, 500);

//         // Set background color directly for the Sample frame
//         Color a = new Color(225, 255, 255);
//         setBackground(a);

//         setVisible(true);
//     }
// }

// class GExample extends Canvas {
//     @Override
//     public void paint(Graphics g) {
//         super.paint(g);
//         g.setColor(Color.RED);
//         g.fillRect(50, 50, 200, 100);
//     }
// }

// public class FrameDemo {
//     public static void main(String args[]) {
//         Sample obj = new Sample();
//     }
// }
