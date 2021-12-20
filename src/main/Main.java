package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Deck;
import model.User;

public class Main {
	List<String> usernameList, nameList, surnameList, passList, postalCodeList, countryList;
	List<Integer> ageList, usedHourList;
	
	List<String> descriptionList;
	
	List<String> descriptionDeckList;
	List<String> deck_nameList;
	
	List<User> userList;
	List<Purpose> PurposeList;
	List<Deck> deckList;
	
	
	public Main() {
		usernameList = new ArrayList<>();
		nameList = new ArrayList<>();
		surnameList = new ArrayList<>();
		passList = new ArrayList<>();
		postalCodeList = new ArrayList<>();
		countryList = new ArrayList<>();
		ageList = new ArrayList<>();
		usedHourList = new ArrayList<>();
		
		descriptionList = new ArrayList<>();
		
		descriptionDeckList = new ArrayList<>();
		deck_nameList = new ArrayList<>();
		
		userList = new ArrayList<>();
		PurposeList = new ArrayList<>();
		deckList = new ArrayList<>();
	}
	
	/*
	  * *************************
	  * 						*
	  * 	Generar usuarios	*
	  * 						*
	  ***************************
	  * */

	private void generateUsers() {
		loadUserFiles();
		createUsers();
		printUsers();
	}
	
	private void loadUserFiles() {
		usernameList = cargarFichero("nick.txt");
		cargarFicheroSplit("name_surname.txt");
		passList = cargarFichero("pass.txt");
		postalCodeList = cargarFichero("zip_code.txt");
		countryList = cargarFichero("countries.txt");
	}
	 
	 private List<String> cargarFichero(String path) {

		 	List<String> stringList = new ArrayList<>();
			String linea = null;

			try (BufferedReader in = new BufferedReader(new FileReader("ficheros/" + path))) {
				while ((linea = in.readLine()) != null) {
					
					if (linea != null) {
						stringList.add(linea);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return stringList;
		}
	 
	 private void cargarFicheroSplit(String path) {

			String line = null;

			try (BufferedReader in = new BufferedReader(new FileReader("ficheros/" + path))) {
				while ((line = in.readLine()) != null) {
					
					if (line != null) {
						String[] value = line.split("[ ]");
						nameList.add(value[0]);
						surnameList.add(value[1]);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 
	 private void createUsers() {
		
		 for (int i = 0; i < usernameList.size(); i++) {
			 
			 int age = (int) (10 + (Math.random() * 80));
			 double usedHour = (0 + (Math.random() * 1000)); 
			 
			 usedHour = (double)Math.round(usedHour * 100d) / 100d;
			 
			 User user = new User(i, usernameList.get(i), nameList.get(i), surnameList.get(i), passList.get(i),
					 postalCodeList.get(i), countryList.get(i), age, usedHour);
			 userList.add(user);
		}
	
	}
	 
	 private void printUsers() {
			for (User user : userList) {
				System.out.println(user.toString());
			}
			
		}
	
	 /*
	  * *************************
	  * 						*
	  * 	Generar Followers	*
	  * 						*
	  ***************************
	  * */
	 
	 private void generateFollowers() {
				 
		 for (int i = 0; i < userList.size(); i++) {
			 System.out.println("-------------------------------------");
			 System.out.println("userId: "+ i);
			 
			 int followerNum = (int) (0 + (Math.random() * 10));
			 
			 for (int j = 0; j < followerNum; j++) {
				 int id = (int) (0 + (Math.random() * userList.size()));
				 System.out.println("followerID: " + id);
			}
		 }
		 
	 }

	 /*
	  * *************************
	  * 						*
	  * 	Generar Purpose	*
	  * 						*
	  ***************************
	  * */
	 
	 private void generatePurpose() {
		 	loadPurposeFiles();
			createPurpose();
			printPurposes();
			
	}
	 
	 private void loadPurposeFiles() {
		descriptionList = cargarFichero("purposes.txt");
	}

	private void createPurpose() {

		for (int i = 0; i < descriptionList.size(); i++) {
			PurposeList.add(new Purpose(i, descriptionList.get(i)));
		}
		
	}

	private void printPurposes() {
			for (Purpose purpose : PurposeList) {
				System.out.println(purpose.toString());
			}
		}
	 
	 /*
	  * *************************
	  * 						*
	  *  Generar user Purposes	*
	  * 						*
	  ***************************
	  * */
	 
	private void generateUserPurpouse() {
		 for (int i = 0; i < userList.size(); i++) {
			 System.out.println("-------------------------------------");
			 System.out.println("userId: "+ i);
			 
			 int purposeNum = (int) (0 + (Math.random() * 3));
			 
			 for (int j = 0; j < purposeNum; j++) {
				 int id = (int) (0 + (Math.random() * PurposeList.size()));
				 System.out.println("PurposeId: " + id);
			}
		 }
	}
	
	 /*
	  * *************************
	  * 						*
	  *  Generar Decks	*
	  * 						*
	  ***************************
	  * */
	
	private void generateDecks() {
		loadDeckFiles();
		createDecks();
		printDecks();
		
	}

	private void loadDeckFiles() {
		descriptionDeckList = cargarFichero("descriptions.txt");
		deck_nameList = cargarFichero("deck_name.txt");
	}

	private void createDecks() {
		
		for (int i = 0; i < deck_nameList.size(); i++) {
			int creatorId = (int) (0 + (Math.random() * userList.size()));
			Deck deck = new Deck(i, creatorId ,deck_nameList.get(i), descriptionDeckList.get(i), "Path de la foto");
			deckList.add(deck);
		}
		
	}
	
	private void printDecks() {
		for (Deck deck : deckList) {
			System.out.println(deck.toString());
		}
	}

	 /*
	  * *************************
	  * 						*
	  *  Generar Cards	*
	  * 						*
	  ***************************
	  * */
	
	private void generateCards() {
		loadCardFiles();
		createCards();
		printCards();
	}
	
	public static void main(String[] args) {
			Main main = new Main();
			main.generateUsers();  					//user
			main.generateFollowers();				//followed	
			main.generatePurpose();					//Purpose
			main.generateUserPurpouse();			//Purpose_relation
			main.generateDecks();					//Decks
			main.generateCards();					//cards
	}

	

	
	
}
