import java.util.ArrayList;

public class Cars {

	private String Make,Model,description;
	private int caryear,price;

	
	
public Cars(String themake,String themodel,int thecaryear,int theprice,String thedes){
		this.Make = themake;
		this.Model = themodel;
		this.caryear=thecaryear;
		this.price=theprice;
		this.description=thedes;
		
	}
public String getmake() {
return this.Make;
}
public String getmodel() {
return this.Model;
}
public int getcaryear() {
return this.caryear;
}
public int getprice() {
return this.price;
}
public String getdes() {
return this.description;
}


public String setmake() {
return this.Make;
}
public String setmodel() {
return this.Model;
}
public int setcaryear() {
return this.caryear;
}
public String setdesc() {
return this.description;
}
public int setprice() {
return this.price;
}
public  void Print()
{	int year;
year=2018-caryear;
	System.out.println("Make = "+Make+"\nModel = "+Model+
			"\nCarYear = "+caryear+
			"\nPrice = "+price);
			System.out.println(Make+" "+Model+" is "+year+" year old and is "
			+description+".\n");
		
		
	
	}
}
