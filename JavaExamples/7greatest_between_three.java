import java.util.*;
class greatest
{
	int great(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				return a;
			else
				return c;
		}
		else
		{
			if(b>c)
				return b;
			else
				return c;
		}
	}
}
class psp
{
	public static void main(String a[])
	{
		int x,y,z;
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		x = sn.nextInt();
		System.out.print("Enter Second Number: ");
		y = sn.nextInt();
		System.out.print("Enter Third Number: ");
		z = sn.nextInt();
		greatest g1 = new greatest();
		int value = g1.great(x,y,z);
		System.out.println(value+" is Greatest number");
	}
}