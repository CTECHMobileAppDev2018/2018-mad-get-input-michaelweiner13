public class AddInput { 
    public static void main(String[] args) {
    
        // Advanced section (once you get the sum working):
        // If you want to make sure that the user entered EXACTLY two integers, you need to get the number of inputs
        // The variable "args" holds all of the arguments that were passed into this program
        // The variable "args" is called an "array" because it's actually a list of items
        // If you good "How to get the number of items in an array in Java", you should be able to figure out how many integers there are in the variable "args"
        
        boolean isInt1 = false;
        boolean isInt2 = false;
      
        try { 
            // checking valid integer using parseInt() method 
            Integer.parseInt(args[0]); 
            isInt1 = true; 
        }  
        catch (NumberFormatException e) { 
            isInt1 = false; 
        } 
        
        try { 
            // checking valid integer using parseInt() method 
            Integer.parseInt(args[1]); 
            isInt2 = true; 
        }  
        catch (NumberFormatException e) { 
            isInt2 = false; 
        } 
        
        if (args.length != 2 || isInt1 == false || isInt2 == false) {
            System.out.println("You must enter exactly two integers! No letters or symbols. Numbers only (ex: 1 2).");
        } else {
          // **** START HERE: ****
          // These two lines will get you the first two arguments 
          int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
          int sum = a + b;
        
          // Print out "The sum of _ and _ is _" where you actually print the numbers they enter and the sum
          System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        }
    }
}
