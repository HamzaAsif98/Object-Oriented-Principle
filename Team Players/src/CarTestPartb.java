
public class CarTestPartb {

	public static void main(String[] args) {
		
		
		Cars c1=new Cars("Honda","Civic",2006,1500,"Banger");
		Cars c2=new Cars("Toyota","Corolla",2012,2500,"Slightly worn");
		Cars c3=new Cars("Toyota","Yaris",2015,3500,"Slightly worn");
		Cars c4=new Cars("Peugeot","3008",2016,15000,"Shiny New");
		Cars c5=new Cars("Hyundai","i10",2010,3000,"past its best.");
		
		Cars[] arr1 = new Cars[5];
		arr1[0]=c1;
		arr1[1]=c2;		
		arr1[2]=c3;
		arr1[3]=c4;
		arr1[4]=c5;
		for (int i = 0;i<arr1.length;i++) {
			arr1[i].Print();
		}

		
	}

}
