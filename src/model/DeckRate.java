package model;

public class DeckRate {
	
	int deckId, userId, rate;

	public DeckRate(int deckId, int userId, int rate) {
		this.deckId = deckId;
		this.userId = userId;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "DeckRate [deckId= " + deckId + ", userId= " + userId + ", rate= " + rate + "]";
	}
	
}
