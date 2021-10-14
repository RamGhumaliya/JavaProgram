import java.util.*;
class psp
{
	public static void main(String a[])
	{
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int x = sn.nextInt();
		for(int i=2;i<=x;i=i+2)
			System.out.println(i);
	}
}