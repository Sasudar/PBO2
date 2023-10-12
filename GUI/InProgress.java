/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class InProgress extends JFrame{
    public JLabel textlog51= new JLabel();
     public JLabel textlog52= new JLabel();
     public JLabel textlog53= new JLabel();
     public JLabel textlog54=new JLabel();
     public Font fontjudul5= new Font("Calibri",BOLD,35);
     
       public InProgress(){  
        this.setTitle("In Progress");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        
        
               
        textlog51.setText("M A A F  H A L A M A N  I N I  M A S I H");
        textlog51.setLocation(185, 25);
        textlog51.setSize(650,80);
        textlog51.setForeground(Color.black);
        textlog51.setFont(fontjudul5);
        this.add(textlog51);
        
        textlog52.setText("D A L A M  P E N G E M B A N G A N");
        textlog52.setLocation(200, 85);
        textlog52.setSize(840,80);
        textlog52.setForeground(Color.black);
        textlog52.setFont(fontjudul5);
        this.add(textlog52);
        
        textlog53.setText("T E K A N  "+" 'C A N C E L'  U N T U K  K E M B A L I");
        textlog53.setLocation(145, 145);
        textlog53.setSize(840,80);
        textlog53.setForeground(Color.black);
        textlog53.setFont(fontjudul5);
        this.add(textlog53);
        
        
       }
}
