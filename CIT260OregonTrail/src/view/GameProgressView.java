/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;
import exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FELIPE
 */
public class GameProgressView extends Views{

    public GameProgressView() {
        super("\n ..........................................................."
            + "\n .\nWhen you select \"Look at Map\" in the Main Menu, you  ."
            + "\n .\nwill whatch an image with the cities and places in the  ."
            + "\n .\ngame, additionally close to the description there is   ."
            + "\n .\nthe distance in miles. Please take note                ."
            + "\n ..........................................................."  
            + "\n"
            + "\n Please enter the the distance in miles: ");
    }
    
    @Override
    public boolean doAction(String inputs) {
        try {
            inputs = inputs.trim();
            MapControl mapControl = new MapControl();
            double x=Double.parseDouble(inputs);
            
            if (mapControl == null){
                ErrorView.display(this.getClass().getName(),"Please, input the distance traveled.");
                return false;
            }
            
            this.console.println(mapControl.calcGameProgress(x));
            
            
            return true;
        } catch (MapControlException ex) {
            Logger.getLogger(GameProgressView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
}

    

        
 

