import java.util.Scanner;

@SuppressWarnings("resource")
public class Quadratic {

    public static void main(String[] args) {
        int a = getUserInput("Enter the A coefficient: ");
        int b = getUserInput("Enter the B coefficient: ");
        int c = getUserInput("Enter the C coefficient: ");
       
        System.out.println(quadratic(a,b,c));
        
    }

    public static int getUserInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        if ( !in.hasNextInt() ){
            String input = in.next();
            System.out.println(input + " is not integer. Exiting.");
            System.exit(0);
        }
        int reply = in.nextInt();
        return reply;    
    }

    public static int getUserInt(String prompt){
        int value = 0;
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
       if (in.hasNextInt()){
        value = in.nextInt();
       } else {
        System.out.println("Error: " + in.next() + " is not an integer");
        System.out.println("Returning the value of 0");
       }
       in.close();
       return value;


    }

    public static String quadratic(int a, int b, int c){
        if (a==0){
            return "Error, cannot divide by zero";
        }
        
        double discriminant = Math.pow(b,2) - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double plusSolution = (-b + sqrtDiscriminant) / (2 * a);
        double minusSolution = (-b - sqrtDiscriminant) / (2 * a);  
        
        
        if ((Math.pow(b,2) - 4 * a * c) > 0){
            return "Two solutions are present: " + plusSolution + " and " + minusSolution;
        } else if ((Math.pow(b,2) - 4 * a * c) < 0){
            return "No real solutions are present";
        } else {
            return "One distinct solution is present: " + plusSolution; 
        }
    }
        
}

// original quadratic code
//double discriminant = Math.pow(b,2) - 4 * a * c;
// double sqrtDiscriminant = Math.sqrt(discriminant);
// double plusSolution = (-b + sqrtDiscriminant) / (2 * a);
// double minusSolution = (-b - sqrtDiscriminant) / (2 * a);
// String roots = "Root 1: " + plusSolution + " " + "Root 2: " + minusSolution;
// return roots;