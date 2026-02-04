import java.util.Scanner;

class PE02EJY {
    public static void main(String EJY[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int itgr = sc.nextInt();
        
        if(itgr > 0) {
        System.out.println("POSITIVE");
         } else if(itgr < 0) {
        System.out.println("NEGATIVE");
            } else {    
        System.out.println("ZERO");
        }        
    }    
}

/*
Name: Earl Jervis B. Ybanez
Section: BSIT 1D-G1
Description: Write a java program that will accept an integer number display if the number is POSITIVE, NEGATIVE, or ZERO.
*/ 
