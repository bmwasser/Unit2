public class BooleanLogicExercises {
    
    public static void main (String[] args) {
        System.out.println(isLeapYear(2024)); //true
        System.out.println(isLeapYear(2025)); //false
        System.out.println(isLeapYear(2000)); //true
        System.out.println(isLeapYear(2100)); //false
        unitTestIsThirteen();
}

    public static boolean isLeapYear(int year){
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0)){
            return false;
        } else if (year % 400 == 0){
            return true;
        } else if (year % 4 == 0){
            return true;
        } else {
            return false;
        }    
    }

    public static boolean isThirteen(int month, int day, int year){
        if (year <= 2012 && month <= 9 && day <= 25){
            return true;
        } else if (year <= 2012 && month < 9 && day <= 31){
            return true;
        } else if (year <= 2011){
            return true;
        } else{ 
            return false;
        }
        
    }

      public static void unitTestIsThirteen() {
        // input current month, day, year here
        final int DAY = 25;
        final int MONTH = 9;
        final int YEAR = 2025;
        System.out.println("Do the actual and expected results match?");
        // actual result expected result
        System.out.println("Birthday in next year:");
        System.out.print(">m >d >y: ");
        System.out.println(isThirteen(MONTH + 1, DAY + 1, YEAR - 12) == false);
        System.out.print(" <m >d >y: ");
        System.out.println(isThirteen(MONTH - 1, DAY + 1, YEAR - 12) == false);
        System.out.print(" =m >d >y: ");
        System.out.println(isThirteen(MONTH, DAY + 1, YEAR - 12) == false);

        System.out.print(" >m <d >y: ");
        System.out.println(isThirteen(MONTH + 1, DAY - 1, YEAR - 12) == false);
        System.out.print(" <m <d >y: ");
        System.out.println(isThirteen(MONTH - 1, DAY - 1, YEAR - 12) == false);
        System.out.print(" =m <d >y: ");
        System.out.println(isThirteen(MONTH, DAY - 1, YEAR - 12) == false);

        System.out.print(" >m =d >y: ");
        System.out.println(isThirteen(MONTH + 1, DAY, YEAR - 12) == false);
        System.out.print(" <m =d >y: ");
        System.out.println(isThirteen(MONTH - 1, DAY, YEAR - 12) == false);
        System.out.print(" =m =d >y: ");
        System.out.println(isThirteen(MONTH, DAY, YEAR - 12) == false);

        System.out.println("Birthday in previous year:");
        System.out.print(" >m >d <y: ");
        System.out.println(isThirteen(MONTH + 1, DAY + 1, YEAR - 14) == true);
        System.out.print(" <m >d <y: ");
        System.out.println(isThirteen(MONTH - 1, DAY + 1, YEAR - 14) == true);
        System.out.print(" =m >d <y: ");
        System.out.println(isThirteen(MONTH, DAY + 1, YEAR - 14) == true);

        System.out.print(" >m <d <y: ");
        System.out.println(isThirteen(MONTH + 1, DAY - 1, YEAR - 14) == true);
        System.out.print(" <m <d <y: ");
        System.out.println(isThirteen(MONTH - 1, DAY - 1, YEAR - 14) == true);
        System.out.print(" =m <d <y: ");
        System.out.println(isThirteen(MONTH, DAY - 1, YEAR - 14) == true);

        System.out.print(" >m =d <y: ");
        System.out.println(isThirteen(MONTH + 1, DAY, YEAR - 14) == true);
        System.out.print(" <m =d <y: ");
        System.out.println(isThirteen(MONTH - 1, DAY, YEAR - 14) == true);
        System.out.print(" =m =d <y: ");
        System.out.println(isThirteen(MONTH, DAY, YEAR - 14) == true);

        System.out.println("Birthday in this year:");
        System.out.print(" >m >d <y: ");
        System.out.println(isThirteen(MONTH + 1, DAY + 1, YEAR - 13) == false);
        System.out.print(" <m >d <y: ");
        System.out.println(isThirteen(MONTH - 1, DAY + 1, YEAR - 13) == true);
        System.out.print(" =m >d <y: ");
        System.out.println(isThirteen(MONTH, DAY + 1, YEAR - 13) == false);

        System.out.print(" >m <d <y: ");
        System.out.println(isThirteen(MONTH + 1, DAY - 1, YEAR - 13) == false);
        System.out.print(" <m <d <y: ");
        System.out.println(isThirteen(MONTH - 1, DAY - 1, YEAR - 13) == true);
        System.out.print(" =m <d <y: ");
        System.out.println(isThirteen(MONTH, DAY - 1, YEAR - 13) == true);

        System.out.print(" >m =d <y: ");
        System.out.println(isThirteen(MONTH + 1, DAY, YEAR - 13) == false);
        System.out.print(" <m =d <y: ");
        System.out.println(isThirteen(MONTH - 1, DAY, YEAR - 13) == true);
        System.out.print(" =m =d <y: ");
        System.out.println(isThirteen(MONTH, DAY, YEAR - 13) == true);

    }
}