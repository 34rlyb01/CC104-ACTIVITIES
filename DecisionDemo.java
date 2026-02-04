import java.util.*;

class DecisionDemo {

    public static void main(String EarlY[]) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Input your grade: ");
        double grade = sc.nextDouble();    

        if (grade > 74.4)
        System.out.println("You passed!");
        else
        System.out.println("You failed...");

        if (grade > 89) //if (grade < 101 && grade > 89)
        System.out.println("EXCELLENT");
        else if (grade > 79)
        System.out.println("VERY GOOD");
        else if (grade > 74)
        System.out.println("GOOD");
        else
        System.out.println("POOR");
    
            int day = 2;
            switch(day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
        }
    }
}


/* 
100-90      =   EXCELLENT
89-80       =   VERY GOOD
79-75       =   GOOD
74-BELOW    =   POOR
*/
