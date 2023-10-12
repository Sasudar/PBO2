/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class LoginKedua extends JFrame {
     public JButton button21 = new JButton();
     public JButton button22 = new JButton();
     public JLabel textlog21= new JLabel();
     public JLabel textlog22= new JLabel();
     public JLabel textlog23= new JLabel();
     public JLabel textlog24=new JLabel();
     public JLabel textlog25= new JLabel();
     public JLabel textlog26= new JLabel();
     public JLabel textlog27= new JLabel();
     public JLabel pmbtas= new JLabel();
     public JTextField usernum = new JTextField();
     public Font fontjudul2= new Font("Calibri",BOLD,35);
     public Font fontpmbtas2= new Font("Calibri",BOLD,55);
     public LoginKedua(){
        this.setTitle("Login2");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        
        textlog21.setText("S I L A H K A N  M E M A S U K K A N");
        textlog21.setLocation(260, 25);
        textlog21.setSize(650,80);
        textlog21.setForeground(Color.black);
        textlog21.setFont(fontjudul2);
        this.add(textlog21);
        
        textlog22.setText("NO.");
        textlog22.setLocation(20, 75);
        textlog22.setSize(650,80);
        textlog22.setForeground(Color.black);
        textlog22.setFont(fontjudul2);
        this.add(textlog22);
        
        textlog23.setText("H A N D P H O N E  /  P E L A N G G A N   A N D A ");
        textlog23.setLocation(180, 75);
        textlog23.setSize(840,80);
        textlog23.setForeground(Color.black);
        textlog23.setFont(fontjudul2);
        this.add(textlog23);
        
        
        usernum.setSize(740, 45);
        usernum.setLocation(140, 185);
        usernum.setFont(fontjudul2);
        usernum.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        this.add(usernum);
        
        pmbtas.setText("- - - - - - - - - - - - - - - - - - - - - - - - -");
        pmbtas.setLocation(140, 210);
        pmbtas.setSize(840,80);
        pmbtas.setForeground(Color.black);
        pmbtas.setFont(fontpmbtas2);
        this.add(pmbtas);
        
        textlog24.setText("B E N A R    >");
        textlog24.setLocation(690, 320);
        textlog24.setSize(840,80);
        textlog24.setForeground(Color.black);
        textlog24.setFont(fontjudul2);
        this.add(textlog24);
        
        button21.setSize(75,90);
        button21.setLocation(880, 320);
        button21.setBackground(Color.lightGray);
        this.add(button21);
        
        textlog25.setText("S A L A H    >");
        textlog25.setLocation(690, 480);
        textlog25.setSize(840,80);
        textlog25.setForeground(Color.black);
        textlog25.setFont(fontjudul2);
        this.add(textlog25);
        
        button22.setSize(75,90);
        button22.setLocation(880, 480);
        button22.setBackground(Color.lightGray);
        this.add(button22);
        
        textlog26.setText("U N T U K   M E M B A T A L K A N   T R A N S A K S I");
        textlog26.setLocation(140, 595);
        textlog26.setSize(840,80);
        textlog26.setForeground(Color.black);
        textlog26.setFont(fontjudul2);
        this.add(textlog26);
        
        textlog27.setText("T E K A N  "+" 'C A N C E L' ");
        textlog27.setLocation(340, 650);
        textlog27.setSize(840,80);
        textlog27.setForeground(Color.black);
        textlog27.setFont(fontjudul2);
        this.add(textlog27);
        
        
     }
}
    
