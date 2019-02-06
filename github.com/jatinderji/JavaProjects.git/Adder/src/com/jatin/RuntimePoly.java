package com.jatin;
class A{
	public void show()
	{
		System.out.println("Show inside A class");
	}
}
class B extends A{
	public void show()
	{
		System.out.println("Show inside B class");
	}
}
public class RuntimePoly {
	public static void main(String[] args) {
		A ob = new B();
		ob.show();
	}

}
