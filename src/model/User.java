package model;


public class User {
	int userId;
	String username, name, surname, pass, postalCode, country;
	int age;
	double usedHour;

	public User(int userId, String username, String name, String surname, String pass, String postalCode,
			String country, int age, double usedHour) {

		this.userId = userId;
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.pass = pass;
		this.postalCode = postalCode;
		this.country = country;
		this.age = age;
		this.usedHour = usedHour;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", name=" + name + ", surname=" + surname
				+ ", pass=" + pass + ", postalCode=" + postalCode + ", country=" + country + ", age=" + age
				+ ", usedHour=" + usedHour + "]";
	}

	

}
