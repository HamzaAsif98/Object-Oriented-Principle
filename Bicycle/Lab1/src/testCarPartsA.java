import java.util.Scanner;

public class testCarPartsA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String make[] ,model[],description = null;
		int Price[],caryear[];
		int year = 0; 
		make = new String[20];
		model = new String [20];
		caryear = new int [20];
		Price = new int[20];
		String [] arrays =new String [20];	
		int i;
		for(i=0;i<arrays.length;i++) {
		System.out.println("Enter Car Make : ");
		make[i]=sc.next();
		System.out.println("Enter Car Model : ");
		model[i]=sc.next();
		System.out.println("Enter Car Manufacturing Year : ");
		caryear[i]=sc.nextInt();
		System.out.println("Enter Car Price : ");
		Price[i]=sc.nextInt();
		if (caryear[i]>=2015) {
			description="Shiny new";}
		else if (caryear[i]>=2012) {
			description="Slightly Worn";}
		else if (caryear[i]>=2010) {
			description="Past its best";	}
		else if (caryear[i]>=2008) {
			description="Showing Signs of age";}
		else
			description="a Banger";
		year=2018-caryear[i];}
		for(i=0;i<arrays.length;i++) {arrays[i]="Make = "+make[i]+"\nModel = "+model[i]+"\nCar Year =  "+caryear[i]+"\nPrice = €"+Price[i]+
			"\n"+make[i]+" "+model[i]+" is "+year+" years old and is "+description+"\n";}	
		for (i=0;i<arrays.length;i++) {
		System.out.println(arrays[i]);}
		
		
		
		sc.close();
		
		
		
	}


}
