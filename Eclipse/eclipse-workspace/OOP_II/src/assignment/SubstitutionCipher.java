package assignment;

public class SubstitutionCipher implements MessageEncoder {
    int shift;

    SubstitutionCipher(int shift){
        this.shift = shift;
    }

    private char shiftChar( char charToShift){
        int intedChar = (int) charToShift;
        int shiftedInt = intedChar + shift;

        return  (char)shiftedInt;
    }

    @Override
   public String encode( String plainText){  //ABCD  === DEFG
        String shiftedText ;

        StringBuilder stringBuilder = new StringBuilder();

        for( int i = 0; i < plainText.length(); i++){
            stringBuilder.append(  shiftChar( plainText.charAt(i)));
        }

        shiftedText = stringBuilder.toString();
        System.out.println("Plain Text: "+plainText);
        System.out.println("Ciphered Text: "+shiftedText);

        return shiftedText;
   }
    public static void main(String[] args) {
    	SubstitutionCipher sc=new SubstitutionCipher(3);
    	sc.encode("Test String to be Ciphered");
    }
}

