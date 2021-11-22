/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optime;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author JohnChown
 */
    // beginnersbooks
public class OpTime implements ActionListener {
    /**
     * @param args the command line arguments
     */
    
   private static JLabel UserLabel;
   private static JLabel currentLabel;
   private static JButton button;
   private static JLabel timeStats;
   private static String[] optionStrings = { "Day", "Week", "Month", "Year" };
   private static JComboBox optionList = new JComboBox(optionStrings);
   private static JLabel lblTxt = new JLabel();
    
       public static void main(String[] args) {
        // TODO code application logic here
        
        
     
     
     JPanel panel = new JPanel();
     JFrame frame = new JFrame();
     frame.setSize(1920, 1080);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     frame.add(panel);
     
     
     panel.setLayout(null);
     
     
     optionList.setBounds(1500,250,100,50);
     optionList.addActionListener(optionList);
     panel.add(optionList);
     
     
     UserLabel = new JLabel("OpTime");
     UserLabel.setBounds(750, 10, 500, 150);
     panel.add(UserLabel);
     UserLabel.setFont(new Font("Futura", Font.BOLD, 100));
     
    
     
     currentLabel = new JLabel("Current Tasks");
     currentLabel.setBounds(250, 150, 500, 100);
     panel.add(currentLabel);
     currentLabel.setFont(new Font("Futura", Font.BOLD, 20));
    
     
     button = new JButton("Browse Local Files");
     button.setBounds(875, 880, 150, 50);
     button.addActionListener(new OpTime());
     panel.add(button);
     
     timeStats = new JLabel("Time Stats");
     timeStats.setBounds(1500, 150, 500, 100);
     panel.add(timeStats);
     timeStats.setFont(new Font("Futura", Font.BOLD, 20));
     
     
     frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
       try {
           Runtime.getRuntime().exec("explorer.exe /select, path");
       } catch (IOException ex) {
           Logger.getLogger(OpTime.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
    public void boxActionPerformed(ActionEvent f) {
       
        
       if (f.getSource() == optionList){
           JComboBox cb = (JComboBox)f.getSource();
           String msg = (String)cb.getSelectedItem();
           switch (msg){
               case "Day": lblTxt.setText("You Have Selected Day");
                break;
               case "Week": lblTxt.setText("You Have Selected Week");
                break;
               case "Month": lblTxt.setText("You have selected Month");
                break;
               case "Year": lblTxt.setText("You have selected Year");
                break;
               default: lblTxt.setText("Error");
                      
           }
       }
    }
    
    ConsentPage x = new ConsentPage();
}
