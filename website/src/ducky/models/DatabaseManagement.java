package ducky.models;

public class DatabaseManagement {
	public boolean checkUser(String username, String password) {
		//Voi DB: Tao query de check
		if(username.equals("Ducky") && password.equals("123456")) {
			return true;
		}else {
			return false;
		}
	}
}
