
public class TestBicycle {

	public static void main(String[] args) {
		//Creating object 1 of bicycle class
        Bicycle  bike1 = new Bicycle(0, null, null ); //No argument were there of data type 
        
        //This setter is used to set speed of bicycle
        bike1.setSpeed(100); 
        //This setter is used to set maker for the bike
        bike1.setMaker("Raleigh");
        //this setter is used to set bike type
        bike1.setType("Mountain Bike");//was missing ;
        //Printing set details
        System.out.println("-------Printing Bike 1 Set Values\n");
        bike1.print();
        
        //Creating object 2 of bicycle class
        Bicycle bike2 = new Bicycle(10,"Home Made", "Bone Shaker");
        
        
        System.out.println("-------Printing Bike 2 Values\n");
        //Printing values for object bike2
        bike2.print();//print was there but without any object to print

	}

}
