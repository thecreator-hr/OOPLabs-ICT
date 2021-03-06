import java.util.Scanner;


public class q2 {
	
	/*
	 * Logic -
	 * Take in inputs in main then call the calculator method giving it the arguments of two numbers and the operator
	 * put the operator in the switch case where do the respective operations and if the char is not in +\-\*\/
	 * skip the function and return -1 instead
	 * method call is in a do while loop in main method where the method is called atleast once and will terminate if the
	 * answer to the question Do you want to continue is given false.
	 */
	
	static float calculator(float a, float b, char c) {
		
		switch(c)
		{
		case '+': return a + b;
		case '-': return a - b;
		case '/': return a / b;
		case '*': return a * b;
		default: return -1;
		}
		
	}

	public static void main(String[] args) {
		float a, b;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		boolean toContinue = true;
		char con ;
		
		do {
			System.out.print("Enter A: ");
			a = sc.nextFloat();
			System.out.print("Enter B: ");
			b = sc.nextFloat();
			System.out.print("Enter the operator: ");
			ch = sc.next().charAt(0);
			System.out.println(calculator(a, b, ch));
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.next().charAt(0);
			if(ch == 'n') {
				toContinue = false;
			}
			
		} while(toContinue);
	}

}
