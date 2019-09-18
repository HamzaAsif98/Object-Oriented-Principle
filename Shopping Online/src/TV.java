import java.util.*;

public class TV extends product {
	String maker, type;
	int ssize;
	String threeD;
	
	public TV(String name, String desc, int price,String maker,String type,int size,String threeD) {
		super(name, desc, price);
		this.maker=maker;
		this.type=type;
		this.ssize=size;
		this.threeD=threeD;
	}
	public String getMaker() {
		return maker;
	}
	public String getType() {
		return type;
	}
	public int getssize() {
		return ssize;
	}
	public String get3d() {
		return threeD;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setssize(int ssize) {
		this.ssize = ssize;
	}
	
	public void set3d(String threed) {
		this.threeD = threed;
	}
	public void print() {
		super.print();
		System.out.println("Maker : "+maker+"\tType : "+type+"\tScreen Size : "+ssize+"inch\t 3D Capable : "+threeD);
	}
	public String toString() {
		print();
		return "";
	}

}
