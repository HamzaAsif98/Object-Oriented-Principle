import java.util.*;
public class product {
String pname,pdesc;
int price;
int productid;
static int counter;

public product(String name,String desc,int price) {
	
	this.pname=name;
	this.pdesc=desc;
	this.price=price;
	setproductid(++counter);
}
public String getpname() {
	return pname;
}
public String getdesc() {
	return pdesc;
}
public int getprice() {
	return price;
}
public int getproductid() {
	return productid;
}
public void setpname(String name) {
	this.pname=name;
}
public void setpdesc(String desc) {
	this.pdesc=desc;
}
public void setprice(int price) {
	this.price=price;
}
public void setproductid(int id) {
	this.productid=id;
}
public void print() {
	System.out.println("Product ID : "+productid+"\tName : "+pname+"\tDescription : "+pdesc+"\tPrice : "+price);
}
}
