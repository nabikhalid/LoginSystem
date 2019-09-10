package LoginSys;

public class User {

	public String name;
	
	
	public String username;
	
	
	public String password;
	
	
	public User(String name, String username, String password) {
		this.name = name;
		
		this.username = username;
		
		this.password = password;
		
	}
	
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
}
