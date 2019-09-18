import java.util.ArrayList;

public class customer {
	String custname, address;
	static ArrayList<orders> orders = new ArrayList<orders>();
	static ArrayList<customer> customer  = new ArrayList<customer>();
	public customer(String cname, String address) {
		this.custname = cname;
		this.address = address;
	}
	public String getcustName() {
		return custname;
	}
	public String getcustAddress() {
		return address;
	}
	public void setName(String custname) {
		this.custname = custname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return("Customer Name : "+custname + " Address : " + address);
	}


}
