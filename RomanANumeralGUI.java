package Project1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RomanANumeralGUI extends JFrame {
    
    static String[] romanNumerals;
    static int[] converted;
    static TextArea myText, givenText;
    static int res;

    public static void printRomanNumerals(RomanANumeralGUI romanNums, ArrayList<String> values, ArrayList<Integer> convert) {
    
        romanNums = new RomanANumeralGUI();
        romanNums.setTitle("Convert Roman Numerals");
        romanNums.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        romanNums.setSize(1280, 720);
        romanNums.setVisible(true);
        romanNums.setLayout(new GridLayout(1,2));
        
        Container content = romanNums.getContentPane();

        myText = new TextArea();
        givenText = new TextArea();
    

        romanNumerals = new String[values.size()];
        for(int i = 0; i < values.size(); i++) {
            romanNumerals[i] = values.get(i);
            givenText.append(romanNumerals[i] + "\n");
        }
        
        converted = new int[convert.size()];
        for(int j = 0; j < convert.size(); j++) {
            converted[j] = convert.get(j);
            myText.append(converted[j] + "\n");    
        }
        content.add(givenText);
        content.add(myText);
        
    }

}