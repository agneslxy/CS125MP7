
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards;
	
	//constructor for deck containing 52 cards.
	public Deck() {
		this.cards = new ArrayList<Card>();
	}
	
	//create a full deck with 52 cards.
	public void createFullDeck() {
		for (Suit cardsSuit: Suit.values()) {
			for (Value cardsValue: Value.values()) {
				this.cards.add(new Card(cardsSuit, cardsValue));
			}			
		}
	}
	
	//get the values of cards in deck.
	public String toString() {		
		String currentDeck = "";
		for (Card card: this.cards) {
			currentDeck = card.toString() + "\n";
		}		
		return currentDeck;
	}
	
	//method to shuffle the deck. 
	public void shuffle() {
		
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		
		//Generate random index rand.nextInt((max - min) + 1) + min;
		Random rand = new Random();
		
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		
		for (int cardIndex = originalSize; cardIndex > 0; cardIndex--) {
			randomCardIndex = rand.nextInt(cardIndex);
			tempDeck.add(this.cards.get(randomCardIndex));
			this.cards.remove(randomCardIndex);
		}
		this.cards = tempDeck;
	}
	
	public Card getCard(int i) {
		return this.cards.get(i);
	}
	
	public void removeCard(int i) { 
		this.cards.remove(i);
	}
	
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}
	
	public void drawCard(Deck deck) {
		this.cards.add(deck.getCard(0));
		deck.removeCard(0);		
	}
	
	public int gameScore() {
		int total = 0;
		int numAces = 0;
		
		for(Card card: this.cards) {
			switch(card.getValue()) {
				case TWO: total += 2; break;
				case THREE: total += 3; break;
				case FOUR: total += 4; break;
				case FIVE: total += 5; break;
				case SIX: total += 6; break;
				case SEVEN: total += 7; break;
				case EIGHT: total += 8; break;
				case NINE: total += 9; break;
				case TEN: total += 10; break;
				case JACK: total += 10; break;
				case KING: total += 10; break;
				case QUEEN: total += 10; break;
				case ACE: numAces += 1; break;
			}			
		}
		
		for(int i = 1; i <= numAces; i++) {
			if(total < 12) {
				total += 11;
			} else {
				total += 1;
			}
		}
		return total;
	}
	
	
	public int deckSize() {
		return this.cards.size();
	}
	
	public void showHand(Deck deck) {
		for (int i = 0; i < deck.deckSize(); i++) {
			System.out.println(deck.getCard(i).toString());
		}
	}
	
	public void restart(Deck newDeck) {
		for(int i = 0; i < this.cards.size(); i++) {
			newDeck.addCard(this.getCard(i));
		}
		
		for(int i = 0; i < this.cards.size(); i++) {
			this.cards.remove(0);
		}	
	}
}