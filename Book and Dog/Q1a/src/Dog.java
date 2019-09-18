
import java.util.ArrayList;

public class Dog {
	private String Name;
	private int Age;
	private String Address;
	private ArrayList<fleas> m = new ArrayList<fleas>(20);
	
	public Dog()
	{
		this.Name = Name;
		this.Age = Age;
	}
	public void addingFleas(fleas flea) {
		
        this.m.add(flea);
    }

    public void listFleas() {
        for(fleas item : this.m) {
            System.out.println(item.getName()+ " " + item.getAge() + "\n");
            
        }
    }
	public void setName(String Name) {
		this.Name = Name;
	}
	public void setAge (int Age) {
		this.Age = Age;
	}
	 public void setAddress (String Address) {
         this.Address = Address;
 }

	public String getName () {
		return Name;
	}
	public int getAge () {
		return Age;
	}
	 public String getAddress () {
         return Address;
 }
	 public void print() {
		 System.out.println( Name + " " + Age + " " + Address);
	 }
	 
}
