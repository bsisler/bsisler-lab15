import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame{
    
    JFrame enigmaFrame = new JFrame();
    
    public EnigmaFrame() {
        //Enigma Frame
        enigmaFrame.setTitle("Enigma GUI"); 
        enigmaFrame.setSize(300, 400);          
        enigmaFrame.setLocation(100, 100);              
        enigmaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Buttons
        JButton bEncrypt = new JButton("Encrypt");
        JButton bDecrypt = new JButton ("Decrypt");
        
        //Combo Boxes
        String rotorOptions[] = {"1", "2", "3", "4", "5"};
        JComboBox<String> comboInnerRotor = new JComboBox<String>(rotorOptions);
        JComboBox<String> comboMiddleRotor = new JComboBox<String>(rotorOptions);
        JComboBox<String> comboOuterRotor = new JComboBox<String>(rotorOptions);
        
        
        
        
        
        enigmaFrame.setVisible(true); 
    }
}