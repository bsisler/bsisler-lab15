public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }
    
    /*
    * 1. Inner -> Outer at same position
    * 2. Outer -> Middle at same letter
    * 3. Middle -> Outer at same position
    * (Opposite to decrypt)
    */

    public String decrypt(String message){        
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            //Step 1: Middle -> Outer (same position)
            char middle = message.charAt(i);
            int position = rotors[2].indexOf(middle);
            char outer = rotors[1].charAt(position);
            //Step 2: Outer -> Middle (same letter)
            position = rotors[2].indexOf(outer);
            //Step 3: Inner -> Outer (same position)
            char inner = rotors[0].charAt(position);
            //Add the newly decrypted letter then rotate the rotors
            decrypted = decrypted + inner;
            rotate();
        }
        return decrypted;
    }


    
    public String encrypt(String message){
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            //Step 1: Inner -> Outer (same position)
            char inner = message.charAt(i);
            int position = rotors[0].indexOf(inner);
            char outer = rotors[2].charAt(position);
            //Step 2: Outer -> Middle (same letter)
            position = rotors[1].indexOf(outer);
            //Step 3: Middle -> Outer (same position)
            char middle = rotors[2].charAt(position);
            //Add the newly encrypted letter then rotate the rotors
            encrypted = encrypted + middle;
            rotate();
        }
        return encrypted;
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
