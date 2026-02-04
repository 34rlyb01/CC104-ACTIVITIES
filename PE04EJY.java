import java.util.Scanner;

class PE04EJY {
    public static void main(String EJY[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int N1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int N2 = sc.nextInt();
        System.out.print("Enter your third number: ");
        int N3 = sc.nextInt();
  
               
        if (N1 > N2 && N3 < N1) {
        System.out.println("First number is the highest with: " +N1);
            } else if (N2 > N1 && N3 < N2) {
        System.out.println("Second number is the highest with: " +N2);
            } else {
        System.out.println("Third number is the highest with: " +N3);
            }    
        }        
    }    


/*
Name: Earl Jervis B. Ybanez
Section: BSIT 1D-G1
Description: Write a java program that will accept three integer numbers, display the highest among the three numbers.
*/ 
