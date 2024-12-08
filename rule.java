package task1;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class rule extends JFrame implements ActionListener {

    String name;
    JButton Start, back;

    rule(String name) {
        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Mines ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rule = new JLabel();
        rule.setBounds(20, 90, 700, 350);
        rule.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule.setText(
                "<html>" +
                        "1. Read each question carefully before answering. " + "<br><br>" +
                        "2. Choose the correct answer for each multiple-choice question. " + "<br><br>" +
                        "3. For short-answer questions, provide your best response in the space provided. " + "<br><br>"
                        +
                        "4. Answer all questions to complete the quiz. " + "<br><br>" +
                        "<html>"

        );
        add(rule);
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 30);
        Start.setBackground(new Color(30, 144, 254));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        Start.addActionListener(this);
        add(Start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Start)
            ;
        else {

            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new rule("User");

    }

}
