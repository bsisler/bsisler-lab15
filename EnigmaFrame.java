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
        
        //Buttons (b)
        JButton bEncrypt = new JButton("Encrypt");
        JLabel lEncrypt = new JLabel("Encrypt");
        JButton bDecrypt = new JButton ("Decrypt");
        JLabel lDecrypt = new JLabel("Decrypt");
        
        //Combo Boxes (combo)
        String rotorOptions[] = {"1", "2", "3", "4", "5"};
        JComboBox<String> comboInnerRotor = new JComboBox<String>(rotorOptions);
        JLabel lInner = new JLabel("Inner");
        JComboBox<String> comboMiddleRotor = new JComboBox<String>(rotorOptions);
        JLabel lMiddle = new JLabel("Middle");
        JComboBox<String> comboOuterRotor = new JComboBox<String>(rotorOptions);
        JLabel lOuter = new JLabel("Out");
        
        //Text Field (tF)
        JTextField tFStartPos = new JTextField();
        JLabel lStart = new JLabel("Initial Positions");

        //Text Areas (tA)
        JTextArea tAInput = new JTextArea();
        JLabel lInput = new JLabel("Input");
        JTextArea tAOutput = new JTextArea();
        JLabel lOutput = new JLabel("Output");

        
        
        
        enigmaFrame.setVisible(true); 
    }
}