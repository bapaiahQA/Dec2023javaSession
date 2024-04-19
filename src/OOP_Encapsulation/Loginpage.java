package OOP_Encapsulation;

public class Loginpage {

	private String username;
	private String password;
	
	public Loginpage(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		System.out.println(username);
		return username;
		
	}

	public void setUsername(String username) {
		this.username = username;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin() {
		if(isvaliduser(username)){
		System.out.println("enter unm" + username);
		System.out.println("enter pwd " + password);
		System.out.println("user logged in");
		}
	}

	public boolean isvaliduser(String username) {
		System.out.println("check is user is valida or not");
		if (username.length() > 3) {
			System.out.println("user name is corect");
			return true;
		} else {
			System.out.println("user name is not correct");
			return false;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
