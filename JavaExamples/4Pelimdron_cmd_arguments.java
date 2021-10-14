class Pelimdron{
	public static void main(String a[]){
		int num = Integer.parseInt(a[0]);
		int rev=0;
		int temp=num;
		while(num>0){			
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		if(temp == rev)
			System.out.println("Pelimdron");
		else
			System.out.println("Not Pelimdron");
	}
}
/*class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  */