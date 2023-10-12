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

/**
 *
 * @author user
 */
public class LoginKelima extends JFrame{
       public JButton button61 = new JButton();
     public JButton button62 = new JButton();
     public JLabel textlog61= new JLabel();
     public JLabel textlog62= new JLabel();
     public JLabel textlog63= new JLabel();
     public JLabel textlog64=new JLabel();
     public JLabel textlog65= new JLabel();
     public JLabel textlog66= new JLabel();
     public Font fontjudul6= new Font("Calibri",BOLD,35);
     
     public LoginKelima(){  
        this.setTitle("Login5");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        
        textlog61.setText("S I L A H K A N  M E M I L I H  P E C A H A N");
        textlog61.setLocation(185, 25);
        textlog61.setSize(650,80);
        textlog61.setForeground(Color.black);
        textlog61.setFont(fontjudul6);
        this.add(textlog61);
        
        textlog66.setText("Y A N G  D I I N G I N K A N");
        textlog66.setLocation(285, 85);
        textlog66.setSize(840,80);
        textlog66.setForeground(Color.black);
        textlog66.setFont(fontjudul6);
        this.add(textlog66);  
        
        textlog62.setText("<  5 0 . 0 0 0");
        textlog62.setLocation(160, 320);
        textlog62.setSize(840,80);
        textlog62.setForeground(Color.black);
        textlog62.setFont(fontjudul6);
        this.add(textlog62);
        
        button61.setSize(75,90);
        button61.setLocation(40, 320);
        button61.setBackground(Color.lightGray);
        this.add(button61);
        
        textlog63.setText("< D I U T A M A K A N  1 0 0 . 0 0 0");
        textlog63.setLocation(160, 480);
        textlog63.setSize(840,80);
        textlog63.setForeground(Color.black);
        textlog63.setFont(fontjudul6);
        this.add(textlog63);
       
        button62.setSize(75,90);
        button62.setLocation(40, 480);
        button62.setBackground(Color.lightGray);
        this.add(button62);
        
        textlog64.setText("U N T U K   M E M B A T A L K A N   T R A N S A K S I");
        textlog64.setLocation(140, 595);
        textlog64.setSize(840,80);
        textlog64.setForeground(Color.black);
        textlog64.setFont(fontjudul6);
        this.add(textlog64);
        
        textlog65.setText("T E K A N  "+" 'C A N C E L' ");
        textlog65.setLocation(340, 650);
        textlog65.setSize(840,80);
        textlog65.setForeground(Color.black);
        textlog65.setFont(fontjudul6);
        this.add(textlog65);
     }
}
