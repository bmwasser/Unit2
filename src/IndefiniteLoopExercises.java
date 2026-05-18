import java.util.Scanner;

@SuppressWarnings("resource")
public class IndefiniteLoopExercises {
    
    public static void main(String[] args) {
        System.out.println(haveThree(2430));
        int a = getUserInput("Enter any integer: ");
        System.out.println(a);
        System.out.println(squareRoot(16));
    }


    public static boolean haveThree(int x){
        if (x < 0) {
            x = Math.abs(x);
        }

        while (x > 0) {
            int lastDigit = x % 10; 
            if (lastDigit == 3) {
                return true; 
            }
            x /= 10; 
        }
        return false;
            
    }

    public static int getUserInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        while ( !in.hasNextInt() ){
            System.out.println("Invalid Input. Enter an integer.");
            in.next();
        }
        int reply = in.nextInt();
        return reply;    
    }

    public static double squareRoot(double a){
        double x0 = 0;
        double x1 = a / 2;
        while (Math.abs(x1 - x0) > 0.0001){
            x0 = x1;
            x1 = (x0 + a / x0) / 2;
        }
        return x1;
    }
}

