package LoginSys;

public class UserDatabase {

	
	public int numberOfUsers = 0;
	
	public static int maxNumberOfUsers = 100;
	
	public User[] tempDatabase = new User[maxNumberOfUsers];
	
	public User[] database = new User [numberOfUsers];
	
	public UserDatabase() {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public boolean LoginCheck(String username, String password) {
		
		boolean userFound = false;
		
		for(int i = 0; i < database.length && !userFound; i++) {
			
			if(database[i].getUsername().equals(username) && database[i].getPassword().equals(password)) {
				userFound = true;
			}
			
		}
		
		return userFound;
	}
	
	
	public void addUser(User user) {
		
		this.tempDatabase[numberOfUsers] = user;
		
		this.numberOfUsers++;
		
		this.database = new User [numberOfUsers];
		
		for(int i = 0; i < database.length; i++) {
			this.database[i] = this.tempDatabase[i];
		}
		
		
	}
	
	
}
