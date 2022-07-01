
package org.cons;

public class Constructor extends Parent {
public Constructor()
{
	this(10);
	System.out.println("ONE");
}
public Constructor(int id)
{
	this("fjsghd");
	System.out.println("TWO");
}
public Constructor(String name)
{
super(false);
System.out.println("THREE");
}
public static void main(String[] args)
{
Constructor c=new Constructor();
}
}
