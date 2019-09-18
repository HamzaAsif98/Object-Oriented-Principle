import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Teams  T1= new Teams("MyVeryBestIRish","Red","Cork"); 
		Player P1=new Player("Pakie Bonner"," PB");
		Player P2=new Player("Seamus Coleman"," SC");
		Player P3=new Player("Robbie Keane"," PK");
		Player P4=new Player("Liam Miller"," LM");
		Teams  T2= new Teams("MyVeryBestWorld","Blue","Dublin"); 
		Player P5=new Player("Cristiano Ronaldo"," CR");
		Player P6=new Player("Lionel Messi"," LM");
		Player P7=new Player("Diego Maradonna"," DM");
		Player[] arr = new Player[10];
		Player[] arr1 = new Player[10];
		
		System.out.println("\nTeam 1 Details\n");
		
		arr[0] = P1;
		arr[1] = P2;
		arr[2] = P3;
		arr[3] = P4;
	
		T1.setPlayers(arr);
		T1.print();
		
		System.out.println("\nTeam 2 Details\n");
	
		arr1[0] = P5;
		arr1[1] = P6;
		arr1[2] = P7;
		
		T2.setPlayers(arr1);
		T2.print();

		
		
	}

}
