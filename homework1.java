import java.util.Scanner;


public class homework1 {
    public static void main(String[] args) {
        // 1.	 Write an application that displays a box, an oval, an arrow and a diamond using asterisk (*) as follows: (Hint: System.out.println();)
        System.out.println("------------------------------------------------------------------------");
        System.out.println("   ************          ****             *                *      ");
        System.out.println("   *          *         *    *           ***              ***      ");
        System.out.println("   *          *       *        *        *****           *     *    ");
        System.out.println("   *          *       *        *          *           *         *   ");
        System.out.println("   *          *       *        *          *         *             *  ");
        System.out.println("   *          *       *        *          *           *         *   ");
        System.out.println("   *          *       *        *          *             *     *   ");
        System.out.println("   *          *        *     *            *               ***     ");
        System.out.println("   ************          ****             *                *     ");

        //2.	Write Java statements that accomplish each of the following tasks:
        
        //a.	Display the message “Enter an Integer:”
        System.out.println("\n \n------------------------------------------------------------------------");
        System.out.println(" Enter an Integer: \n");
      

        //b.	Assign the product of variables b and c to variable a.
        int c = 2;
        int b = 1;
        int a = b * c;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("The product of b * c is "+ a + "\n" );

        

        //c.	Use a comment to state that a program performs a sample payroll calculation.
        // THIS PROGRAM IS PERFORMING A SAMPLE CALCULATION!
        System.out.println("------------------------------------------------------------------------");
        System.out.println("THIS PROGRAM IS PERFORMING A SAMPLE CALCULATION! \n");



        // 3.	Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference, quotient (division).

        System.out.println(" \n -----------------------");
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Input the first number");
        int var1 = scan1.nextInt();
        // scan1.nextInt();
        
                System.out.println(" \n -----------------------");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Input the second number");
        int var2 = scan2.nextInt();
        scan2.nextLine();

        int sum = var1 + var2;
        int difference = var1 - var2;
        int quotient = var1 / var2;
        int product = var1 * var2;


        System.out.println(" \n -----------------------");
        System.out.println("The sum of " + var1 + " and " + var2 + " is "  + sum + ".");
        System.out.println(" \n -----------------------");
        System.out.println("The difference of " + var1 + " and " + var2 + " is "  + difference + ".");
        System.out.println(" \n -----------------------");
        System.out.println("The quuotient of " + var1 + " and " + var2 + " is "  + quotient + ".");
        System.out.println(" \n -----------------------");
        System.out.println("The product of " + var1 + " and " + var2 + " is "  + product + ". \n \n");


    }   
}
