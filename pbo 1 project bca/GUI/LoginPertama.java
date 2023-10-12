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

/**
 *
 * @author user
 */
public class LoginPertama extends JFrame {
    public JLabel judul= new JLabel();
    public JLabel judul1= new JLabel();
    public JLabel judul2= new JLabel();
    public JLabel pmbatas= new JLabel();
    public JLabel judul3= new JLabel();
    public JLabel judul4= new JLabel();
    public JButton ttanpakartu = new JButton();
    public JLabel texttnpa= new JLabel();
    public JLabel ImageFrame=new JLabel();
    public Font font= new Font("Calibri",BOLD,35);
    public Font fontjudul= new Font("Calibri",BOLD,35);   
    public LoginPertama(){
        this.setTitle("Login");
        this.setLayout(null); //field need null
        this.setResizable(false);
        this.getContentPane().setBackground(Color.blue.darker());
        
        judul.setText("S I L A H K A N");
        judul.setLocation(620, 125);
        judul.setSize(650,80);
        judul.setForeground(Color.white);
        judul.setFont(fontjudul);
        this.add(judul);
        
        judul1.setText("M E M A S U K K A N");
        judul1.setLocation(620, 200);
        judul1.setSize(650,80);
        judul1.setForeground(Color.white);
        judul1.setFont(fontjudul);
        this.add(judul1);
        
        judul2.setText("K A R T U  A N D A ");
        judul2.setLocation(620, 275);
        judul2.setSize(650,80);
        judul2.setForeground(Color.white);
        judul2.setFont(fontjudul);
        this.add(judul2);
        
        pmbatas.setText("------------------------------");
        pmbatas.setLocation(620, 345);
        pmbatas.setSize(650,80);
        pmbatas.setForeground(Color.white);
        pmbatas.setFont(fontjudul);
        this.add(pmbatas);
        
        judul3.setText("P L E A S E  I N S E R T ");
        judul3.setLocation(620, 405);
        judul3.setSize(650,80);
        judul3.setForeground(Color.white);
        judul3.setFont(fontjudul);
        this.add(judul3);
        
        judul4.setText("Y O U R  C A R D");
        judul4.setLocation(620, 485);
        judul4.setSize(650,80);
        judul4.setForeground(Color.white);
        judul4.setFont(fontjudul);
        this.add(judul4);

        ttanpakartu.setSize(75,90);
        ttanpakartu.setLocation(880, 585);
        ttanpakartu.setBackground(Color.lightGray);
        this.add(ttanpakartu);
        
        texttnpa.setText("T R A N S A K S I  T A N P A  K A R T U  >");
        texttnpa.setSize(600, 50);
        texttnpa.setLocation(285, 620);
        texttnpa.setForeground(Color.white);
        texttnpa.setFont(font);
        this.add(texttnpa);
        
        ImageFrame.setIcon(new ImageIcon("card.png"));
        ImageFrame.setSize(600, 600);
        ImageFrame.setLocation(10,35);
        this.add(ImageFrame);
     
        
    }    
       
       
    
        
}
