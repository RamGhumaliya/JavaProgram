class Amstrong{
	public static void main(String a[]){
		int num = Integer.parseInt(a[0]);
		int sum=0,rev;
		int temp=num;
		
		while(num>0)
		{
			rev=num%10;
			sum=sum+(rev*rev*rev);
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not a Amstrong Number");
	}
} 