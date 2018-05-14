package Code;
import java.io.Serializable;
import java.util.ArrayList;

public class Vehicle implements RecordData, Serializable {

	private int EngineCapacity;
	private String FILEVEHICLE = "Vehicles.bin";
	private int carID;
	private String carModel;
	private int SitCapacity;
	private FileManager FM = new FileManager();
	private int makeYear;
	private boolean isRented=false;
	private CarBrand carBrand;
	private double rentValue;
	private String carUsage;
	private String carType;
	private String carVariant;
	private ArrayList <Vehicle> Vehicles = new ArrayList<Vehicle>();
	public Vehicle() {
		
	}
	public Vehicle(int ID, String carmodel, CarBrand carbrand, int makeyear, String carusage, int sitcapacity, int enginecapacity, String cartype, String carvariant, double rentValue, boolean isrented) {
		this.carID = ID;
		this.carModel = carmodel;
		this.makeYear = makeyear;
		this.carUsage = carusage;
		this.SitCapacity = sitcapacity;
		this.EngineCapacity = enginecapacity;
		this.carType = cartype;
		this.carVariant = carvariant;
		this.rentValue = rentValue;
		this.isRented = isrented;
		this.carBrand = carbrand;
	}
	public int getEngineCapacity() {
	 	 return EngineCapacity; 
	}
	public void setEngineCapacity(int EngineCapacity) { 
		 this.EngineCapacity = EngineCapacity; 
	}
	public int getCarID() {
	 	 return carID; 
	}
	
	public void setCarID(int carID) { 
		 this.carID = carID; 
	}
	
	public String getCarType() {
	 	 return carType; 
	}
	
	public void setCarType(String carType) {
		 this.carType = carType; 
	}
	
	public String getCarModel() {
	 	 return carModel; 
	}
	
	public void setCarModel(String carModel) { 
		 this.carModel = carModel; 
	}
	
	public int getSitCapacity() {
	 	 return SitCapacity; 
	}
	
	public void setSitCapacity(int SitCapacity) { 
		 this.SitCapacity = SitCapacity; 
	}
	
	public int getMakeYear() {
	 	 return makeYear; 
	}
	
	public void setMakeYear(int makeYear) { 
		 this.makeYear = makeYear; 
	}
	
	public boolean getIsRented() {
	 	 return isRented; 
	}
	
	public void setIsRented(boolean isRented) { 
		 this.isRented = isRented; 
	}
	
	public CarBrand getCarBrand() {
	 	 return carBrand; 
	}
	
	public void setCarBrand(CarBrand carBrand) { 
		 this.carBrand = carBrand; 
	}
	
	public String getCarUsage() {
	 	 return carUsage; 
	}
	
	public void setCarUsage(String carUsage) {
		 this.carUsage = carUsage; 
	}
	
	public double getRentValue() {
	 	 return rentValue; 
	}
	
	public void setRentValue(double rentValue) { 
		 this.rentValue = rentValue; 
	}
	
	public String getCarVariant() {
	 	 return carVariant; 
	}
	
	public void setCarVariant(String carVariant) {
		 this.carVariant = carVariant; 
	}
	
	public boolean deleteVehicle(int ID){ 
		int Index = getVehicleIndex(ID);
		if(Index != -1) {
			Vehicles.remove(Index);
			return appendFileData();
		}
		return false;
	 } 
	
	public Vehicle getVehicle(int ID) { 
		int Index = getVehicleIndex(ID);
		if(Index != -1) {
			return Vehicles.get(Index);
		}
		return null;
	 }



	public boolean addVehicle() {
		int Index = getVehicleIndex(this.carID);
		if(Index == -1) {
			Vehicles.add(this);
			return appendFileData();
		}
		return false;
		
	 }
	
	public boolean updateVehicle(int ID, Vehicle vehicle) { 
		int Index = getVehicleIndex(ID);
		if(Index != -1) {
			Vehicles.set(Index, vehicle);
			return appendFileData();
		}
		return false;
	}

	/*****/

	public ArrayList<Vehicle> getSelectedCars(CarBrand carbrand, int SitCapacity) {
		ArrayList <Vehicle> SelectedVehicles = new ArrayList <Vehicle>();
		loadFileData();
		for(int i=0;i<Vehicles.size();i++) {
			if(Vehicles.get(i).carBrand.getName().equalsIgnoreCase(carbrand.getName()) &&
					Vehicles.get(i).SitCapacity == SitCapacity ) {
				SelectedVehicles.add(Vehicles.get(i));
			}

		}
		return SelectedVehicles;
	}
	public ArrayList<Vehicle> getVehicles(){
		loadFileData();
		return Vehicles;
	}
	public ArrayList<Vehicle> getSelectedVehicles(CarBrand carbrand, String carusage, boolean isRented) {
		ArrayList <Vehicle> SelectedVehicles = new ArrayList <Vehicle>();
		loadFileData();
		for(int i=0;i<Vehicles.size();i++) {
			if(Vehicles.get(i).carBrand.getName().equalsIgnoreCase(carbrand.getName()) &&
				Vehicles.get(i).carUsage.equalsIgnoreCase(carusage) &&
				Vehicles.get(i).isRented == isRented) {
				SelectedVehicles.add(Vehicles.get(i));
			}
				
		}
		return SelectedVehicles;
	}
	public int getVehicleIndex(int ID) {
		loadFileData();
		for(int i=0;i<Vehicles.size();i++) {
			if(Vehicles.get(i).carID == ID)return i;
		}
		return -1;
	}
	public boolean appendFileData() { 
		
		return FM.WriteToFile(Vehicles, FILEVEHICLE);
	 }
	
	public void loadFileData() { 
		if(FM.ReadFromFile(FILEVEHICLE) != null) {
			Vehicles = (ArrayList <Vehicle>) FM.ReadFromFile(FILEVEHICLE);
		}
	 }
	 @Override
	public String toString(){
		return String.format("%s %s %s %s %s %s %s %s %s %s %s",carID, carModel, carBrand.getName(), makeYear, carUsage, SitCapacity, EngineCapacity, carType, carVariant, rentValue, isRented);
	 }
}
	
	
	