import java.util.*;

public class productdb {

	static ArrayList<product> plist = new ArrayList<product>();	

	static product find(List<product> plist,int productID)
	{
		product prod = null;
		for(product pro : plist){
			if (pro.productid == productID){
				prod = pro;
			}
			
		}
		return prod;
	}
	public void add(product i) {
		this.plist.add(i);
	}
	public void remove(product i) {
		this.plist.remove(i);
	}


}
