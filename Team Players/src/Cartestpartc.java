import java.util.ArrayList;
import java.util.Scanner;

public class Cartestpartc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cars> al=new ArrayList<Cars>();
		String Make,Model,description;
		int caryear,price;
		int choice,index;
		do{
			System.out.println("-------Car Menu ---------");
			System.out.println("1. Add\t\t2.Remove\n3. List Cars\t4.Exit");
			choice=sc.nextInt();

			if(choice==1) {

				System.out.println("Enter Car Make : ");
				Make=sc.next();
				System.out.println("Enter Car Model : ");
				Model=sc.next();
				System.out.println("Enter Car Year : ");
				caryear=sc.nextInt();
				System.out.println("Enter Car Price : ");
				price=sc.nextInt();
				System.out.println("Enter Car Description : ");
				description=sc.next();

				al.add (new Cars(Make,Model,caryear,price,description));

			}


			else if (choice==2) {
				System.out.println("Enter the index of the Car You wish to delete:  ");
				index=sc.nextInt();
				al.remove(index);
			}
			else if (choice==3) {

				for(Object each: al) {
					if(each instanceof Cars) {
						Cars temp = (Cars) each;
						temp.Print();	}
				}	
			}
		}while(choice!=4);	
	}

//ArrayList is better then arrays because in arraylist you dont have to set size for the list
	//Where as in arrays yoou are limited size. In arraylist value of size in unknown and 
	//in arrays value of size is known
}
