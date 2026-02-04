import java.util.*;

public class GradeAnalyzer {
	public static void main(String EJY[]) {
		Scanner sc = new Scanner(System.in);

	int[] grades = new int[5];
	
	int sum = 0;

	System.out.println("Enter 5 grades: ");

	for(int num = 0; num < grades.length; num++) {
		System.out.print("Grade: ");
		int grade = sc.nextInt();

		grades[num] = grade;
		sum += grade;
		}
		
	int highest = grades[0];
	
	for(int grade : grades) {
		if (grade > highest) {
			highest = grade;
			}
		}

	double average = (double) sum / grades.length;

	System.out.println("Average Grade: " + average);
	System.out.println("Highest Grade: " + highest);
	}
}
		