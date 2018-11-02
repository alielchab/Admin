package users.internal;

import java.util.*;

import users.internal.Users;
import users.comparator.SortByName;
import users.internal.User;

public class Demo {

    public ArrayList<User> UsersList = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    //Rechnungs Variabeln
    public int amount = 0;
    public String gender;
    public int id = 1;
    public String answer;
    public String eingabe;
    public String pwEingabe;
    public String usernameEingabe;
    //Login 
    public String username = "Admin";
    public String password = "A8718L";
    private String Username = "Employee";
    private String Password = "1234";
    
    public Demo() {

        //Beginn des Programmes

        System.out.println("+++++++++++++++++++++");
        System.out.println("++  Administrator  ++");
        System.out.println("+++++++++++++++++++++");


        //Eingabe des Users
        String pwEingabe;
        String usernameEingabe;

        //Wenn richige Benutzername 
        UserLogin();

    }

    public void startApp() {
    	
    	CreateUser();

        //User werden nach Wahl gelöscht 
        // y = Ja, n = Nein


    }
    
    public void AskRemove() {
    	//Wenn man keine Users löschen möchte, dann überspringt es diese Methode
    	 System.out.println("Möchten sie Users löschen (y/n): ");
         eingabe = sc.next();
         if (eingabe.equals("y")) {
             System.out.println("Alle User löschen (y/n): ");
             eingabe = sc.next();
             if(eingabe.equals("y")) {
                 UsersList.clear();
                 System.out.println(UsersList);
                 System.out.println("");
                 startApp();
             } else if(eingabe.equals("n")) {
                 AnswerRemove();
               
             }
         } else if (eingabe.equals("n")) {
             UserAnswer();
         } else {
        	 //Funktion wird abgebrochen
             System.out.println("Ungültige eingabe DeleteAdmin beendet....");
             UserAnswer();
         }

    }

    public void DeleteByUserId(int userId ) {
        int index = 0;
        for (User user : UsersList) {
            if(user.getMyID() == userId) {
                UsersList.remove(index);
                break;
            }
            index = index + 1;
        }
        
        
    }

    public  void AnswerRemove() {
    	//Hier werden einzelne erstellte Users gelöscht
        System.out.println("Anzahl User Löschen: ");
        UserAmmount();
        if(amount == UsersList.size()) {
        	//Hier wird die Liste leer
            System.out.println("Möchten sie wirklich alle Users löschen (y/n): ");
            eingabe = sc.next();
            if (eingabe.equals("y")) {
            	UsersList.clear();
            	System.out.println(UsersList);
            } else if(eingabe.equals("n")) {
            	AnswerRemove();
            }
        }else if(amount >= UsersList.size()) {
            System.out.println("Entspricht nicht Menge UsersList");
            System.out.println(UsersList.size());
            System.out.println("");
            System.out.println(UsersList);
            AnswerRemove();
        } else if (UsersList.size() == 0) {
        	System.out.println("Liste ist Leer: ");
        	startApp();
        
        }	else {
        	
            for (int i = 0; i < amount; i++) {
           	System.out.println("User Id eingeben: ");
            	UserId();
            	
            		System.out.println(UsersList);
            
            	
            }
            System.out.println("Möchten sie weitere Users löschen (y/n): ");
        	eingabe = sc.next();
        	if(eingabe.equals("y")) {
        		AnswerRemove();
        	} else if(eingabe.equals("n")) {
        		CreateUser();
        		
        	} 
        	
        }
        	}
        
    

    public  void UserId() {
    	
        try {
            sc = new Scanner(System.in);
            int tempId = sc.nextInt();
            DeleteByUserId(tempId);
        }catch(Exception e) {
            System.out.println("Bitte eine Zahl eingeben: ");
            UserId();
        }
    }

    public  void UserAnswer() {

        //Abfragung ob man weiter machen will oder abrechen 
        // Man darf nur y/n einschreiben, wenn etwas anderes eingeschrieben wird, wird es Automatisch beendet
      System.out.println("Weitere Users erstellen (y/n): ");
        answer = sc.next();

        if (answer.equals("y") && UsersList.size() > 0) {
            startApp();
        }else if(answer.equals("n")) {
            System.out.println("Goodbye");
            UserLogin();
        }else {
            System.out.println("Es wurde keine gültige Antwort gegeben. Administration Beenden...");
        }
    }

    public  void UserGender() {
        try {
            gender = sc.next();

            if(!gender.equals("m") && !gender.equals("f")) {
                System.out.println("Bitte geben sie entweder 'm' oder 'f' ");
                UserGender();
            }
        } catch (Exception e) {
            System.out.println("Bitte geben sie entweder 'm' oder 'f' ");
            UserGender();
        }
    }

