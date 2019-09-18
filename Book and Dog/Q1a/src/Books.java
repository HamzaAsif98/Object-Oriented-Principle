import java.util.ArrayList;

public class Books {
	
private String Author;
private String Title;
private double Price;
private int ISBN;


public Books(String T, int Is, String A, double P){
	this.Title=T;
	this.ISBN=Is;
	this.Author=A;
	this.Price=P;
}
public String getTitle() {
	return Title;
}
public int getISBN() {
	return ISBN;
	
} 
public String getAuthor() {
	return Author;
}
public double getPrice() {
	return Price;
}
public void setTitle(String Title) {
	this.Title=Title;
}
public void setISBN(int ISBN) {
	this.ISBN=ISBN;
	
} 
public void setAuthor(String Author) {
     this.Author=Author;
}
public void setPrice(double Price) {
	this.Price=Price;
}
public void print() {
	System.out.println("Book Title: " + Title + 
			" Book Author: " + Author + 
			" ISBN: " + ISBN + 
			" Book Price: " +Price);

}
} 