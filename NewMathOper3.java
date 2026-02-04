class NewMathOper3 {
	
	public NewMathOper3 {
	
		n1 = 125;
		n2 = 75;
	}
	
	public NewMathOper3(int x, int y) {
	
		n1 = x;
		n2 = y;

	int Sum()  { return x + y; }
	int Diff() { return x - y; }
	int Quo()  { return x / y; }
	int Rem()  { return x % y; }

	void dispSummary() {

		System.out.println("Sum is: " + Sum());
		System.out.println("Difference is: " + Diff());
		System.out.println("Quotient is: " + Quot());
		System.out.println("Remainder is: " + Rem());
	}
}

