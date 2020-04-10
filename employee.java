package java_database;
import java.util.*;

public class employee {
	int sl_no;
	String ename;
	long empid;
	public employee(int sl_no,String ename,long empid)
	{
		this.sl_no=sl_no;
		this.ename=ename;
		this.empid=empid;
		
	}
	Scanner obj=new Scanner(System.in);
	void insert(int sl_no,String ename,long empid)
	{
		System.out.println("Enter the total no.of employees :");
		int n=obj.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the serial no");
			sl_no=obj.nextInt();
			System.out.println("Entr the name :");
			ename=obj.nextLine();
			System.out.println("Enter the empid :");
			empid=obj.nextLong();
		}
		
	}
	void display()
	{
		System.out.println("serial no :"+sl_no+" "+"name :"+ename+" "+"id :"+empid);
	}

}

