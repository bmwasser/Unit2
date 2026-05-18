public class Millionaire {

    public static void main(String[] args){
    calcMillionaireUnitTest();
    }

    public static int calcMillionaire(double annualDeposit, double intRate){
        double targetPrice = 1000000;
        double balance = 0.0;
        int years = 0;
        while (balance < targetPrice){
            balance = balance + annualDeposit;
            balance = balance * (1 + intRate / 100);
            years++;
        }
        return years;
    }

    public static void calcMillionaireUnitTest(){
        System.out.println("$1000/yr @ 0% = 1000 years:  " + (calcMillionaire(1000, 0)==1000));
        System.out.println("$5000/yr @ 0% = 200 years:  " + (calcMillionaire(5000, 0)==200));
        System.out.println("$1000/yr @ 0.5% = 359 years:  " + (calcMillionaire(1000, 0.5)==359));
        System.out.println("$5000/yr @ 0.5% = 139 years:  " + (calcMillionaire(5000, 0.5)==139));
        System.out.println("$1000/yr @ 4% = 94 years:  " + (calcMillionaire(1000, 4)==94));
        System.out.println("$5000/yr @ 4% = 56 years:  " + (calcMillionaire(5000, 4)==56));
        System.out.println("$1000/yr @ 8% = 57 years:  " + (calcMillionaire(1000, 8)==57));
        System.out.println("$5000/yr @ 8% = 36 years:  " + (calcMillionaire(5000, 8)==36));    
    }

}