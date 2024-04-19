package MapConcept;

import java.util.HashMap;

public class UserRole {
	
	
	public void dologin(String un, String pwd) {
		
		System.out.println("un"+un +""+pwd+"");
		
	}
	
	public String getUserCreds(String role) {
		HashMap <String, String> UserMap =new HashMap<String, String>();
		UserMap.put("admin", "admin:admin123");
		UserMap.put("seller", "seller:admin123");
		UserMap.put("user", "user:admin123");
		UserMap.put("vendor", "admin:admin123");
		return UserMap.get(role);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRole usr=new  UserRole();
		String role="user";
		String cred=usr.getUserCreds(role);
		System.out.println(cred);
		
		String creds[]=cred.split(":");
		String un =creds[0].trim();
		String pwd =creds[1].trim();
		
		
	}

}
