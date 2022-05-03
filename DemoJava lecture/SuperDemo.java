package lj.diploma;

class Test{
	
	String s1 ="Hi I Am Test";
	
}

class Demo extends Test{
	String s1 = "Hi I AM Demo";
	void demoMethod() {
		System.out.println(s1);
		System.out.println(super.s1);
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.demoMethod();
	}

}
