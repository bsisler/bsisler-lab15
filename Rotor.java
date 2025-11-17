public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //Create a place holder string
        String temp = "";
        //Set the first char equal to the last char
        temp = temp + rotorValues.charAt(26);
        //Iterate through the string and adds the chars into temp
        for (int i = 0; i < 26; i++) {
            temp = temp + rotorValues.charAt(i);
        }
        rotorValues = temp;
        //Check if the rotor has been rotated back to the start
        if (rotorValues.charAt(0) == startChar) {
            return true;
        } else {
            return false;
        }       
    }
    

    public int indexOf(char c){
        //Iterates through the string until you find the char
        for (int i = 0; i < 27; i++) {
            if (rotorValues.charAt(i) == c) {
                return i;
            }
        }
        //c is not in the string
        return -1;
    }

    public char charAt(int idx){
        //Return the character at an index in the rotorValues
        int index = 0;
        while (index < 27) {
            if (index == idx) {
                return rotorValues.charAt(index);
            }
            index++;
        }
        //idx is out of range
        return '0';
    }
}
    
