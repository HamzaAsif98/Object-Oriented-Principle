
public class TestObjectList {

	public static void main(String[] args) {
		/**
		 * Write a description of class TestObjectList here.
		 * 
		 * @author (your name) 
		 * @version (a version number or a date)
		 */

		       ObjectList ol = new ObjectList(3);
		       
		       String s = "Im Happy";
		       Dog1 d = new Dog1();//need to create Dog Class
		       DVD v = new DVD();//Need to create DVD Class 
		       Integer i = 1234;//Wrapper Class
		       
		     ol.add(s);//This line will add s in ol[0]
		       ol.add(d);//This line will add d in ol[1]
		      ol.add(v);//This line will add v in ol[2]
		       ol.add(i);//this will fail
		       
		       ol.remove(0);//this will remove item at position 0
		       ol.add(i);//this will take position [2]
		       
		       
		       System.out.println("Is the list full? "+ ol.isFull());//this will check if the object list is full and error was there because missing ol 
		       System.out.println("Is the list empty? "+ ol.isEmpty());//this will check if the list is empty and error was missing ol
		       
		       System.out.println("Total number of objects in the list: " + ol.getTotal());//this method will display no.of item in the list
		       
		       Object g = ol.getObject(0);//this will take you to position 0 in list
		       ((Dog1) g).bark();//bark method to print error was no dog class and bark method was there 
		       
		   }
	}

