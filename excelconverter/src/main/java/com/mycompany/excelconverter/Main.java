package com.mycompany.excelconverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Java Program to open a file
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//branch test 2

public class Main {
    
    public void bruh() {
        
    }
    
    public static void main(String s[]) {
         
        JFrame frame = new JFrame("Excel Converter");
        
        
        
        final JTextField tf = new JTextField();  
        tf.setBounds(25,15,230,30);
        
        JButton b = new JButton("Input");  
        b.setBounds(270,15,95,30);
        b.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        final JTextField tf2 = new JTextField();  
        tf2.setBounds(25,60,230,30);
        
        JButton b2 = new JButton("Output");  
        b2.setBounds(270,60,95,30);
        b2.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        JButton b3 = new JButton("Start");  
        b3.setBounds(150,110,105,40);
        b3.setBackground(Color.LIGHT_GRAY);
        
        b.addActionListener((ActionEvent e) -> {
            
            FileDialog fd = new FileDialog(new JFrame());
            fd.setVisible(true);
            File[] f = fd.getFiles();
            if(f.length > 0){
                tf.setText(fd.getFiles()[0].getAbsolutePath());
            }
        });
    
        /*    b.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    tf.setText("Welcome to Javatpoint.");  
                }  
            }); 
        */
    
        frame.add(b);frame.add(tf);frame.add(b2);frame.add(tf2);frame.add(b3);
        
        frame.setSize(400,200); 
        frame.setResizable(false);
        frame.setLayout(null);  
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }  
}

