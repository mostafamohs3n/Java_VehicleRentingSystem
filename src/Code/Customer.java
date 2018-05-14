package Code;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Customer extends RecordedPerson implements RecordData, Serializable {

	private double totalRent;

	private int rentingDaysNo;

	private final String FILECUSTOMER="Customers.bin";

	private String carUsage;

	private Date BookDate;
	public ArrayList<Customer> Customers =new ArrayList<Customer>();
	
	private FileManager FM = new FileManager();
	private Vehicle RentedCar = null;
	public Customer() {
		
	}
	
	public Customer(int ID, String name,char gender, String address, Date BD, String phone,String carusage, int rentdays, Date bookdate  ) {
		this.ID = ID;
		this.Name = name;
		this.gender = gender;
		this.Address = address;
		this.BirthDate = BD;
		this.PhoneNo = phone;
		this.carUsage = carusage;
		this.rentingDaysNo = rentdays;
		this.BookDate = bookdate;
	}
	
	public double getTotalRent() {
	 	 return totalRent; 
	}

	public void setTotalRent(double totalRent) { 
		 this.totalRent = totalRent; 
	}
	
	public int getRentingDaysNo() {
	 	 return rentingDaysNo; 
	}
	
	public void setRentingDaysNo(int rentingDaysNo) { 
		 this.rentingDaysNo = rentingDaysNo; 
	}
	
	public String getCarUsage() {
	 	 return carUsage; 
	}
	public void setCarUsage(String carUsage) {
		 this.carUsage = carUsage; 
	}
	public Date getBookDate() {
	 	 return BookDate; 
	}
	public void setBookDate(Date BookDate) { 
		 this.BookDate = BookDate; 
	}
	public boolean deleteCustomer(int ID) { 
		int Index = getCustomerIndex(ID);
		if(Index != -1) {
			Customers.remove(Index);
			return appendFileData();
		}
		return false;
	}
	public boolean updateCustomer(int ID, Customer customer) { 
		int Index = getCustomerIndex(ID);
		if(Index != -1) {
			Customers.set(Index, customer);
			return appendFileData();
		}
		return false;
		
	 }

	 public ArrayList<Customer> getCustomers(){
		loadFileData();
		return Customers;
	 }
	public Customer getCustomer(int ID) { 
		int Index = getCustomerIndex(ID);
		if(Index != -1) {
			return Customers.get(Index);
		}
		return null;
	}
	public Customer getCustomer(String Name) { 
		int Index = getCustomerIndex(Name);
		if(Index != -1) {
			return Customers.get(Index);
		}
		return null;
	}
	public int getCustomerIndex(String Name) {
		loadFileData();
		for(int i=0;i<Customers.size();i++) {
			if(Customers.get(i).Name.equalsIgnoreCase(Name)) {return i;}
		}
		return -1;
	}
	public int getCustomerIndex(int ID) {
		loadFileData();
		for(int i=0;i<Customers.size();i++) {
			if(Customers.get(i).ID == ID) {return i;}
		}
		return -1;
	}
	public boolean addCustomer() {
		if(getCustomerIndex(this.ID) == -1) {
			Customers.add(this);
			return appendFileData();
		}
		return false;
	 }

	 public boolean appendFileData() {
		return FM.WriteToFile(Customers, FILECUSTOMER);
	 }
	public void loadFileData() { 
		if(FM.ReadFromFile(FILECUSTOMER) != null) {
			Customers = (ArrayList<Customer>) FM.ReadFromFile(FILECUSTOMER);
		}
	}

	public Vehicle getRentedCar() {
		return RentedCar;
	}

	public void setRentedCar(Vehicle rentedCar) {
		RentedCar = rentedCar;
	} 

}