/*Write a program for swapping and find a factorial value. Perform swapping without using third
variable.*/
/*Dynamic Program from cmd*/
 public class Factorial{
	 public static void main(String args[])
	 {
		 int num = Integer.parseInt(args[0]);
		 int f=1,n;

		 int num1 = Integer.parseInt(args[1]);
		 int f1=1,n1;
		 
		 num=num+num1;
		 num1=num-num1;
		 num=num-num1;
		 System.out.println("After Swaping Factorial Fisrt is :: "+num);
		 System.out.println("After Swaping Factorial Second is :: "+num1);
		 
		 for(n=num;n>0;n--){
			 f=f*n;
		 }
		 System.out.println("Factorial Of First :: "+f);
		 
		 
		 for(n1=num1;n1>0;n1--){
			 f1=f1*n1;
		 }
		 System.out.println("Factorial Of Second :: "+f1);
				 
	 }
 }
 
 /*
 static program
  public class Factorial{
	 public static void main(String args[])
	 {
		 int num;
		 int f=1;
		 for(num=5;num>0;num--){
			 f=f*num;
		 }
		 System.out.println("Factorial :: "+f);
	 }
 }*/