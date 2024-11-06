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
		System.out.print("enter no.");
		NEW=new NODE();
		NEW.info=ob.nextInt();
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
	NODE getlast()
	{
		NODE TEMP=START;
		while (TEMP.link!=null)
		{
			TEMP=TEMP.link;
		}
		return TEMP;
	}
	void inslast()
	{
		getnode();
		if(START==null)
		{
			START=NEW;
			START.link=null;
		}
		else
		{
			LAST=getlast();
			LAST.link=NEW;
		}
	}
	void del_last()
	{
		NODE PTR=null;
		NODE TEMP=START;
		while(TEMP.link!=null)
		{
			PTR=TEMP;
			TEMP=TEMP.link;
		}
		PTR.link=null;
	}
	void ins_des()
	{
		System.out.print("enter loc");
		n=ob.nextInt();
		if(n==1);
		{
				ins_beg();
				break;
		}
		getnode();
		NODE TEMP=START;
		for(int i=1;i<n-2;i++)
			{
				TEMP=TEMP.link;
					if(TEMP==NULL)
					{
						System.out.println("enter apt location");
						return;
					}
					NEW.link=TEMP.link;
					TEMP.link=NEW;
			}
		}
	}
	void del_beg()
	{
		NODE TEMP=START;
		if(START==null)
		{
			System.out.print("empty");
			return;
		}
		TEMP.link=NULL;
	}
	void del_des()
	{
		NODE TEMPO=START;
		System.out.print("enter location to delete:  ");
		int n=ob.nextInt();
		if(TEMPO==null)
		{
			System.out.print("empty");
		}
		/*else if (n==1)
		{
			del_beg();
			break;
		}*/
		for(int i=1;i<=n-2;i++)
		{
				TEMPO=TEMPO.link;
		}
		NODE PRE=TEMPO.link;
		NODE LOC=PRE.link;
		NODE POST=LOC.link;
		TEMPO.link=null;
		PRE.link=POST;
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
		Scanner ob=new Scanner(System.in);
		getn S1=new getn(); 
		System.out.println("1. insert @ beg");
		System.out.println("2. insert @ end");
		System.out.println("3. del last");
		System.out.println("4. del des");
		System.out.println("5. ins des");
		System.out.println("6. disp");
		System.out.println("7. exit");
		System.out.println("8. del beg");
		
		while (true)
		{
			System.out.print("Enter choice:   ");
			int ch=ob.nextInt();
			switch(ch)
			{
				case 1:
					S1.insbeg();
					break;
				case 2:
					S1.inslast();
					break;
				case 6:
					S1.disp();
					break;
				case 3:
					S1.del_last();
					S1.disp();
					break;
				case 7:
					System.out.print("stop");
					System.exit(0);
				case 4:
					S1.del_des();
					S1.disp();
				case 5:
					S1.ins_des();
					S1.disp();
				case 8:
					S1.del_beg();
					S1.disp();
			
			}
		}
		
	}
}