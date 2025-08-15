/* 8/14/2025 */
public class power_of_three {
    public static void main(String[] args){

        // problem number --> issue with rounding so this is why I do the <=1e-10
        System.out.println(isPowerOfThree(243));
    }
    public static boolean isPowerOfThree(int n) {

         // negative edge case
        if(n<=0)
            return false;
        
        // rules of logs
        double k = Math.log(n) / Math.log(3);

        // round for comparison
        int rounded = (int)Math.round(k);

        // if rounded and k are within 1e-10, it's a power of 3
        if(Math.abs(rounded-k) <= 1e-10)
            return true;
        else
            return false;
    }
}
