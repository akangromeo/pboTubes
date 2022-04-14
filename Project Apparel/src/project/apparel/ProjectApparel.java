/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.apparel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author DEAN AGNIA
 */
public class ProjectApparel extends JFrame{
    JLabel ProjectApparelLabel;
    public ProjectApparel(){
               
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       registerPA rg = new registerPA ();
       rg.setVisible(true);
       rg.pack();
       rg.setLocationRelativeTo(null);
       rg.setDefaultCloseOperation(registerPA.EXIT_ON_CLOSE);
       
    } 

   }
