public class Power {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power(x,n/2);
        int halfPowerSquare = halfPower * halfPower;
        if(n%2 != 0){
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }
    
    public static int power2(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power2(x, n-1);
        int xn = x * xnm1;
        return xn;
        // return x * power(x, n-1); 
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 20;
        System.out.println(power(x, n));
    }
}
