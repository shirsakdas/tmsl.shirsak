package tmsl.shirsak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SampleGUI implements ActionListener {
    JTextField txt1;
    JLabel jlab1, jlab2;
    SampleGUI(){
        JFrame frame = new JFrame("Calculation");
        //frame.setVisible(true);
        frame.setSize(300,300);
        JLabel label = new JLabel();
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        jlab1 = new JLabel("Enter String: ");
        txt1 = new JTextField("",5);
        jlab2 = new JLabel("");
        //txt2 = new JTextField("",5);
        JButton jb=new JButton("Check");
        jb.addActionListener(this);
        frame.add(jlab1);
        frame.add(txt1);
        //frame.add(jlab2);
        //frame.add(txt2);
        frame.add(jb);
        frame.add(jlab2);
        frame.setVisible(true);
        //jb.setVisible(true);g
    }

    public void actionPerformed(ActionEvent ae){
        try{
            String str=txt1.getText();
            String rev="";
            for(int i=0;i<str.length();i++){
                rev=str.charAt(i)+rev;
            }
            jlab2.setText(rev);
        }
        catch(Exception e){
            System.out.println("Wrong Input");
        }

    }

    public static void main(String[] args) {
        new SampleGUI();
    }
}