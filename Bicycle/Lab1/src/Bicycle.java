
public class Bicycle {

	//Attributes
	private int speed=(0-200);
	private String maker,type;
	
	//Constructor
	public Bicycle(int thespeed,String themaker,String thetype){
		this.speed = thespeed;
		this.maker = themaker;
		this.type=thetype;
	}
	// Getters
	public int getspeed() {
		return this.speed;
	}
	public String getmaker() {
		return this.maker;
	}
	
	public String gettype() {
	return this.type;
	}
	
	//Setters
	
	public void setspeed(int setspeed){
		this.speed = setspeed;}
	public void setmaker(String setmaker){
		this.maker = setmaker;}
	public void settype(String settype){
		this.type = settype;}
	
	//Functions
	
	public void go() {
		System.out.println("I am going as fast as i can");
	}
	public void go(int pedals) {
		System.out.println("I am going at "+pedals+" pedals per minute");
	}
	public String toString() {
	System.out.println("toString");
	return speed+" "+maker+" "+type;
	}
	void print() {
		System.out.println("Bicycle Speed is "+speed);
		System.out.println("Bicycle Maker is "+maker);
		System.out.println("Bicycle Type is "+type);
	}
}
