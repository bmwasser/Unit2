public class Rectangle{

    public static void main(String[] args) {
        rectangleMaker(5,11);
    }

    public static void rectangleMaker(int rows, int cols){
        for (int y = 1; y <= rows; y++){
           for (int x = 1; x <= cols; x++){
                if (x == 1 || x == cols || y == 1 || y == rows){
                  System.out.print("X");  
                } else {
                    System.out.print(" ");
                }
                
           }
           System.out.println();
        }
    }


}