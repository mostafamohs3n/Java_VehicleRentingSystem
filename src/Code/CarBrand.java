package Code;
import java.io.Serializable;
import java.util.ArrayList;

public class CarBrand implements RecordData, Serializable {

	protected String Name;

	protected String Desc;

	public static final String FILECARBRAND = "CarBrands.bin";
	private ArrayList<CarBrand> CarBrands = new ArrayList<CarBrand>();
	private FileManager FM = new FileManager();
	public CarBrand() {
		
	}
	public CarBrand(String Name, String Desc) {
		this.Name = Name;
		this.Desc = Desc;
		
	}
	public boolean AddCarBrand() {
		if(getCarBrandIndex(this.Name) == -1) {
			CarBrands.add(this);
			return appendFileData();
		}
		return false;
	}
	public boolean DeleteCarBrand(String Name) {
		int Index = getCarBrandIndex(Name);
		if(Index != -1) {
			CarBrands.remove(Index);
			return appendFileData();
		}
		return false;
	}
	public boolean UpdateCarBrand(String Name, CarBrand newObj) {
		int Index = getCarBrandIndex(Name);
		if(Index != -1) {
			CarBrands.set(Index, newObj);
			return appendFileData();
		}
		return false;
	}
	public CarBrand getCarBrand(String Name) {
		int Index = getCarBrandIndex(Name);
		if(Index != -1) {
			return CarBrands.get(Index);
			
		}
		return null;
	}
	public ArrayList<CarBrand> getCarBrands(){
		loadFileData();
		return CarBrands;
	}
	public int getCarBrandIndex(String Name) {
		loadFileData();
		for(int i=0;i<CarBrands.size();i++) {
			if(CarBrands.get(i).Name.equals(Name)) {return i;}
		}
		return -1;
	}
	@Override
	public boolean appendFileData() {
		return FM.WriteToFile(CarBrands, FILECARBRAND);
		
	}
	@Override
	public void loadFileData() {
		if(FM.ReadFromFile(FILECARBRAND) != null)
			CarBrands = (ArrayList<CarBrand>) FM.ReadFromFile(FILECARBRAND);
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}


	public String getDesc() {
		return Desc;
	}
	public void setDesc(String Desc) {
		this.Desc = Desc;
	}

}