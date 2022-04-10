package com.kashi.practice;
abstract class MyTest 
{ 
	abstract void calculate(int a, int b); 
} 
class Addition extends MyTest 
{ 
	void calculate(int a, int b)
	{ 
		int x = a + b; 
		System.out.println("Sum :" +x); 
	} 
} 
class Subtraction extends MyTest 
{ 
	void calculate(int a, int b)
	{ 
		int y = a - b; 
		System.out.println("Substract :" +y); 
	} 
} 
class Multiplication extends MyTest 
{ 
	void calculate(int a, int b)
	{ 
		int z = a * b; 
		System.out.println("Multiply :" +z); 
	} 
} 
class sampleAbstract1 {

	public static void main(String[] args) 
	{ 
		Addition a = new Addition(); 
		Subtraction s = new Subtraction(); 
		Multiplication m = new Multiplication(); 

		a.calculate(20, 30); 
		s.calculate(10, 5); 
		m.calculate(10, 20); 
	} 
}





