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
	void getnode()
	{
		system.out.print("enter no.");
		NEW=new NODE();
		NEW.info=ob.next();
	}
	void insbeg()
	{
		getnode();
		if(START==null)
		{
			START=NEW;
			START.link=null;
		}
		else
		{
			NEW.link=START;
			START=NEW;
		}	
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
		S1.insbeg();
		S1.disp();
 	}
}