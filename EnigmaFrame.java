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

        //Panel SetUp
        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();

        JPanel topLeft = new JPanel();
        JPanel topMiddle = new JPanel();
        JPanel topRight = new JPanel();

        JPanel rightRight = new JPanel();

        //Components Added to Panels
        bottom.add(lOutput, BorderLayout.WEST);
        bottom.add(tAOutput, BorderLayout.EAST);

        middle.add(lInput, BorderLayout.WEST);
        middle.add(tAInput, BorderLayout.EAST);

        top.add(topLeft, BorderLayout.WEST);
        top.add(topMiddle, BorderLayout.CENTER);
        top.add(topRight, BorderLayout.EAST);

        topLeft.add();
        topLeft.add();

        topMiddle.add();
        topMiddle.add();
        
        topRight.add();
        topRight.add();
        topRight.add(rightRight, BorderLayout.EAST);

        rightRight.add(bEncrypt, BorderLayout.WEST);
        rightRight.add(bDecrypt, BorderLayout.EAST);

        //Panels Added to Frame
        

        enigmaFrame.pack();
        enigmaFrame.setVisible(true); 
    }
}