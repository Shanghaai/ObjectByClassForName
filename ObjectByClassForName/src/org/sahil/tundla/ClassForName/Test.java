package org.sahil.tundla.ClassForName;

class Customer
{}

class Employee
{}

class  Producer
{}

class Test 
{
	public static void main(String[] args) throws Exception 
	{
		//if uh dont know class name at the Beginning ann you want to create class object 
		//at run-time then use this method
		//Ex. Servlet Container always create the instance at the run-time based on url pattern
		//for xorresponding servlet
		Object o = Class.forName(args[0]).newInstance();
		System.out.println("Object Created for the class :"+o.getClass().getName());
	}
}
