public class WhileWarmUp41 {

    /*
    4.1 while Loops 1.B  Determine code that would be used to 
    complete code segments. 
        2.B  Determine the result or output based on 
            statement execution order in a code segment 
            without method calls (other than output).
        3.C  Write program code to satisfy method 
            specifications using expressions, conditional 
            statements, and iterative statements

            Add in the standards for conditionals and modular division.
    */

    
    public static void main(String[] args) {
        /*
        4.1 #41 WARM-UP ASSIGNMENT
        Write a while loop that prints multiples of 5 from the range of numbers 1 through 150 inclusive on separate lines.
        Once the number 150 is printed, the word "Done" should be printed on the next line. You should include the main method
        header and the opening and closing curly braces for the main method. Do not include the class header.
        */

        int x = 1;

        while (x < 151) {
            if (x % 5 == 0) {
                System.out.println(x);
                x++;
            }
            else {
                x++;
            }
            
        }
        System.out.println("Done");
    }
}