Arrays in Java
An array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important points about Java arrays.

In Java all arrays are dynamically allocated.(discussed below)
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++ where we find length using sizeof.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered and each have an index beginning from 0.
Java array can be also be used as a static field, a local variable or a method parameter.
The size of an array must be specified by an int or short value and not long.
The direct superclass of an array type is Object.
  Programs:-
    // Java program to illustrate creating an array
// of integers, puts some values in the array,
// and prints each value to standard output.

class GFG
{
	public static void main (String[] args)
	{		
	// declares an Array of integers.
	int[] arr;
		
	// allocating memory for 5 integers.
	arr = new int[5];
		
	// initialize the first elements of the array
	arr[0] = 10;
		
	// initialize the second elements of the array
	arr[1] = 20;
		
	//so on...
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
		
	// accessing the elements of the specified array
	for (int i = 0; i < arr.length; i++)
		System.out.println("Element at index " + i +
									" : "+ arr[i]);		
	}
}
