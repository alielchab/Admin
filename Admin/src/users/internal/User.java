package users.internal;

import java.util.Random;

public class User {
	private int myID;
	private String name;
	private String nationality;
	//private boolean gender;
	private String gender;
	
	public User(int myID, String name, String nationality, String gender) {
		this.setName(name);
		this.setMyID(myID);
		this.setGender(gender);
		this.setNationality(nationality);
	}
	
	public User(String name, String nationality, String gender) {

		//Random rand = new Random();

		//int randomNumber = rand.nextInt(50) + 1;

		this.setName(name);
		//this.myID = randomNumber;
		this.setGender(gender);
		this.setNationality(nationality);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMyID() {
		return myID;
	}

	public void setMyID(int myID) {
		this.myID = myID;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String toString() {
		return "User " + this.getMyID() + ": " + this.getName() + "," + this.getNationality() + " " + (this.isGender() == "m" ? "m" : "f") + "\n";
	}
	
}

