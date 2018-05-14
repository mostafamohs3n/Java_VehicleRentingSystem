package Code;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Admin extends Auth implements Serializable, RecordData {


	private FileManager FM = new FileManager();

	public static final String FILEADMIN = "Admins.bin";
	private ArrayList <Admin> Admins = new ArrayList <Admin>();
	/*Main Constructor*/
	public Admin(String name, String username, String password,char Gender, String Phone,String address, Date BD) {
		this.Name = name;
		this.Username = username;
		this.Password = password;
		this.gender = Gender;
		this.PhoneNo = Phone;
		this.Address = address;
		this.BirthDate = BD;
	}

	public Admin() {
		
	}
	public Employee getEmployee(String username) {
	 	 Employee e = new Employee();
	 	 return e.getEmployee(username);
	}
	
	public void setEmployee(String username, Employee employee) { 
		Employee e = new Employee();
		e.updateEmployee(username, employee);
	}
	
	public Vehicle getVehicle(int ID) {
	 	 Vehicle v = new Vehicle();
	 	 return v.getVehicle(ID);
	}
	
	public boolean updateVehicle(int ID, Vehicle v) { 
		 return v.updateVehicle(ID, v);
	}

	public boolean updateCompanyBrand(String Name, CarBrand companybrand) {
		CarBrand c = new CarBrand();
		return c.UpdateCarBrand(Name, companybrand);
	 }
	
	public boolean deleteVehicle(int ID) { 
		Vehicle v = new Vehicle();
		return v.deleteVehicle(ID);
	 }
	
	public boolean addNewEmployee(String name, String username, String password,char gender, String  qualification,String address, Date joindate,String phone, Date birthdate) {
		Employee e = new Employee(name, username, password, gender, qualification,address, joindate,phone, birthdate);
		return e.addEmployee();
	 }
	
	public Admin getAdmin(String username) { 
		loadFileData();
		int Index = getAdminIndex(username);
		if(Index != -1) {
			return Admins.get(Index);
		}
		return null;
	 }
	
	public boolean deleteCompanyBrand(String Name) {
		CarBrand c = new CarBrand();
		return c.DeleteCarBrand(Name);
	 }
	@Override
	public String toString() {
		return (String.format("%s %s %s %c %s %s", this.Name, this.Username, this.Password, this.gender, this.PhoneNo, this.Address));
	}
	
	public boolean updateEmployee(String username,Employee e ) { 
		return e.updateEmployee(username, e);
	 }
	
	
	public boolean deleteEmployee(String username) { 
		Employee e = new Employee();
		return e.deleteEmployee(username);
	 }
	
	public boolean addVehicle(int ID, String carmodel, CarBrand carbrand, int makeyear, String carusage, int sitcapacity, int enginecapacity, String cartype, String carvariant, double rentValue, boolean isrented) {
		Vehicle v = new Vehicle(ID, carmodel, carbrand, makeyear, carusage, sitcapacity, enginecapacity, cartype, carvariant, rentValue, isrented);
		return v.addVehicle();
	 }
	
	public ArrayList <Employee> getAllEmployees() { 
		Employee e = new Employee();
		return e.listAllEmployees();
	 }
	
	public boolean addCompanyBrand(String Name, String Desc) {
		CarBrand c = new CarBrand(Desc, Desc);
		return c.AddCarBrand();
	 }
	public CarBrand getCarBrand(String Name){
		return (new CarBrand().getCarBrand(Name));
	}
	public boolean updateAdmin(String username, Admin admin) { 
		int Index = getAdminIndex(username);
		if(Index != -1) {
			Admins.set(Index, admin);
			return appendFileData();
		}
		return false;
	 }

	public boolean addAdmin() { 
		int Index = getAdminIndex(this.Username);
		if(Index == -1) {
			Admins.add(this);
			return appendFileData();
		}
		return false;
	 }
	
	public boolean deleteAdmin(String username) { 
		int Index = getAdminIndex(username);
		if(Index != -1) {
			Admins.remove(Index);
			return appendFileData();
		}
		return false;
	 }
	public int getAdminIndex(String username) {
		loadFileData();
		for(int i=0;i<Admins.size();i++) {
			if(Admins.get(i).getUsername().equals(username)){
				return i;
			}
		}
		return -1;
	}
	public boolean appendFileData() { 
		return FM.WriteToFile(Admins, FILEADMIN);
	 }
	
	public void loadFileData(){
		if(FM.ReadFromFile(FILEADMIN) != null) {
			Admins = (ArrayList <Admin>) FM.ReadFromFile(FILEADMIN);
		}
	 }

	public static String getFILEADMIN() {
		return FILEADMIN;
	}
}