
public class phone extends product {

	String make;
	String model;
	 int storage;
	
	public phone(String name, String desc, int price,String make,String model,int Storage) {
		super(name, desc, price);
		this.make=make;
		this.model=model;
		this.storage=Storage;
		
	}
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}

	public int getstorage() {
		return storage;
	}
	
	public void setmake(String make) {
		this.make = make;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public void setstorage(int storage) {
		this.storage = storage;
	}
	public void print() {
		super.print();
		System.out.println("Make : "+make+"\tModel : "+model+"\tStorage : "+storage+"gb");
	}
	public String toString() {
		print();
		return "";
	}
	

}
