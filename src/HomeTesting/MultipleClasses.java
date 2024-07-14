package HomeTesting;

public class MultipleClasses {

	int x;
	int y = 10;

	MultipleClasses() {
		x = 10;
	}
	
	public int myOwnMethod() { //Overloading
		y=20;
		return y;
	}
	
	public int myOwnMethod(int y) {//Overloading with above & Overriding with below class method
		y=y+1;
		return y;
	}

	public static void main(String[] args) {

		MultipleClasses mc = new MultipleClasses();
		System.out.println(mc.x);
		System.out.println(mc.y);		
		System.out.println(mc.myOwnMethod());
		System.out.println(mc.myOwnMethod(20));
		
		otherClass oc = new otherClass();
		System.out.println(oc.z);
		oc.add();
		System.out.println(oc.z);
		System.out.println(oc.myOwnMethod(20));
	} 
}

class otherClass {
	int z = 10;

	public void add()

	{
		this.z++;
	}
	
	public int myOwnMethod(int y) {//Overriding
		y=y+1;
		return y;
	}
}


