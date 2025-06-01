public class ArmstrongNo {
    public static void main(String[] args) {
        int num = 153;
        int cpy = nums;
        while(cpy != 0) {
            count++;
            cpy = cpy /10;
        }
        System.out.println(count);
        cpy = num;

        while(cpy != 0){
            int digit = cpy %10;
           sum = sum + (int)Math.pow(digit, count);
           cpy = cpy /10;
        }
        System.out.println(nums = sum? "ArmStrong Number"; "Not an ArmStrong Number");
    }
    
}
