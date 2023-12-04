/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belowwaterapp;

import javax.swing.JOptionPane;

/**
 *
 * @author RedietBerhe
 */
public class BelowWaterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        /*String ans;

        do{
            myUI.menu();
            ans = JOptionPane.showInputDialog(null, "Would you like to return to the menu? Yes/No");
        }
        while(ans.equalsIgnoreCase("yes"));*/
        
        DataGUI myGUI = new DataGUI();
        myGUI.setVisible(true);
    }
    
}
