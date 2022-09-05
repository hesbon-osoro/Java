package assignment;

public class ShuffleCipher implements MessageEncoder{
	int shuffle;
	String plainText;
	void shuffleCipher(String text, int shift){
		this.plainText=text;
		this.shuffle=shift;
	}
	
	public  String encode( String plainText){
		String enc="";
		char str;
		for(int i=0; i<plainText.length(); i++) {
			str=plainText.charAt(i);
			str+=shuffle;
			enc+=enc;
		}
		return enc;
	}

}
