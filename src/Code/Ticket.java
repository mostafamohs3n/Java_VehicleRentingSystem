package Code;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.ElementListener;

import java.io.Serializable;
import java.util.List;

public class Ticket implements RecordData, Serializable, Element {

	private String EmailAddress;

	private String Name;

	private double totalPrice;

	private String orderDetails;

	public String getEmailAddress() {
	 	 return EmailAddress; 
	}

	public void setEmailAddress(String EmailAddress) { 
		 this.EmailAddress = EmailAddress; 
	}
	
	public String getName() {
	 	 return Name; 
	}
	
	public void setName(String Name) { 
		 this.Name = Name; 
	}
	
	public double getTotalPrice() {
	 	 return totalPrice; 
	}
	
	public void setTotalPrice(double totalPrice) { 
		 this.totalPrice = totalPrice; 
	}
	
	public String getOrderDetails() {
	 	 return orderDetails; 
	}
	
	public void setOrderDetails(String orderDetails) { 
		 this.orderDetails = orderDetails; 
	}
	
	public boolean appendFileData() {
		return true; 
		// TODO Auto-generated method
	 }
	
	public void loadFileData() { 
		// TODO Auto-generated method
	 }

    @Override
    public boolean process(ElementListener elementListener) {
        return false;
    }

    @Override
    public int type() {
        return 0;
    }

    @Override
    public boolean isContent() {
        return false;
    }

    @Override
    public boolean isNestable() {
        return false;
    }

    @Override
    public List<Chunk> getChunks() {
        return null;
    }
}