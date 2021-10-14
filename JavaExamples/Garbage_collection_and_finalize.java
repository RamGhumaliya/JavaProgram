class TestGarbage1
{  
	protected void finalize()
	{
		System.out.println("object is garbage collected");
	} 		
	public static void main(String args[])
	{  
		TestGarbage1 s12=new TestGarbage1();  
		TestGarbage1 s22=new TestGarbage1();  
		s12=null;  
		s22=null;  
		System.gc();  
	}  
}  