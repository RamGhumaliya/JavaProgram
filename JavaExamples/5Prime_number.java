class Prime{
	public static void main(String a[]){
		int num = Integer.parseInt(a[0]);
		int n=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				n++;
		}
		if(n==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}