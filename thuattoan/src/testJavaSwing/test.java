package testJavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
    public void main(String[] args) {
        JFrame JF = new JFrame();
        JButton Jb = new JButton("Click");
        JLabel Jl = new JLabel("",JLabel.CENTER);
        Jl.setText("test java Swing");
        Jl.setSize(500,160);
        Jl.setForeground(Color.red);
        Jb.setBounds(200,100,100,40);
        JF.setTitle("Test javaSwing");
        JF.add(Jb);
        JF.add(Jl);
        JF.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JF.setSize(500,300);
        JF.setLayout(null);
        JF.setVisible(true);
    }
}
