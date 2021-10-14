class jb{
	public static void main(String a[]){
		int num=Integer.parseInt(a[0]),fact=1,n;
		for(n=num;n>0;n--)
			fact=fact*n;
		System.out.println("Factorial of is : "+fact);
	}
}