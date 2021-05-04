package test;

public class InheritanceChild extends Inheritance{
	
	public void bark() {
		System.out.println("Barking from Child method");
	}
public static void main(String[] args) {
	
	Inheritance i1 = new Inheritance();
	InheritanceChild i2 = new InheritanceChild();
	Inheritance i3 = new InheritanceChild();
	
	
	i1.bark();
	i2.bark();
	i3.bark();
	
	
}
}
