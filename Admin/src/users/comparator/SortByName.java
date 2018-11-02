package users.comparator;

import users.internal.User;
import java.util.Comparator;

//Dieser Code sortiert das Array bzw. die Users alphabetisch
public class SortByName implements Comparator<User> {
	public int compare(User u1, User u2) {
		return u1.getName().compareTo(u2.getName());
	}

}