    public  void UserAmmount() {
    	//Hier wird die Eingabe wiederholt, bis man eine Zahl eingegeben hat
        try {
            sc = new Scanner(System.in);
            amount = sc.nextInt();

        } catch (Exception e) {
            System.out.println("BItte eine Nummer eingeben: ");
            UserAmmount();
        }
    }

    public  void seeUsersList() {
    	//Diese Methode ist nur damit man die Liste sehen kann
    	//ohne User zu erstellen oder löschen 
        System.out.println(UsersList);

        System.out.println("Abmelden (y/n) :");
        eingabe = sc.next();
        if(eingabe.equals("y")) {
            System.out.println("Goodbye");
            UserLogin();
        } else if(eingabe.equals("n")) {
                startApp();
            } else {
                System.out.println("Es wurde keine gültige eingabe eingegeben. Beenden...");
            }
        }
    

    public  void UserLogin() {
    	//Hier kann sich der Admin oder der Employee anmelden
    	 while (true) {
             System.out.println("Benutzername: ");
             usernameEingabe = sc.next();
             System.out.println("Password: ");
             pwEingabe = sc.next();
             //Das Login wird überfrüft
             if (usernameEingabe.equals(username) && pwEingabe.equals(password)) {
             	System.out.println("Willkommen " + username);
                 break;
                 //Das Login wird ebenfalls überprüft
             }else if(usernameEingabe.equals(Username) && pwEingabe.equals(Password)) {
             	System.out.println("Willkommen " + Username);
             	if(UsersList.size() <= 1) {
             	System.out.println("Users erstellen (y/n): ");
             	eingabe = sc.next();
             	if(eingabe.equals("y")) {
             		CreateUser();
             	} else if(eingabe.equals("n")) {
             		seeUsersList();
             		User();
             	}
             } else  {
            	 User();
             }
             	
                 
             }
             else {
                 System.out.println("Falsche Anmeldeinformation");
                 continue;
             }

         }
         startApp();

    }
    //Users werden erstellt 
    public  void User() {
    	// Liste aller erstellten Users in der Klasse User, Users

        // Users werden erstellt aus klasse Users und User 
    	

        String reportStream = "";

        Users users = new Users();
        User u;

        String name;
        String nationality;
        
        System.out.println("Anzahl Users erstellen: ");
        UserAmmount();
        
    	//Users werden erstellt und deren geschlechter und Nationalität
        for (int i = 0; i < amount; i++) {
            System.out.println("Username eingeben: ");
            name = sc.next();
            System.out.println("Nationalität eingeben: ");
            nationality = sc.next();
            System.out.println("User geschlecht eingeben (m/f): ");
            //In dieser Methode wird gesehen ob man m oder f eingegeben hat, wenn nicht soll der Vorgang wiederholt werden
            UserGender();
           
            //Hier wird aus (1 oder 0) (m oder f)
            u = new User(id, name, nationality, (gender.equals("m") ? "m" : "f"));
            id = id + 1;
            reportStream += UsersList.add(u);
            
        }

        //User werden zurück gegeben 
        System.out.println("Liste wird erstellt....");
        System.out.println();
        System.out.println("Liste erstellt");
        reportStream = "";

        //User werden Alphabetisch eingeordnet
        System.out.println("Alphabetisch geordnete Users!");
        Collections.sort(UsersList, new SortByName());
        System.out.println(UsersList.toString());
    }
    
    
    public  void CreateUser() {
    	
        //Wenn die Eingabe am Schluss 'y' ist, dann kann man mehrere Users erstellen

        //Anzahl der Users eingeben
        if (UsersList.size() == 0) {
        	// Users sind in der List
        	// Gebe nur Liste zurück
        	System.out.println("UsersList wird zurück gegeben...");
        	System.out.println(UsersList);
        	User();
        	AskRemove();
    		
    			
        } else {
        	// 1 oder x Users sind in der Liste
        	// Liste zurückgeben
        	System.out.println("UsersList wird zurück gegeben...");
        	System.out.println(UsersList);
        	
        	// Users löschen oder erstellen - Frage
        	System.out.println("Möchten sie weitere Users erstellen (y/n): ");
        	eingabe = sc.next();
        	if(eingabe.equals("y")) {
        		User();
        		
        			AskRemove();
        			
        		} else if(eingabe.equals("n")) {
        			UserLogin();
        		}
        	}
        }
        
        

        
    

    

}
