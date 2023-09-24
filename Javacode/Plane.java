package Javacode;

abstract class Plane1 {
	abstract void fly();
	abstract void land();
}
class Cargo extends Plane1{
	void fly()
	{
		System.out.println("Cargo is flying");
	}
	void land(){
		System.out.println("cargo landed");
	}
}
class Figh extends Plane1{
	void fly(){
		System.out.println("Fighter is flying");
	}
	void land() {
		System.out.println("fighter has landed");
	}
}
class Airport1{
	void allow(Plane1 ref) {
		ref.fly();
		ref.land();
	}
}
class Lokesh{
	void sandy() {
		System.out.println("Sandy is dancing in Cargo");
		System.out.println();
		System.out.println("Sandy is fire bombs from Fighter Plane");
	}
}
public class Plane{
	public static void main(String[]args) {
		Cargo c=new Cargo();
		Figh f=new Figh();
		Airport1 a=new Airport1();
		Lokesh lok=new Lokesh();
		a.allow(c);
		System.out.println();
		a.allow(f);
		System.out.println();
		lok.sandy();
		
	}
}

