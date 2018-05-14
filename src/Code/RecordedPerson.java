package Code;
import java.io.Serializable;

public class RecordedPerson extends Person implements Serializable {

	/**
	 * 
	 */
	protected int ID;

	/**
	 * Getter of ID
	 */
	public int getID() {
	 	 return ID; 
	}

	/**
	 * Setter of ID
	 */
	public void setID(int ID) { 
		 this.ID = ID; 
	} 

}