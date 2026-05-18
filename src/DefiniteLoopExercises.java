public class DefiniteLoopExercises {
    public static void main(String[] args) {
        System.out.println(calcFactorial(3));
        System.out.println(isPrime(7));
}

    public static int calcFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++ ){
            result = result * i;
        }

        return result;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            } 
        }  
        return true;     //from 2 to largest potential factor of n counting by ones

    }


}
