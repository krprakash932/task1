package java_database;
import java.util.*;

public class stock {
	int item_no;
	String item_nm;
	int qty;
	double price;
	public stock(int item_no,String item_nm,int qty,double price )
	{
		this.item_no=item_no;
		this.item_nm=item_nm;
		this.qty=qty;
		this.price=price;
	}
	Scanner obj=new Scanner (System.in);
	void input(int item_no,String item_nm,int qty,double price)
	{
		int i=0;
		while(i>1)
		{
			System.out.println("Enter the item_no :");
			item_no=obj.nextInt();
			System.out.println("Enter the item name :");
			item_nm=obj.next();
			System.out.println("Enter the quantity :");
			qty=obj.nextInt();
			System.out.println("Enter the price :");
			price=obj.nextDouble();
			i++;
		}
	}
	void display()
	{
		System.out.println("item numbr :"+item_no+" "+" item name :"+item_nm+" "+"Quantity :"+qty+" "+"price :"+price);
	}

}
