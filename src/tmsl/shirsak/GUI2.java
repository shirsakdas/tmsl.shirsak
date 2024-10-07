package tmsl.shirsak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI2 implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    GUI2()
    {
        JFrame jf =new JFrame("Count");
        jf.getContentPane().setBackground(Color.CYAN);
        jf.setSize(200,200);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        l1=new JLabel("Enter String: ");
        t1=new JTextField("",5);
        l2=new JLabel("Enter Count: ");
        l3=new JLabel("");
        t2=new JTextField("",5);
        JButton jb =new JButton("CHECK");
        jb.setBackground(Color.RED);
        jb.addActionListener(this);
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(jb);
        jf.add(l3);
        jf.setVisible(true);
    }
    public void actionPerformed (ActionEvent ae)
    {
        try{
            if(ae.getActionCommand().equals("CHECK"))
            {
                String str=t1.getText(),fin="";
                for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)==' ')
                        break;
                    fin=fin+str.charAt(i);
                }
                str="";
                int count=Integer.parseInt(t2.getText());
                for(int i=0;i<count;i++)
                    str=str+fin;
                l3.setText(str);
            }
        }
        catch(Exception e){l3.setText("WRONG INPUT");}
    }
    public static void main(String[]args){new GUI2();}
}