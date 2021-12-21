package model;

import java.time.LocalDate;

public class Training {

	int trainingId, userId, DeckId;
	LocalDate date;
	// = LocalDate.of(2014, 2, 14);

	public Training(int trainingId, int userId, int deckId, LocalDate date) {
		this.trainingId = trainingId;
		this.userId = userId;
		this.DeckId = deckId;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", userId=" + userId + ", DeckId=" + DeckId + ", date="
				+ date.getYear() + "/" + date.getMonthValue() + "/" + date.getDayOfMonth() + "]";
	}

}
