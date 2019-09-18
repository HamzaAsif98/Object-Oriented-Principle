import java.util.*;

public class test {

	public static void main(String[] args) {
		int choice;
		Scanner sc= new Scanner(System.in);
		phone p = new phone("Galaxys7", " Smart Phones", 699, " Samsung "," GM-798", 64);
		phone p1 = new phone("Iphone7plus", "Smart Phones", 450, " Apple "," iPhoneXS ", 128);
		TV t = new TV("PanasonicX1", " Smart TV", 350, "Panasonic","LED", 55 , "Yes");
		TV t1 = new TV("PhilipJ7", " Smart TV", 650, "Philip","LCD", 45, "No");
		customer c = new customer("Ivan", "Bandon");
		productdb.plist.add(p);
		productdb.plist.add(p1);
		productdb.plist.add(t);
		productdb.plist.add(t1);
		customer.customer.add(c);
		do {
		System.out.println("--Welcome To Online Store--");
		System.out.println("1.Create Phone\t\t2.Create Customer\t\t3.Find Product\t\t4.Display All Products"
				+ "\n5.Order Now\t\t6.All Order\t\t\t7.Orders By ProductID\t8.Exit");
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter Product Name : ");
			String pname = sc.next();
			System.out.println("Enter Product description");
			String pdesc = sc.next();
			System.out.println("Enter Product Price");
			int pprice = sc.nextInt();
			System.out.println("Enter Phone Maker : ");
			String phmaker = sc.next();
			System.out.println("Enter Phone Model : ");
			String phmodel = sc.next();
			System.out.println("Enter Phone Storage : ");
			int phstorage = sc.nextInt();
			phone phone = new phone(pname, pdesc, pprice, phmaker, phmodel, phstorage);
			productdb.plist.add(phone);
		}
		else if (choice==2) {
			System.out.println("\nEnter Customer Name : ");
			String name = sc.next();
			System.out.println("\nEnter Customer Address : ");
			String address = sc.next();
			customer cust = new customer(name, address);
			customer.customer.add(cust);
		}
		else if (choice==3) {
			System.out.println("Enter Product ID : ");
			product.counter = sc.nextInt();
			System.out.println(productdb.find(productdb.plist, product.counter));
		}
		else if (choice==4) {
			for (product prod : productdb.plist){
				System.out.println(prod);

			}
		}
		else if (choice==5) {
			int select;
			do {
				int custNo = 0;
				System.out.println("Would you like to order 1 for yes -1 for exit");
				select=sc.nextInt();
				if(select==1) {
			do {
					System.out.println("Enter Valid Customer No : ");
			
			for (int i = 0; i < customer.customer.size(); i++) {
				System.out.println(i + ". " + customer.customer.get(i));
				custNo = sc.nextInt();
				}
			}while(custNo>=customer.customer.size());
			
			
			System.out.println("\nEnter Product ID : ");
			int orderid= sc.nextInt();
			product po = new product(null, null, orderid);
			po = productdb.find(productdb.plist, orderid);
			System.out.println("\nEnter Product Quantity : ");
			int qtyitem = sc.nextInt();
			orders o1 = new orders(po, qtyitem);
			customer.orders.add(o1);
			System.out.println("You ordered "+ qtyitem +" "+po.pname);}
			}while(select!=-1);
			}
		else if (choice==6) {
			for (orders custorder : customer.orders){
			custorder.print();
		}}
		else if (choice==7) {
			int prodid;
			do {
			System.out.println("\nEnter Ordered Product ID.\n");
			prodid = sc.nextInt();
			for (orders order : customer.orders) {
				int i = 0;
				if (order.getorderedItem().getproductid() == prodid) {
					customer.orders.get(i).printorderid(prodid);
					i++;
			}
		}
		}while(prodid>=customer.orders.size());
		}
		else if (choice==8) {
			System.out.println("Good Bye");
		}
		}while(choice!=8);
		}

}
