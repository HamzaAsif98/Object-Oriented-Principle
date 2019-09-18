import java.util.Scanner;
public class bottlesaltering {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bottles=0;
	do {
		System.out.println("Enter Bottle of Beer");
		bottles=sc.nextInt();
		
			if(bottles==1)
			{System.out.println(bottles+" bottle of beer \r\n" + 
					"	Take one down\r\n" + 
					"	Pass it around\r\n" + 
					"");}
			else
			System.out.println(bottles+" bottles of beer \r\n" + 
					"	Take one down\r\n" + 
					"	Pass it around\r\n" + 
					"");
	}while(bottles!=0);
		
		/*System.out.println("No more Bottle of Beer Left");
*/
	sc.close();}

	}

