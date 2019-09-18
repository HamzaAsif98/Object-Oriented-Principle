
public class bottles99 {

	public static void main(String[] args) {
		int bottles;
		for(bottles=99;bottles>0;bottles--) {
			System.out.println(bottles+" bottles of beer \r\n" + 
					"	Take one down\r\n" + 
					"	Pass it around\r\n" + 
					"");
			if (bottles==1){
				System.out.println(bottles+" bottle of beer \r\n" + 
					"	Take one down\r\n" + 
					"	Pass it around\r\n" + 
					"");
			}
		}
		System.out.println("No more Bottle of Beer Left");

	}

}
