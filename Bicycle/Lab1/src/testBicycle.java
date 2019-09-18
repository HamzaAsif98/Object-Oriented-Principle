
public class testBicycle {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle(55,"Raleigh","Racer"); 
		System.out.println(b1);
		
		//testing getters
		System.out.println("----------Answer for Getters --------");
		int auxspeed = b1.getspeed();
		System.out.println(auxspeed);
		String auxmake = b1.getmaker();
		System.out.println(auxmake);
		String auxtype = b1.gettype();
		System.out.println(auxtype);
		System.out.println("----------Answer for Setters --------");
		//setting values in setters
		b1.setspeed(85);
		b1.setmaker("BMX");
		b1.settype("Stunt");
		
		auxspeed = b1.getspeed();
		System.out.println(auxspeed);
		
		auxmake = b1.getmaker();
		System.out.println(auxmake);		
		
		auxtype = b1.gettype();
		System.out.println(auxtype);
		
		System.out.println("----------Answer for Methods go() --------");
		//Testing methods
		b1.go();
		
		System.out.println("----------Answer for Methods go (int)--------");
		b1.go(auxspeed);
		
		System.out.println("----------Answer for Methods print ()--------");
		b1.print();

	}
	

}
