import java.util.*;

class HelloDOS { 
    
    static int n1, n2;
    static Scanner sc = new Scanner(System.in);
    static int Sum(int x, int y) {    
    //Can also put the static int inside public static void.
        return x + y;
    }   
    
    public static void main(String EarlY[]) {
        System.out.println("Welcome to Java!");
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();
        System.out.println("Sum = " + Sum(n1,n2));
    }
}



