
public class TestBookList {

	public static void main(String[] args) {
		Books  b1 = new Books(null, 0, null, 0); //Its creating space for new instance of a class bicycle
	     b1.setTitle("Java Coding");  
	        b1.setISBN(4569);
	        b1.setAuthor("Richard Richie");
	        b1.setPrice(15.00);
	        b1.print();
	        
	        Books b2 = new Books("Php", 1515,"Williams",25.00);
	        Books b3 = new Books("Web Development", 6169,"Packie",40.00);
        
	        b2.print();
        
	        b3.print();
        
	        BookList listofbook = new BookList (2);
	        listofbook.add(b1);
        listofbook.add(b2);
        listofbook.add(b3);//error
        
        listofbook.remove(0);
        listofbook.add(b3);
        
        Lecturer lecturer = new Lecturer (listofbook);
        lecturer.print();
}
	}


