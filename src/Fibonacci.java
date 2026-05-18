public class Fibonacci{

    public static void main(String[] args) {
        System.out.println(fibTerm(3));

    }


    public static int fibTerm(int x){
       if (x == 1 || x == 2){
        return 1;
       }
       
       
       int term1 = 1;
       int term2 = 1;
       int sum = 0;
       for (int i = 3; i <= x; i++){
        sum = term1 + term2;
        term1 = term2;
        term2 = sum;
       }
       return sum;
        
    }







}