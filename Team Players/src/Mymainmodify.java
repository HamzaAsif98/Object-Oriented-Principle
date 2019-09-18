import java.util.ArrayList;

public class Mymainmodify {

	public static void main(String[] args) {
		Team1  T1= new Team1("MyVeryBestIRish","Red","Cork"); 

		Player1 P1=new Player1("Pakie Bonner"," PB");
		Player1 P2=new Player1("Seamus Coleman"," SC");
		Player1 P3=new Player1("Robbie Keane"," PK");
		Player1 P4=new Player1("Liam Miller"," LM");
		Team1  T2= new Team1("MyVeryBestWorld","Blue","Dublin"); 
		Player1 P5=new Player1("Cristiano Ronaldo"," CR");
		Player1 P6=new Player1("Lionel Messi"," LM");
		Player1 P7=new Player1("Diego Maradonna"," DM");
		
		ArrayList<Player1> al = new ArrayList<Player1>();
		ArrayList<Player1> al1 = new ArrayList<Player1>();
		
		
		al.add(P1);
		al.add(P2);
		al.add(P3);
		al.add(P4);
		System.out.println("\nTeam1 ArrayList\n"); 
		T1.setPlayers1(al);
		T1.Print();
		
		System.out.println("\nTeam2 Arraylist\n");
		al1.add(P5);
		al1.add(P6);
		al1.add(P7);
		T2.setPlayers1(al1);
		T2.Print();
	
	}

}
