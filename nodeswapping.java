import java.util.*;
class NODE
{
	int info;
	NODE prev;
	NODE link;
}
class swapping
{   
	static NODE NEW,START=null,LAST;
	static Scanner ob=new Scanner(System.in);
	static void Createlist()
	{
		System.out.print("enter the size of the list ");
		int n=ob.nextInt();
		System.out.printf("enter %d numbers ",n);
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
	static void disp()
	{
		NODE TEMP=START;
		while(TEMP!=null)
		{
			System.out.println(TEMP.info);
			TEMP=TEMP.link;
		}
	}
	static void swap()
	{
		System.out.print("enter element to search ");
		int p=ob.nextInt();
		NODE TEMP=START;
		NODE PRE=null;
		NODE POST=null;
		while(TEMP.link!=null)
		{
			if(p==TEMP.info)
			{
				break;
			}
			PRE=TEMP;
			TEMP=TEMP.link;
		}
		if(TEMP.link==null)
		{
			System.out.print("invalid location ");
			return;
		}
		POST=TEMP.link;
		TEMP.link=POST.link;
		POST.link=TEMP;	
		if(PRE!=null)
		{
			PRE.link=POST;
		}
		else
		{
			START=POST;
		}
		disp();
	}
	public static void main(String args[])
	{
		Createlist();
		swap();
	}
}