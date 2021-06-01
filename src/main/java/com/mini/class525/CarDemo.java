package com.mini.class525;

import javax.swing.*;

public class CarDemo {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
