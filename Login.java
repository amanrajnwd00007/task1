package task1;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Login extends JFrame implements ActionListener{


 JButton rule,back;
 JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("QUIZ1.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Time New Roman", Font.BOLD, 20));
        add(tfname);

    
        rule = new JButton("Rules");
        rule.setBounds(735, 270, 120, 25);
        rule.setBackground(new Color(30, 144, 254));
        rule.setForeground(Color.WHITE);
        rule.addActionListener(this);
        rule.addActionListener(this);
        add(rule);

        back = new JButton("Back");
        back.setBounds(935, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 600);
        setLocation(200, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()  ==  rule) {
        String name = tfname.getText();
        setVisible(false);
        new rule(name);
        

       } else if (ae.getSource()   == back){
             setVisible(false);
       }
    }

    public static void main(String[] args) {
        new Login();

    }

}