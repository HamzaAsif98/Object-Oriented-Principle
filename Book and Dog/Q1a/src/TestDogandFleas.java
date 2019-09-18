
public class TestDogandFleas {

	public static void main(String[] args) {
		 Dog dog1 = new Dog();
		 Dog dog2 = new Dog();
		 dog1.setName("Tom");
		 dog1.setAge(12);
		 dog1.setAddress("Dublin");
		 dog2.setName("Bully");
		 dog2.setAge(15);
		 dog2.setAddress("Cork");
		    
		 	fleas f1 = new fleas();
		    f1.setName("First Flea");
		    f1.setAge(18);

		    fleas f2 = new fleas();
		    f2.setName("Second Flea");
		    f2.setAge(13);
		    
		    fleas f3 = new fleas();
		    f3.setName("Third Flea");
		    f3.setAge(8);
		    
		 

		    dog1.addingFleas(f1); 
		    dog1.addingFleas(f2);
		    dog1.addingFleas(f3);
		    dog1.print();
		    dog1.listFleas();
		    dog2.addingFleas(f1); 
		    dog2.addingFleas(f2);
		    dog2.print();
		    dog2.listFleas();
		   
		    

	}

	}
