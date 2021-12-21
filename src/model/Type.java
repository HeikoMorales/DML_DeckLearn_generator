package model;

public class Type {

	int typeId;
	String description;

	public Type(int typeId, String description) {
		this.typeId = typeId;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", description=" + description + "]";
	}

}
