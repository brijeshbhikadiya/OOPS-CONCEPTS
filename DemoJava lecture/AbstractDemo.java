package lj.diploma;

abstract class CommonMethod{
	abstract void Stream();
	abstract void semester();
	abstract void subject(String semester);
}

public class AbstractDemo extends CommonMethod {
	
	public static void main(String[] args) {
		CommonMethod c = new AbstractDemo();
		c.Stream();
		c.semester();
		c.subject("1");
		c.subject("4");
		c.subject("2");
	}

	@Override
	void Stream() {
		// TODO Auto-generated method stub
		System.out.println("IT/CE");
	}

	@Override
	void semester() {
		// TODO Auto-generated method stub
		System.out.println("Sem1,Sem2");
	}

	@Override
	void subject(String semester) {
		// TODO Auto-generated method stub
		if(semester=="1") {
			System.out.println("Maths");
		}
		else if(semester=="2") {
			System.out.println("Physics");
		}
		else {
			System.out.println("Invalid Semester");
		}
	}
	
}
