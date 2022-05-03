package lj.diploma;

class Semester1{
	
	void sem1() {
		System.out.println("Semester 1");
	}
	
}

class Semester2 extends Semester1{
	
	void sem2() {
		System.out.println("Semester 2");
	}
	
}

class Semester3 extends Semester2{
	
	void sem3() {
		System.out.println("Semester 3");
	}
	
}

class Semester4 extends Semester3{
	
	void sem4() {
		System.out.println("Semester 4");
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Semester1 s1 = new Semester1(); s1.sem1();
		 */
		
		Semester4 s2 = new Semester4();
		s2.sem4();
		s2.sem3();
		s2.sem2();
		s2.sem1();
		
	}

}
