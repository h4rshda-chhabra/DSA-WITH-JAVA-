import java.io.*;
class datainputs
{
	public static void main(String args[])throws IOException
	{
		String a;
		String b;
		String c;
		DataInputStream ob=new DataInputStream(System.in);
		System.out.print("enter two strings");
		a=ob.readLine();
		int x=Integer.parseInt(ob.readLine());
		b=ob.readLine();
		c=a+b;
		System.out.print(c);
	}
}