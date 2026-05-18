public class Random{

    public static void main(String[] args) {
     for (int i = 1; i < 10; i++){
        System.out.println(getLcgNum(10));
     }


    }

    public static int getLcgNum(int range){
        long seed = (((System.nanoTime() / 10) / 10));
        final long a = 1664525;
        final long c = 1013904223;
        final long m = 4294967296L;
        seed = (a * seed * c) % m; 
        return (int) (Math.abs(seed) % range);
    }


}