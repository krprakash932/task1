package java_database;
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		int sl_no,qty,i_sell,i_purchase,item_no;
		double price;
		long empid;
		String ename,item_nm;
		employee A=new employee(sl_no,ename,empid);
		A.insert(sl_no,ename,empid);
		A.display();
		stock B=new stock(item_no,item_nm,qty,price);
		B.input(item_no,item_nm,qty,price);
		B.display();
		transaction C=new transaction(i_sell,i_purchase);
		C.getin(i_sell,i_purchase);
		C.display();

	}

}
