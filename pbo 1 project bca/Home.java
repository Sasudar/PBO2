/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bca;


import GUI.InProgress;
import GUI.LoginKedua;
import GUI.LoginKeempat;
import GUI.LoginKeenam;
import GUI.LoginKelima;
import GUI.LoginKetiga;
import GUI.LoginPertama;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //template login pertama gradasi background
    LoginPertama login1= new LoginPertama();
    login1.setSize(1000, 900);
    login1.setLocationRelativeTo(null);
    login1.setUndecorated(true);
    login1.setDefaultCloseOperation(3);
    login1.setVisible(true);
   
    
    LoginKedua login2= new LoginKedua();
    login2.setSize(1000, 900);
    login2.setLocationRelativeTo(null);
    login2.setUndecorated(true);
    login2.setDefaultCloseOperation(3);
    
    LoginKetiga login3= new LoginKetiga();
    login3.setSize(1000, 900);
    login3.setLocationRelativeTo(null);
    login3.setUndecorated(true);
    login3.setDefaultCloseOperation(3);
    
    
    LoginKeempat login4= new LoginKeempat();
    login4.setSize(1000, 900);
    login4.setLocationRelativeTo(null);
    login4.setUndecorated(true);
    login4.setDefaultCloseOperation(3);
    
    LoginKelima login5= new LoginKelima();
    login5.setSize(1000, 900);
    login5.setLocationRelativeTo(null);
    login5.setUndecorated(true);
    login5.setDefaultCloseOperation(3);
    
    LoginKeenam login6= new LoginKeenam();
    login6.setSize(1000, 900);
    login6.setLocationRelativeTo(null);
    login6.setUndecorated(true);
    login6.setDefaultCloseOperation(3);
    
    InProgress load= new InProgress();
    load.setSize(1000, 900);
    load.setLocationRelativeTo(null);
    load.setUndecorated(true);
    load.setDefaultCloseOperation(3);
    
     //button event page 1
    login1.ttanpakartu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login1.setVisible(false);
                login2.setVisible(true);
                
                
                }
            
        });
    //jlabel event page 1
    login1.texttnpa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login1.setVisible(false);
                login2.setVisible(true);
                
                
                }
            
        });
    //page 2
   login2.textlog24.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login2.setVisible(false);
                login3.setVisible(true);
                
                
                }
            
        });

    
   login2.button21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               login2.setVisible(false);
               login3.setVisible(true);
               

            }       
            
        });
   
    login2.textlog25.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login2.usernum.setText(null);
                
                
                }
            
        });
    
   login2.button22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               login2.usernum.setText(null);

            }       
            
        });
    
     login2.textlog27.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login2.setVisible(false);
                login1.setVisible(true);
                login2.usernum.setText(null);
                login3.pass31.setText(null);
                
                }
            
        });
    //PAGE 3
    
     login3.textlog34.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                 if(login3.pass31.getText().equalsIgnoreCase("123456")){
                login3.setVisible(false);
                login4.setVisible(true);
                 
                 }
            }
        });

    
   login3.button31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               login2.setVisible(false);
               login3.setVisible(true);
               

            }       
            
        });
   
    login3.textlog35.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                 login3.pass31.setText(null);
                
                
                }
            
        });
    
   login3.button32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login3.pass31.setText(null);

            }       
            
        });
    
     login3.textlog37.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login3.setVisible(false);
                login1.setVisible(true);
                login2.usernum.setText(null);
                login3.pass31.setText(null);
                
                }
            
        });
    
     //PAGE 4
       login4.textlog43.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login4.setVisible(false);
                login1.setVisible(true);
                login2.usernum.setText(null);
                login3.pass31.setText(null);
                
                }
            
        });
       
       login4.textlog44.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login4.setVisible(false);
                login5.setVisible(true);
                 
                 }
        });

   login4.button41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login4.setVisible(false);
                login5.setVisible(true);
 
   }
            
        });
   
    login4.textlog45.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
               login4.setVisible(false);
               load.setVisible(true);
               
                
                
                }
            
        });
    
    login4.button42.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               login4.setVisible(false);
               load.setVisible(true);
               

            }       
            
        });
       //IN PROGRESS PAGE
    
     load.textlog53.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                load.setVisible(false);
                login4.setVisible(true);
                
                }
            
        });

     //PAGE 5
     login5.textlog65.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login4.setVisible(false);
                login1.setVisible(true);
                login2.usernum.setText(null);
                login3.pass31.setText(null);
                
                }
            
        }); 
      login5.button61.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login5.setVisible(false);
                login6.setVisible(true);
 
   }
            
        });
   
    login5.textlog62.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login5.setVisible(false);
                login6.setVisible(true);
                
                
                }
            
        });
    
    login5.button62.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login5.setVisible(false);
                login6.setVisible(true);
               

            }       
            
        });
    
    login5.textlog63.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login5.setVisible(false);
                login6.setVisible(true);
                
                
                }
            
        });
    
    //PAGE 6
    login6.textlog74.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                login6.setVisible(false);
                login1.setVisible(true);
                login2.usernum.setText(null);
                login3.pass31.setText(null);
                
                }
            
        });
    
    
    }
    
    
 }
