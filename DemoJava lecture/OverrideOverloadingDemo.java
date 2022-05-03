package lj.diploma;

class Attendence{
	
	void attendence(String firstName,String middleName,String lastName,int roll) {
		System.out.println(firstName+" "+middleName+" "+lastName+" "+roll);
	}
	
	void attendence(String firstName,String lastName,int roll) {
		System.out.println(firstName+" "+lastName+" "+roll);
	}
	
}

public class OverrideOverloadingDemo extends Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendence a = new OverrideOverloadingDemo();
		a.attendence("John", "F", "Pet", 1);
		a.attendence("John","Pet",2);
		a.attendence("John","Demo","Pet",3);
	}

}
