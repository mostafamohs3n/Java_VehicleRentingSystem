package Code;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileManager implements Serializable {

	public boolean WriteToFile(Object obj, String FileName) {
		try {
			File file = new File(FileName);
			file.createNewFile();
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file));
			writer.writeObject(obj);
			writer.close();
			return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	 }

	public Object ReadFromFile(String FileName) {
		Object res = null;
		try {
			File file = new File(FileName);
			file.createNewFile();
		 	ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
			res = reader.readObject();
			reader.close();
		}catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
		return  res;
	 } 

}