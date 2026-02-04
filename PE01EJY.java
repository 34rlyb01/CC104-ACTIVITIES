import java.util.Scanner;

class PE01EJY {
    public static void main(String EJY[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int itgr = sc.nextInt();
        
        if(itgr % 2 == 0) {
        System.out.println("EVEN");
            } else {    
        System.out.println("ODD");
        }        
    }    
}

/*
Name: Earl Jervis B. Ybanez
Section: BSIT 1D-G1
Description: Write a java program that will accept an integer number display if the number is ODD or EVEN.
*/ 
