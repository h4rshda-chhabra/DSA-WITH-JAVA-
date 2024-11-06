import java.util.*;
class NODE
{
	int info;
	NODE link;
}
class concat
{
	static NODE NEW,LAST;
	static Scanner ob= new Scanner(System.in);
	static NODE Createlist()
	{
		NODE START=null;
		System.out.print("enter the size of the list");
		int n=ob.nextInt();
		System.out.printf("enter %d numbers",n);
		for(int i=1;i<=n;i++)
		{
			NEW=new NODE();
			NEW.info=ob.nextInt();
			if(START==null)
			{
				START=NEW;
			}
			else
			{
				LAST.link=NEW;
			}
			LAST=NEW;
		}
		LAST.link=null;
		return START;
	}
	static void disp(NODE TEMP)
	{

		while(TEMP!=null)
		{
			System.out.println(TEMP.info);
			TEMP=TEMP.link;
		}
	}
	static NODE getlast(NODE list1)
	{
		NODE TEMP=list1;
		while(TEMP.link!=null)
		{
			TEMP=TEMP.link;
		}
		return TEMP;
	}
	public static void main(String args[])
	{
		NODE list1,list2;
		list1=Createlist();
		list2=Createlist();
		System.out.println("Display list1");
		disp(list1);
		System.out.println("Display list2");
		disp(list2);
		LAST=getlast(list1);
		LAST.link=list2;
		System.out.println("Display list1");
		disp(list1);
		System.out.println("Display list2");
		disp(list2);
	}
}
