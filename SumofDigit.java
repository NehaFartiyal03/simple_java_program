public class sumofDigit {
    public static void main(String[] args) {
        int num = 133;
        int sum = 1; 
        while(num!=1){
            int lastdigit = num % 10;
        sum = sum * lastdigit;
        num = num /10; 
        }
        System.out.println(sum);
    }
    
}
