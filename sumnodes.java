import java.util.*;
class NODE
{
	int info;
	NODE link;
}
class sumnodes
{
	NODE NEW,START=null,LAST;
	int sum=0;
	Scanner ob=new Scanner(System.in);
	void Createlist()
	{
		System.out.print("Enter the number of digits you want to add");
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
	void add()
	{
		NODE TEMP=START;
		int sum=0;
		while(TEMP!=null)
		{
			sum=sum+TEMP.info;
			TEMP=TEMP.link;
		}
		System.out.printf("THE SUM IS %d",sum);
	}
	void oddeven()
	{
		NODE TEMP=START;
		int even=0;
		int odd=0;
		while(TEMP!=null)
		{
			if(TEMP.info%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			TEMP=TEMP.link;
		}
		System.out.printf("odd numbers=%d",odd);
		System.out.printf("even numbers=%d",even);
	}
	public static void main(String args[])
	{
		sumnodes S1= new sumnodes();
		S1.Createlist();
		S1.add();
		S1.oddeven();
	}
}