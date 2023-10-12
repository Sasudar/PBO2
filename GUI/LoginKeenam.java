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
public class LoginKeenam extends JFrame {
     public JLabel textlog71= new JLabel();
     public JLabel textlog72= new JLabel();
     public JLabel textlog73= new JLabel();
     public JLabel textlog74=new JLabel();
     public Font fontjudul7= new Font("Calibri",BOLD,35);
     
     
     public LoginKeenam(){  
        this.setTitle("Login6");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        
         textlog71.setText("T E R I M A  K A S I H  T E L A H ");
        textlog71.setLocation(250, 45);
        textlog71.setSize(650,80);
        textlog71.setForeground(Color.black);
        textlog71.setFont(fontjudul7);
        this.add(textlog71);
        
        textlog72.setText("M E N G G U N A K A N  L A Y A N A N  I N I");
        textlog72.setLocation(180, 85);
        textlog72.setSize(840,80);
        textlog72.setForeground(Color.black);
        textlog72.setFont(fontjudul7);
        this.add(textlog72);
   
        textlog73.setText("A P A K A H  A N D A  I N G I N  M E L A K U K A N");
        textlog73.setLocation(140, 595);
        textlog73.setSize(840,80);
        textlog73.setForeground(Color.black);
        textlog73.setFont(fontjudul7);
        this.add(textlog73);
        
        textlog74.setText("T R A N S A K S I  L A I N ?  T E K A N  ' Y A ' ");
        textlog74.setLocation(250, 650);
        textlog74.setSize(840,80);
        textlog74.setForeground(Color.black);
        textlog74.setFont(fontjudul7);
        this.add(textlog74);
        
        
     }
}
