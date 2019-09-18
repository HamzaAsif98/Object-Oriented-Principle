public class Bicycle {
	private int speed=(0-200);
	private String maker,type;
	
	//Constructor
	public Bicycle(int thespeed,String themaker,String thetype){
		this.speed = thespeed;
		this.maker = themaker;
		this.type=thetype;
	}	
	//Setters
	
	public void setSpeed(int setspeed){
		this.speed = setspeed;}
	public void setMaker(String setmaker){
		this.maker = setmaker;}
	public void setType(String settype){
		this.type = settype;}
	
	
	void print() {
		System.out.println("Bicycle Speed is "+speed);
		System.out.println("Bicycle Maker is "+maker);
		System.out.println("Bicycle Type is "+type);
	}
}
