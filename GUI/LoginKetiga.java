/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author user
 */
public class LoginKetiga extends JFrame {
     public JButton button31 = new JButton();
     public JButton button32 = new JButton();
     public JLabel textlog31= new JLabel();
     public JLabel textlog32= new JLabel();
     public JLabel textlog33= new JLabel();
     public JLabel textlog34= new JLabel();
     public JLabel textlog35= new JLabel();
     public JLabel textlog36= new JLabel();
     public JLabel textlog37= new JLabel();
     public JLabel textlog38= new JLabel();
     public JPasswordField pass31= new JPasswordField();
     public Font fontjudul3= new Font("Calibri",BOLD,35);
     public JLabel ImageFrame31=new JLabel();
     public LoginKetiga(){  
        this.setTitle("Login3");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        
        
        textlog31.setText("S I L A H K A N ");
        textlog31.setLocation(555, 55);
        textlog31.setSize(650,80);
        textlog31.setForeground(Color.black);
        textlog31.setFont(fontjudul3);
        this.add(textlog31);
        
        textlog32.setText(" M E M A S U K K A N");
        textlog32.setLocation(550, 95);
        textlog32.setSize(650,80);
        textlog32.setForeground(Color.black);
        textlog32.setFont(fontjudul3);
        this.add(textlog32);
        
        textlog33.setText("P I N  A N D A");
        textlog33.setLocation(555, 135);
        textlog33.setSize(650,80);
        textlog33.setForeground(Color.black);
        textlog33.setFont(fontjudul3);
        this.add(textlog33);
     
        
        
        pass31.setBounds(555, 195,320, 35);
        pass31.setForeground(Color.BLACK);
        pass31.setFont(fontjudul3);
        pass31.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        this.add(pass31);
        
        ImageFrame31.setIcon(new ImageIcon("pin.jpg"));
        ImageFrame31.setSize(400, 400);
        ImageFrame31.setLocation(45,65);
        this.add(ImageFrame31);
        
                
        textlog34.setText("B E N A R    >");
        textlog34.setLocation(690, 320);
        textlog34.setSize(840,80);
        textlog34.setForeground(Color.black);
        textlog34.setFont(fontjudul3);
        this.add(textlog34);
        
        button31.setSize(75,90);
        button31.setLocation(880, 320);
        button31.setBackground(Color.lightGray);
        this.add(button31);
        
        textlog35.setText("S A L A H    >");
        textlog35.setLocation(690, 480);
        textlog35.setSize(840,80);
        textlog35.setForeground(Color.black);
        textlog35.setFont(fontjudul3);
        this.add(textlog35);
        
        button32.setSize(75,90);
        button32.setLocation(880, 480);
        button32.setBackground(Color.lightGray);
        this.add(button32);
        
        textlog36.setText("U N T U K   M E M B A T A L K A N   T R A N S A K S I");
        textlog36.setLocation(140, 595);
        textlog36.setSize(840,80);
        textlog36.setForeground(Color.black);
        textlog36.setFont(fontjudul3);
        this.add(textlog36);
        
        textlog37.setText("T E K A N  "+" 'C A N C E L' ");
        textlog37.setLocation(340, 650);
        textlog37.setSize(840,80);
        textlog37.setForeground(Color.black);
        textlog37.setFont(fontjudul3);
        this.add(textlog37);
        
        
     }
}
