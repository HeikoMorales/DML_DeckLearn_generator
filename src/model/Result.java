package model;

public class Result {

	int resultId, trainingSessionId, cardId, box_number, error_number, avgResponseTime;

	public Result(int resultId, int trainingSessionId, int cardId, 
			int box_number, int error_number, int avgResponseTime) {
		this.resultId = resultId;
		this.trainingSessionId = trainingSessionId;
		this.cardId = cardId;
		this.box_number = box_number;
		this.error_number = error_number;
		this.avgResponseTime = avgResponseTime;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", trainingSessionId=" + trainingSessionId + ", cardId=" + cardId
				+ ", box_number=" + box_number + ", error_number=" + error_number + ", avgResponseTime="
				+ avgResponseTime + "]";
	}
	
	
}
