package lj.diploma;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.print("Hello World");
		
		//String i = String.valueOf(1);
		
//		int value1 = 10;
//		int value2 = 33;
//		System.out.println(value1+value2);
		
		int i = 10;
		if(i<=10) {
			System.out.println("Less Than 10");
		}
		else {
			System.out.println("Greater Than 10");
		}
		
		int i1=5;
		switch(i1) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println(i1);
				
		}
		
	}
	
}
