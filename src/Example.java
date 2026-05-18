public class Example{
  
  
    public static void main (String[] args) {
   
   
    }


    public static void primeAvg(){
        int amount = 0;
        int numPrime = 0;
        for (int k = 1; k <= 100; k++){
            if (isPrime(k) == true){
                numPrime += k;
                amount++;
            }
        }
        int average = numPrime / amount;
        System.out.println(average);
    }
    
    
    
    
    
    public static boolean isPrime(int n){
        for (int k = 2; k < n; k++){
            if (n % k == 0){
                return false;
        }
       
       
    }
    return true;

    }


}

  
