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
public class LoginKeempat extends JFrame {
     public JButton button41 = new JButton();
     public JButton button42 = new JButton();
     public JLabel textlog41= new JLabel();
     public JLabel textlog42= new JLabel();
     public JLabel textlog43= new JLabel();
     public JLabel textlog44=new JLabel();
     public JLabel textlog45= new JLabel();
     public JLabel textlog46= new JLabel();
     public Font fontjudul4= new Font("Calibri",BOLD,35);
      public LoginKeempat(){  
        this.setTitle("Login4");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        
         
        textlog41.setText("S I L A H K A N  M E M I L I H  T R A N S A K S I");
        textlog41.setLocation(185, 25);
        textlog41.setSize(650,80);
        textlog41.setForeground(Color.black);
        textlog41.setFont(fontjudul4);
        this.add(textlog41);
        
        
        textlog42.setText("U N T U K   M E M B A T A L K A N   T R A N S A K S I");
        textlog42.setLocation(140, 85);
        textlog42.setSize(840,80);
        textlog42.setForeground(Color.black);
        textlog42.setFont(fontjudul4);
        this.add(textlog42);
        
        textlog43.setText("T E K A N  "+" 'C A N C E L' ");
        textlog43.setLocation(340, 145);
        textlog43.setSize(840,80);
        textlog43.setForeground(Color.black);
        textlog43.setFont(fontjudul4);
        this.add(textlog43);
        
        
        textlog44.setText("<  S E T O R A N  T U N A I");
        textlog44.setLocation(160, 320);
        textlog44.setSize(840,80);
        textlog44.setForeground(Color.black);
        textlog44.setFont(fontjudul4);
        this.add(textlog44);
        
        button41.setSize(75,90);
        button41.setLocation(40, 320);
        button41.setBackground(Color.lightGray);
        this.add(button41);
        
        textlog45.setText("<  P E N A R I K A N  T U N A I  /");
        textlog45.setLocation(160, 480);
        textlog45.setSize(840,80);
        textlog45.setForeground(Color.black);
        textlog45.setFont(fontjudul4);
        this.add(textlog45);
        
          
        textlog46.setText("T R A N S A K S I  L A I N N Y A");
        textlog46.setLocation(160, 540);
        textlog46.setSize(840,80);
        textlog46.setForeground(Color.black);
        textlog46.setFont(fontjudul4);
        this.add(textlog46);
        
        button42.setSize(75,90);
        button42.setLocation(40, 480);
        button42.setBackground(Color.lightGray);
        this.add(button42);
        
        
        
        
      }
}


