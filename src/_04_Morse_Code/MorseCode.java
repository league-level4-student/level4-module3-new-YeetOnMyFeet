package _04_Morse_Code;

import _03_Intro_to_Binary_Trees.Node;

public class MorseCode implements Comparable<MorseCode> {

    private String decoded;
    private String coded;
    private int position;
   
     

    public MorseCode(String decoded, String coded) {

        this.decoded = decoded;
        this.coded = coded;
        this.position = 0;

    }

    public MorseCode(String coded) {

        this.coded = coded;
        this.position = 0;

    }

    public String getDecoded() {
        return this.decoded;
    }
    
    /*
     * Implement the compareTo method so that the binary tree will go down the
     * right tree if it finds a '-' at the current position and go down the
     * left tree if it finds a '.'. 
     *
     * Hint: This works the same as String's compareTo.
     */
    @Override
    public int compareTo(MorseCode o) {
    	 if (o.coded.length() < 1 || o.coded.equals("")) {
			return 0;
		} 	
    	if (o.coded.charAt(position) == '-') {
			return -1;
		}
    	
    	else if (o.coded.charAt(position) == '.') {
			return 1;
		}
    	
       return 0;
       
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return decoded;
    }

}
