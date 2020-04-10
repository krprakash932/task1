package java_database;
import java.util.*;

public class transaction {
	int i_sell,i_purchase;
	public transaction(int i_sell,int i_purchase)
	{
		this.i_sell=i_sell;
		this.i_purchase=i_purchase;
	}
	Scanner obj=new Scanner(System.in);
	void getin(int i_sell,int i_purchase)
	{
		System.out.println("Enter the no.of items sold :");
		i_sell=obj.nextInt();
		System.out.println("Enter the no.of items purchased :");
		i_purchase=obj.nextInt();
		System.out.println("Enter the items left :");
		int i_left=i_purchase-i_sell;
		System.out.println("items left :"+i_left);
				
	}
	void display()
	{
		System.out.println("items sell :"+i_sell+" "+"item purchased :"+i_purchase);
	}

}
