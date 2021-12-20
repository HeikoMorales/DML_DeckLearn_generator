package model;

public class Card {
	int cardId, deckId;
	String question, answer, imagePath;

	public Card(int cardId, int deckId, String question, String answer, String imagePath) {
		this.cardId = cardId;
		this.deckId = deckId;
		this.question = question;
		this.answer = answer;
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", deckId=" + deckId + ", question=" + question + ", answer=" + answer
				+ ", imagePath=" + imagePath + "]";
	}

}
