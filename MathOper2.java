import.java.util.*;

class MathOper2 {
	
	static Scanner sc = new Scanner(System.in);	
	public static void main(String EJY[]) {

	int n1 = 0;
	int n2 = 0;

	System.out.println("Enter first number: ");
	n1 = sc.nextInt();

	System.out.println("Enter second number: ");
	n2 = sc.nextInt();

	int Sum, Diff, Quot, Rem;

	System.out.println("Sum is: " + Sum(n1,n2));
	System.out.println("Difference is: " + Diff(n1,n2));
	System.out.println("Quotient is: " + Quot(n1,n2));
	System.out.println("Remainder is: " + Rem(n1,n2));
	}

	static int Sum(int x, int y)  { return x + y; }
	static int Diff(int x, int y) { return x - y; }
	static int Quo(int x, int y)  { return x / y; }
	static int Rem(int x, int y)  { return x % y; }
}
