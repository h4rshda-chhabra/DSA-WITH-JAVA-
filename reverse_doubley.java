import java.util.*;
class NODE
{
	int info;
	NODE prev;
	NODE link;
}
class reverse_doubley
{   
	static NODE NEW,START=null,LAST;
	static Scanner ob=new Scanner(System.in);
	static void ins_end()
	{

		NEW=new NODE();
		System.out.print("enter element");
		NEW.info=ob.nextInt();
		if(START==null)
		{
			START=NEW;
			NEW.link=null;
			NEW.prev=null;
			// System.out.print("hello.....");
		}
		else
		{
			NODE TEMP=START;
			while(TEMP.link!=null)
			{	
				TEMP=TEMP.link;
			}
			LAST=TEMP;
			LAST.link=NEW;
			NEW.prev=LAST;
			NEW.link=null;
		}
		
	}
	static void disp()
	{
		NODE TEMP=START;
		System.out.print("hello");
		while(TEMP!=null)
		{
			System.out.println(TEMP.info);
			TEMP=TEMP.link;
		}
	}
	static void reverse()
	{
		NODE TEMP=START;
		while(TEMP.link!=null)
		{
			TEMP=TEMP.link;
		}
		while(TEMP!=null)
		{
			System.out.print(TEMP.info);
			TEMP=TEMP.prev;
		}
	}
	public static void main(String args[])
	{
		for(int i=0;i<=4;i++)
		{
			ins_end();
		}
		disp();
		reverse();
	}
}