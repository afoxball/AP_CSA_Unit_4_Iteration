public class WhileWarmUp41 {
    
    /*
       Write a while loop that iterates over a string and prints each character on a new line.

       Here are some string methods that may be useful: https://www.codecademy.com/learn/apcs-a-deeper-dive-into-classes/modules/apcs-string-methods/cheatsheet

    */
    
    public static void main(String[] args) {
        // Code goes here


        String str = "Hello";
        int i = 0;
        while (i < str.length()) {
            System.out.println(str.substring(i, i+1));
            i++;

        }
        }
    }
}
