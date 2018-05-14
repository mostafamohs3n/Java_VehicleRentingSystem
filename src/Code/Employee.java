package Code;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Auth implements RecordData, Serializable {

	private String Qualification;
	public Driver driver;
	public Customer customer;
	public static final String FILEEMPLOYEE = "Employees.bin";
	private ArrayList <Employee> Employees = new ArrayList <Employee>();
	public FileManager FM = new FileManager();
	private Date JoinDate;

	@Override
	public Date getBirthDate() {
		return BirthDate;
	}

	@Override
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	private Date BirthDate;

	public Employee() {
		
	}
	
	public Employee(String name, String username, String password,char gender, String  qualification,String address, Date joindate,String phone, Date birthdate) {
		this.Name = name;
		this.Username = username;
		this.Password = password;
		this.gender=gender;
		this.Qualification = qualification;
		this.Address = address;
		this.JoinDate = joindate;
		this.BirthDate = birthdate;
		this.PhoneNo = phone;
	}
	
	public String getQualification() {
	 	 return Qualification;
	 	
	}
	
	public void setQualification(String Qualification) {
		 this.Qualification = Qualification; 
	}
	

	
	public Date getJoinDate() {
	 	 return JoinDate; 
	}
	
	public void setJoinDate(Date JoinDate) { 
		 this.JoinDate = JoinDate; 
	}
	public Driver searchDriver(int ID) {
		Driver driver = new Driver();
	 	 return driver.getDriver(ID);
	}

	public ArrayList<Customer> getCustomers(){
		Customer customer = new Customer();
		return customer.getCustomers();
	}
	//***///
	public ArrayList <Vehicle> getCarsCustomer(CarBrand carbrand, int settingcapacity) {
		Vehicle v = new Vehicle();
		return v.getSelectedCars(carbrand, settingcapacity);
	}



	public Customer searchCustomer(int ID) {
	 	 Customer customer = new Customer();
	 	 return customer.getCustomer(ID);
	}
	public boolean deleteDriver(int ID) { 
		Driver driver = new Driver();
		return driver.deleteDriver(ID);
	 }
	public int getEmployeeIndex(String username) {
		loadFileData();
		for(int i=0;i<Employees.size();i++)
			if(Employees.get(i).Username.equalsIgnoreCase(username))return i;
		return -1;
	}
	public boolean updateEmployee(String username, Employee e) { 
		int Index = getEmployeeIndex(username);
		if(Index != -1) {
			Employees.set(Index, e);
			return appendFileData();
		}
		return false;
	 }
	
	public boolean deleteEmployee(String username) { 
		int Index = getEmployeeIndex(username);
		if(Index != -1) {
			Employees.remove(Index);
			return appendFileData();
		}
		return false;
	 }
	
	public boolean updateCustomer(int ID, Customer c) {
		return c.updateCustomer(ID, c);
	 }
	
	public boolean addEmployee() {
		int Index = getEmployeeIndex(this.Username);
		if(Index == -1) {
			Employees.add(this);
			return appendFileData();
		}
		return false;
	 }
	
	public ArrayList <Vehicle> getCars(CarBrand carbrand, String carusage, boolean isRented) {
		Vehicle v = new Vehicle();
		return v.getSelectedVehicles(carbrand, carusage, isRented);
	 }
	
	public boolean deleteCustomer(int ID) {
		Customer c = new Customer();
		return c.deleteCustomer(ID);
	 }
	
	public Vehicle getCustomerCar(int ID) { 
		Customer c = new Customer();
		return c.getCustomer(ID).getRentedCar();
	 }
	
	public Vehicle getCustomerCar(String name) { 
		Customer c = new Customer();
		return c.getCustomer(name).getRentedCar();
	 }
	
	public boolean updateDriver(int ID, Driver driver) { 
		return driver.updateDriver(ID, driver);
	 }
	
	public boolean addNewCustomer(int ID, String name,char gender, String address, Date BD, String phone,String carusage, int rentdays, Date bookdate) {
		Customer c = new Customer(ID, name, gender, address, BD, phone, carusage, rentdays,bookdate);
		return c.addCustomer();
	 }
	public Driver getDriver(int ID) { 
		Driver d = new Driver();
		return d.getDriver(ID);
	 }
	 public ArrayList<Driver> getDrivers(){
		return new Driver().getDrivers();
	 }
	public Customer getCustomer(int ID) { 
		Customer c = new Customer();
		return c.getCustomer(ID);
	 }
	
	public Employee getEmployee(String username) { 
		int Index = getEmployeeIndex(username);
		if(Index != -1) {
			return Employees.get(Index);
		}
		return null;
	 }

	 public ArrayList<Employee> getEmployees(){
		loadFileData();
		return Employees;
	 }
	public boolean addNewDriver(int id, String name, char gender, String address, Date birthdate,String phone, String experience, String photo, CarBrand carbrand, int sitcapacity) { 
		Driver d = new Driver(id, name, gender, address, birthdate, phone, experience, photo, carbrand, sitcapacity );
		return d.addDriver();
	 }
	public ArrayList <Employee> listAllEmployees(){
		return Employees;
	}
	public void generateTicket() { 
		// TODO Auto-generated method
	 }
	
	public boolean appendFileData() { 
		return FM.WriteToFile(Employees, FILEEMPLOYEE);
	 }
	
	public void loadFileData() { 
		if(FM.ReadFromFile(FILEEMPLOYEE) != null) {
			Employees =(ArrayList <Employee>) FM.ReadFromFile(FILEEMPLOYEE);
		}
	 } 

}