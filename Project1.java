package Project1;

import java.util.*;

public class Project1 {
static ArrayList<String> saved;
static RomanANumeralGUI romanNumber;
static String words = "";
    static ArrayList<String> storage;
    static TextFileInput file;
    public static ArrayList<String> readFromFile(){
        file = new TextFileInput("input.txt");
        String currentLine;
        currentLine = file.readLine();

        String[] splitArray;
        storage = new ArrayList<>();
    while(currentLine != null) {
        splitArray = currentLine.split(",");
        for (String str : splitArray) {
            storage.add(str);
        }
        currentLine = file.readLine();
    }
    return storage;
    }

    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    public static ArrayList<Integer> romanToDecimal() {
        ArrayList<Integer> results = new ArrayList<Integer>();
        
        for(int i = 0; i < storage.size(); i++) {
            int res = 0;
            String word = storage.get(i);
    
            for(int j = 0; j < word.length(); j++) {
                int s1 = value(word.charAt(j));
    
                if(j + 1 < word.length()) {
                    int s2 = value(word.charAt(j + 1));
    
                    if(s1 >= s2) {
                        res = res + s1; 
                    } else {
                        res = res + s2 - s1;
                        j++;
                    }
                } else {
                    res = res + s1;
                }
            }
            
            results.add(res);
        }
        
        return results;
    }
    public static void main(String [] args){
        RomanANumeralGUI.printRomanNumerals(romanNumber, readFromFile(), romanToDecimal());
    }
        
    }
    
 

    