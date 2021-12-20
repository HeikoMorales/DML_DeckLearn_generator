package model;

public class Deck {

	int deckId;
	int creatorId;
	String title, description;
	String imagePath;
	
	public Deck(int deckId, int creatorId, String title, String description, String imagePath) {
		
		this.deckId = deckId;
		this.creatorId = creatorId;
		this.title = title;
		this.description = description;
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Deck [deckId=" + deckId + ", creator=" + creatorId + ", title=" + title + ", description=" + description
				+ ", imagePath=" + imagePath + "]";
	}
	
	
}
