public class WhileWarmUp40 {

    /*
    4.1 while Loops 1.B  Determine code that would be used to 
    complete code segments. 
        2.B  Determine the result or output based on 
            statement execution order in a code segment 
            without method calls (other than output).
        3.C  Write program code to satisfy method 
            specifications using expressions, conditional 
            statements, and iterative statements
    */

    
    public static void main(String[] args) {
        /*
        4.1 #40 WARM-UP ASSIGNMENT
        Write a while loop that prints the numbers 1 through 5 on the same line with each number separated by a space.
        Once the number 5 is printed, the word "Done" should be printed on the next line. You should include the main method
        header and the opening and closing curly braces for the main method. Do not include the class header.
        */

        int x = 1;

        while (x < 6) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println();
        System.out.println("Done");
    }
}