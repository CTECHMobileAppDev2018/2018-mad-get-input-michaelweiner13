public class AddInput { 
    public static void main(String[] args) {
    
        // Advanced section (once you get the sum working):
        // If you want to make sure that the user entered EXACTLY two integers, you need to get the number of inputs
        // The variable "args" holds all of the arguments that were passed into this program
        // The variable "args" is called an "array" because it's actually a list of items
        // If you good "How to get the number of items in an array in Java", you should be able to figure out how many integers there are in the variable "args"
        
        // Creates and initalizes two boolean variabes to report to the program if the array args[] contains all ints by checking the values of args[1] and args[2]
        // This is not done recursivly because a check is in place to make sure the array stores only 2 values
        boolean isInt1 = false;
        boolean isInt2 = false;
        
        // Check the data type of args[0]
        try {  
            
            // Check that args[0] is an int using .parseInt()
            Integer.parseInt(args[0]);
            
            // Set isInt1 to true if no NumberFormatException error is thrown
            isInt1 = true; 
        }  
        catch (NumberFormatException e) { 
            
            // Set isInt1 to false if the first stored element in args[] is not an int
            isInt1 = false; 
        } 
        
        // Check the data type of args[1]
        try { 
            // Check that args[1] is an int using .parseInt()
            Integer.parseInt(args[1]);
            
            // Set isInt2 to true if no NumberFormatException error is thrown
            isInt2 = true; 
        }  
        catch (NumberFormatException e) { 
            //Set isInt2 to false if the second stored element in args[] is not an int
            isInt2 = false; 
        } 
        
        // Check to make sure that isInt1 and isInt2 are both true (both are ints) and that only 2 arguments have been supplied
        // If any one of these three (3) conditions are not true "You must enter exactly two integers! No letters or symbols. Numbers only (ex: 1 2)." is returned to the console
        if (args.length != 2 || isInt1 == false || isInt2 == false) {
            System.out.println("You must enter exactly two integers! No letters or symbols. Numbers only (ex: 1 2).");
        } else {
          // Parses the first and second arguments that haved been provided to the program into two different variables
          int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
            
          // Adds the parsed integers from the initalized variables 'a' and 'b' above  
          int sum = a + b;
        
          // Prints out "The sum of (the first int) + (the second int) + is (the variable 'sum')."
          // Completed using string concatenation
          // Individual numbers and the sum are pulled in from the variables initalized and set on lines 49, 50, and 53
          System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        }
    }
}
