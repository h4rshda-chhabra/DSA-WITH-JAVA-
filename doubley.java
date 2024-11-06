import java.util.*;
class NODE
{
	int info;
	NODE prev;
	NODE link;
}
class doubley
{
	static NODE NEW,START=null,LAST;
	static Scanner ob=new Scanner(System.in);
	static void ins_beg()
	{
		System.out.print("enter data");
		NEW= new NODE();
		NEW.info=ob.nextInt();
		if (START==null)
		{			
			NEW.link=null; //d
		}
		else
		{		
			NEW.link=START;
			START.prev=NEW;
		}
		START=NEW;
		START.prev=null; //d
	}
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
		NEW.link=null;
	}
	static void del_beg()
	{
		if(START==null)
		{
			System.out.print("empty list");
			return;
		}
		NODE TEMP=START;
		START=TEMP.link;
		START.prev=null;
	}
	static void del_end()
	{
		NODE TEMP=START;
		NODE PTR=null;
		if(START==null)
		{
			System.out.print("empty");
			return;
		}
		while(TEMP.link!=null)
		{
			PTR=TEMP;
			TEMP=TEMP.link;
		}
		if(PTR.link!=null)
		{
			PTR.link=null;
		}
		else
		{
			START=null;
		}
	}
	static void del_des()
	{
		System.out.print("enter position");
		int n=ob.nextInt();
		if(n==1)
		{
			del_beg();
			return;
		}
		NODE PTR=null;
		NODE TEMP=START;
		for(int i=1;i<=n-1;i++)
		{
			PTR=TEMP;
			TEMP=TEMP.link;
			if(TEMP==null)
			{
					System.out.print("inappropriate choice");
					return;
			}
		} 
		PTR.link=TEMP.link;
		if(PTR.link!=null)
		{
			TEMP.link.prev=PTR;
		}
	}
	static void ins_des()
	{
		System.out.print("enter position");
		int n=ob.nextInt();
		if(START.link==null)
		{
			ins_beg();
			return;
		}
		else
		{
			NEW= new NODE();
			NODE TEMP=START;
			for(int i=1;i<=n-2;i++)
			{
				TEMP=TEMP.link;
				if(TEMP==null)
				{
					System.out.print("location is inapt");
					return;
				}
				NEW.link=TEMP.link;	
				TEMP.link=NEW;	

			}
		}
	}
	static void disp()
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
		System.out.println("1. insert @ beg");
		System.out.println("2. insert @ end");
		System.out.println("3. delete @ beg");
		System.out.println("4. delete @ end");
		System.out.println("5. delete @ des");
		System.out.println("6. insert @ des");
		System.out.println("7. disp");
		System.out.println("8. exit");
		while (true)
		{
			System.out.print("Enter choice:   ");
			int ch=ob.nextInt();
			switch(ch)
				{
					case 1:
						ins_beg();
						break;
					case 2:
						ins_end();
						break;
					case 3:
						del_beg();
						disp();
						break;
					case 4:
						del_end();
						disp();
						break;
					case 5:
						del_des();
						disp();
						break;
					case 6:
						ins_des();
						disp();
						break;

					case 7:
						disp();
						break;
					case 8:
						System.exit(0);
				}
		}
	}
}