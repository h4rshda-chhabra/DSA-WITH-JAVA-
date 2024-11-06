import java.util.*;
class NODE
{
	int info;
	NODE link;
}
class nodess
{
	NODE NEW,START=null,LAST;
	Scanner ob= new Scanner(System.in);
	void Createlist()
	{
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
		nodess S1=new nodess()	;
		S1.Createlist();
		S1.disp();
	}
}