import java.util.*;
class NODE
{
	int info;
	NODE prev;
	NODE link;
}
class circle
{   
	static NODE NEW,LAST,START;
	START.info=null;
	static Scanner ob=new Scanner(System.in);
	static void getnode()
	{
			System.out.print("enter element");
			NODE NEW=new NODE();
			NEW.info=ob.nextInt();
	}
	static void getLast()
	{
		while(TEMP.link!=START)
		{
			TEMP=TEMP.link;
		}
		LAST=TEMP;
	}
	static void insbeg()
	{
		getnode();
		if(START==null)
		{
			START=NEW;
			NEW.link=START;
			return;
		}
		NEW.link=START;
		getLast();
		LAST.link=NEW;
	}
	static void insLast()
	{
		getnode()
		if(START==null)
		{
			START=NEW;
			NEW.link=START;
			return;
		}
		getLast();
		LAST.link=NEW;
		NEW.link=START;
	}
	static void insDes()
	{
		getnode();
		System.out.print("enter loc");
		int loc=ob.nextInt();
		
		if(loc==1||START==null)
		{
			insBeg();
			return;
		}
		for(int i=1;i<=loc-2;i++)
		{
			TEMP=TEMP.link;
			if(TEMP.link==START)
			{
				System.out.print("inapt choice");
				return;
			}
		}
		NEW.link=TEMP.link;
		TEMP.link=NEW;
	}
	static void del_beg()
	{
		if(START==null)
		{
			System.out.print("empty list");
			return;
		}
		getLast();
		START=START.link;
		LAST.link=START;
	}
	static void delLast()
	{
		NODE PRE=null;
		TEMP=START;
		while(TEMP.link!=START)
		{
			PRE=TEMP;
			TEMP=TEMP.link;
		}
		LAST=TEMP;
		PRE.link=LAST.link;
		LAST.link=null;
	}
	static void delDes()
	{
		System.out.print("enter position");
		int n=ob.nextInt();
		TEMP=START;
		for(int i=0;i=n-1;i++)
		{
			TEMP=TEMP.link;
		}
		NODE POST=TEMP.link;
		TEMP.link=POST.link;
	}
