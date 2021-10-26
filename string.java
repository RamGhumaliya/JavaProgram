Strings in Java
Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. 
  program:-
    // Java code to illustrate String
import java.io.*;
import java.lang.*;

class Test {
	public static void main(String[] args)
	{
		// Declare String without using new operator
		String s = "GeeksforGeeks";

		// Prints the String.
		System.out.println("String s = " + s);

		// Declare String using new operator
		String s1 = new String("GeeksforGeeks");

		// Prints the String.
		System.out.println("String s1 = " + s1);
	}
}
