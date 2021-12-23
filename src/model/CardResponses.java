package model;


public class CardResponses {

	int cardId, training_sessionId, time;

	public CardResponses(int cardId, int training_sessionId, int time) {
		this.cardId = cardId;
		this.training_sessionId = training_sessionId;
		this.time = time;
	}

	@Override
	public String toString() {
		return "CardStatistic [cardId=" + cardId + ", training_sessionId="
				+ training_sessionId + ", time=" + time + "]";
	}
	
}
