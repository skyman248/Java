package math;

public class MyMathLib {
    public static long factorial(int n) {
        switch (n){
            case 0:
            case 1: return 1;
            case 2: return 2;
            case 3: return 6;
            case 4: return 24;
            case 5: return 120;
            default:
                System.out.println("It's too big for me");
                return 0;
        }
    }

    public static long pow(long x, int n) {
        System.out.println("Too boring...");
        return 0;
    }
}
