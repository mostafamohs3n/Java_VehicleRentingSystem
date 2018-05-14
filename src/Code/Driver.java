package Code;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Driver extends RecordedPerson implements RecordData, Serializable {

	private String Photo;
	public FileManager FM = new FileManager();
	private String Experience;
	private int SitCapacity;
	private CarBrand CompanyBrand;
	private String FILEDRIVER = "Drivers.bin";
	private ArrayList<Driver> Drivers = new ArrayList<Driver>();
	private boolean isRented=false;
	
	public Driver() {
		
	}
	public Driver(int id, String name, char gender, String address, Date birthdate,String phone, String experience, String photo, CarBrand carbrand, int sitcapacity  ) {
		this.ID=id;
		this.Name=name;
		this.gender = gender;
		this.Address = address;
		this.BirthDate = birthdate;
		this.PhoneNo = phone;
		this.Experience = experience;
		this.Photo = photo;
		this.CompanyBrand = carbrand;
		this.SitCapacity = sitcapacity;
	}
	public Date getBirthDate() {
	 	 return BirthDate; 
	}
	public void setBirthDate(Date BirthDate) { 
		 this.BirthDate = BirthDate; 
	}
	
	public String getPhoto() {
	 	 return Photo; 
	}
	public void setPhoto(String Photo) { 
		 this.Photo = Photo; 
	}
	
	
	public String getExperience() {
	 	 return Experience; 
	}
	
	public void setExperience(String Experience) { 
		 this.Experience = Experience; 
	}
	
	public int getSitCapacity() {
	 	 return SitCapacity; 
	}
	
	public void setSitCapacity(int SitCapacity) { 
		 this.SitCapacity = SitCapacity; 
	}
	
	public CarBrand getCompanyBrand() {
	 	 return CompanyBrand; 
	}
	
	public void setCompanyBrand(CarBrand CompanyBrand) { 
		 this.CompanyBrand = CompanyBrand; 
	}

	public boolean getIsRented() {
		return isRented;
	}



	public boolean deleteDriver(int ID) { 
		int Index = getDriverIndex(ID);
		if(Index != -1) {
			Drivers.remove(Index);
			return appendFileData();
		}
		return false;
	 }
	
	public boolean updateDriver(int ID, Driver driver) { 
		int Index = getDriverIndex(ID);
		if(Index != -1) {
			Drivers.set(Index, driver);
			return appendFileData();
		}
		return false;
	 }
	
	public Driver getDriver(int ID) {
		int Index = getDriverIndex(ID);
		if(Index != -1) {
			return Drivers.get(Index);
		}
		return null;
	 }
	public ArrayList<Driver> getDrivers(){
		loadFileData();
		return Drivers;
	}
	public boolean addDriver() { 
		int Index = getDriverIndex(ID);
		if(Index == -1) {
			Drivers.add(this);
			return appendFileData();
		}
		return false;
	}
	public ArrayList <Driver> viewDrivers(){
		loadFileData();
		return Drivers;
	}
	public int getDriverIndex(int ID) {
		loadFileData();
		for(int i=0;i<Drivers.size();i++) {
			if(Drivers.get(i).ID == ID)return i;
		}
		return -1;
	}
	public boolean appendFileData() { 
		return FM.WriteToFile(Drivers, FILEDRIVER);
	 }
	
	public void loadFileData() { 
		if(FM.ReadFromFile(FILEDRIVER) != null) {
			Drivers = (ArrayList<Driver>) FM.ReadFromFile(FILEDRIVER);
		}
	 } 

}