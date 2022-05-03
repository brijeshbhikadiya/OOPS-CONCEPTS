//there are three type of constructor..
/*1.empty constructor
2.parameter constructor
3.copy constructor
*/

//constructor means it is method...


package lj.diploma;

class Student{

	String sMessage;
	
	Student(){
		sMessage = "Empty/Default Constructor";
	}
	
	Student(String sMessage){
		this.sMessage = sMessage;
	}
	
	Student(String sName,int roll){
		this.sMessage = sName+" "+roll;
	}

	Student(Student s){
		sMessage = s.sMessage;
	}
	
	void displayMessage() {
		System.out.println(sMessage);
	}
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Student sEmpty = new Student();       //class name objectname = new constructor name(arguments);  
		sEmpty.displayMessage();
		
		Student sParams = new Student("Good Evening");
		sParams.displayMessage();
		
		Student sParams1 = new Student("John",123);
		sParams1.displayMessage();
		
		Student sParams2 = new Student("Richard",7875);
		sParams2.displayMessage();
		
		Student sParams3 = new Student("How Are You?");
		sParams3.displayMessage();
		
		Student sParams4 = new Student(sParams1);
		sParams4.displayMessage();
		
		Student sParams5 = new Student(sParams3);
		sParams5.displayMessage();
		
	}
	
}
