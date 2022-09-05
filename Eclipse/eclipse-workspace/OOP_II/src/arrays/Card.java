package arrays;
//Card class represents a playing card.

public class Card {
	private String face; //face of card ("Ace", "Deuce",...)
	private String suit; //suit of card ("Hearts", "Diamonds",..)
	

	//tow-argument constructor initializes card's face and suit
	public Card( String cardFace, String cardSuit) {
		face = cardFace; //initializes face of card
		suit = cardSuit; //initializes suit of card
	} //end of two-argument Card constructor
	
	//return String representation of Card
	public String toString() {
		return face + " of "+suit;
	}
	
}
