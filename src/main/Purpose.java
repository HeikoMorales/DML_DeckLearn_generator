package main;

public class Purpose {

	int purposeId;
	String description;
	
	public Purpose(int purposeId, String description) {
		this.purposeId = purposeId;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Purpose [purposeId=" + purposeId + ", description=" + description + "]";
	}
	
}
