import java.util.HashMap;

public class reverseInteger {
    public static int reverseIntegers(int number) {
        int temp = number;
        int ans = 0;
        String result = "";
        int divider = 10;
        int diff = 0;
        int length = String.valueOf(number).length();
        if (number < 0){
            number = -number;
            length = length -1;
        }
        while(result.length()<length){
            diff = number % divider;
            result += number % divider;
            number = (number - diff * divider/10)/10;
           
            
        }
       
       int fresult = Integer.valueOf(result);
       if (temp < 0){
        fresult = - fresult;
       }
        return fresult;
        
    }
    public static void main(String[] args) {
        System.out.println(new reverseInteger().reverseIntegers(-122));
    }
}
