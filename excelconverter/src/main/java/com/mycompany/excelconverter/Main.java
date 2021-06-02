package com.mycompany.excelconverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Java Program to open a file
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import java.awt.FileDialog;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;  
import javax.swing.*;    
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//branch test

public class Main {
    
    public void bruh() {
        
    }
    
    public static void main(String s[]) {
         
        JFrame frame = new JFrame("Excel Converter");
        
        final JTextField tf = new JTextField();  
        tf.setBounds(50,50, 150,20);
        
        JButton b = new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
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
    
        frame.add(b);frame.add(tf);  
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }  
}

