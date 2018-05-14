package Code;

import java.util.ArrayList;

interface RecordData {

	
	ArrayList<Object> ObjectList =new ArrayList<Object>();
	FileManager FM = new FileManager();

	boolean appendFileData();

	
	void loadFileData(); 

}