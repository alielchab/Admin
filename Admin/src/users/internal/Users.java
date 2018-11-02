package users.internal;


import java.util.*;

public class Users {
	ArrayList<User> users;
	private int userID;
	
	public Users() {
		users = new ArrayList<>();
		userID = 0;
	}
	
	public String addUser(User u) {
		userID++;
		u.setMyID(userID);
		users.add(u);
		
		return "User " + u.getMyID() + ": " + u.getName() + "," + u.getNationality() + " " +(u.isGender() == "m" ? "m" : "f") + "\n";	
	}
	
	public String addUser(String name, String nationality, String gender) {
		userID++;
		User u = new User(userID, name, nationality, gender);
		users.add(u);
		
		return "User " + u.getMyID() + ": " + u.getName() + "," + u.getNationality() + " " +(u.isGender() == "m" ? "m" : "f") + "\n";	
	}
	
	public void DeleteByUserId(int userId) {
		int index = 0;
		for(User user : this.users) {
			
			if(user.getMyID() == userId) {
				this.users.remove(index);
				break;
			}
			index = index + 1;
		}
		
	}
	
	public ArrayList<User> getArray(){
		return users;
	}
	
	public String toString() {
		String reportStream = "";
		for(User u: users) {
			reportStream += u.toString();
		}
		return reportStream;
	}
}
