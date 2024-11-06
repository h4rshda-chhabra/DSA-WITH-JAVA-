import java.util.*;
class NODE
{
	int info;
	NODE link;
}
class getn
{
	NODE NEW,START=null,LAST;
	Scanner ob=new Scanner(System.in);
	void Createlist()
	{
		System.out.print("Enter the number of digits you want to add:  ");
		int n=ob.nextInt();
		System.out.printf("enter %d numbers:    ",n);
		for(int i=1;i<=n;i++)
		{
			NEW= new NODE();
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
	}
	NODE getnode()
	{
	
		NODE TEMP=START;
		while(TEMP.link!=null)
		{
			TEMP=TEMP.link;
		}
		return (TEMP);,
	}
	void insbeg()
	{
		NODE NEW=NEW NODE();

	}
	void insend()
	{
		NODE TEMP=new NODE();
		LAST.link=TEMP;
		System.out.print("enter the element you want to add: ");
		TEMP.info=ob.nextInt();
		TEMP.link=null;
	}
	void disp()
	{
		NODE TEMP=START;
		while(TEMP!=null)
		{
			System.out.println(TEMP.info);
			TEMP=TEMP.link;
		}
	}
	public static void main(String args[])
	{
		getn S1= new getn();
		S1.Createlist();
		NODE PRO=S1.getnode();
		System.out.println(PRO.info);
		S1.insbeg();
		S1.disp();
	}
}