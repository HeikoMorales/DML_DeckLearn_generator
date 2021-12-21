package model;

import java.time.LocalDate;

public class Training_session {

	int training_sessionId, trainingId;
	LocalDate date;

	public Training_session(int training_sessionId, int trainingId, LocalDate date) {
		this.training_sessionId = training_sessionId;
		this.trainingId = trainingId;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Training_session [training_sessionId=" + training_sessionId + ", trainingId=" + trainingId + ", date="
				+ date.getYear() + "/" + date.getMonthValue() + "/" + date.getDayOfMonth() + "]";
	}

}
