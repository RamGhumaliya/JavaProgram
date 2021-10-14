class Fibbo{
	public static void main(String a[])
	{	
		int num = Integer.parseInt(a[0]);
		int i=1,t1=1,t2=1,t3=1; 
		System.out.println(t3);
		while(i<=num)
		{
			System.out.println(t3);
			t1=t2;
			t2=t3;
			t3=t1+t2;
			i++;
		}
	}
}