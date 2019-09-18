import java.util.*;

public class orders {

	product orderitem;
	int qty, ordernum;
	static int ordercount = 0;
	
	public orders(product item, int numO) {
		ordercount++;
		this.orderitem = item;
		this.qty = numO;
		this.ordernum = ordercount;	
	}
	public product getorderedItem() {
		return orderitem;
	}
	public void printorderid(int ID) {
		if ((this.orderitem).getproductid() == ID){
		System.out.println("Order Number: "+ordernum + " \nOrder item: " + orderitem.getpname() + "\nQuantity : " + qty);
		}
	}

	public void print() {
		System.out.println("Order item : " + orderitem.getpname() + "\nQuantity : " + qty);
	}
}
