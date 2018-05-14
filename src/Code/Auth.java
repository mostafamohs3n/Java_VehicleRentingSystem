package Code;
import java.io.Serializable;
import java.util.ArrayList;

public class Auth extends Person implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4367290369152503410L;

	protected String Username;
	
	protected String Password;


	public boolean Login(boolean isAdmin, String user, String pw) {
		Admin a = new Admin().getAdmin(user);
		Employee e = new Employee().getEmployee(user);
		boolean isLogged=false;
		if(isAdmin) {
			if (a != null && a.getUsername().equals(user) && a.getPassword().equals(pw)) {
				isLogged = true;
			}
		}else {
			if (e != null && e.getUsername().equals(user) && e.getPassword().equals(pw)) {
				isLogged = true;
			}
		}
		return isLogged;
	} 
	
	public String getPassword() {
	 	 return Password; 
	}

	public void setPassword(String Password) { 
		 this.Password = Password; 
	}

	
	public String getUsername() {
	 	 return Username; 
	}

	public void setUsername(String Username) { 
		 this.Username = Username; 
	}

	
	public ArrayList <Driver> viewDrivers() {
		return new Driver().viewDrivers();
	}
	

}