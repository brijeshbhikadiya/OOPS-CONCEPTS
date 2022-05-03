package lj.diploma;

public class PatternDemo {
	
	public static void main(String[] args) {
		System.out.println("Pattern 1 : ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 2");
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 3");
		for(int i=0;i<5;i++) {
			for(int space =0;space<5-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 4");
		for(int i=5;i>0;i--) {
			for(int space =0;space<5-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 5");
		for(int i=0;i<5;i++) {
			for(int space =0;space<5-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 6");
		for(int i=5;i>0;i--) {
			for(int space =0;space<5-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)-1;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}

}
