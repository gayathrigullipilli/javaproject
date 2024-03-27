package exceptions;


public class unchecked 
{
	public static void main(String [] args)
	{
		System.out.println("welcome");
		try {
			String x="abc";
			int i=Integer.parseInt(x);
			System.out.println(i);
					
			String s="abc";
			System.out.println(s.charAt(3));
			
		int d=100/0;
		System.out.println(d);
		int a[]=new int[6];
				System.out.println(a[7]);
	}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
		System.out.println("hello");
	}

}
