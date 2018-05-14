package Code;
import java.io.Serializable;
import java.util.Date;

public abstract class Person implements Serializable {

	protected String Name;
	
	protected String Address;

	protected Date BirthDate;

	protected String PhoneNo;

	protected char gender;

	public String getAddress() {
	 	 return Address; 
	}
	public void setAddress(String Address) { 
		 this.Address = Address; 
	}
	
	public String getName() {
	 	 return Name; 
	}
	public void setName(String Name) { 
		 this.Name = Name; 
	}
	
	public Date getBirthDate() {
	 	 return BirthDate; 
	}
	public void setBirthDate(Date BirthDate) { 
		 this.BirthDate = BirthDate; 
	}
	
	public String getPhoneNo() {
	 	 return PhoneNo; 
	}
	public void setPhoneNo(String PhoneNo) { 
		 this.PhoneNo = PhoneNo; 
	}
	
	public char getGender() {
	 	 return gender; 
	}
	public void setGender(char gender) { 
		 this.gender = gender; 
	} 

}