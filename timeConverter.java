/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timeConverter;

/**
 *
 * @author vijaychaudhary
 */


import javax.swing.* ;


public class timeConverter {
    public static void main(String[] args) {
        
        
        
   int minutes = Integer.parseInt (JOptionPane.showInputDialog("Enter the number of minute greater than 60"));
   
   JOptionPane.showMessageDialog(null, "This is equivalent to "+ minutes/60 + " hours and" +minutes%60 + " minutes.", "Results",JOptionPane.PLAIN_MESSAGE);
   
        
        
        
    }
    
}
