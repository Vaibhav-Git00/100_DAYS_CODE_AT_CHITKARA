import java.util.HashMap;
import java.util.Map;

public class convertintostring {
    private static final Map<Integer,String>digittowordmap=new HashMap<>();
    static{
        digittowordmap.put(0, "zero");
        digittowordmap.put(1, "one");
        digittowordmap.put(2, "two");
        digittowordmap.put(3, "three");
        digittowordmap.put(4, "four");
        digittowordmap.put(5, "five");
        digittowordmap.put(6, "six");
        digittowordmap.put(7, "seven");
        digittowordmap.put(8, "eight");
        digittowordmap.put(9, "nine");
    }
    public static String convertowords(int number){ 
        if(number==0) return "";
        int lastdigit=number%10;
         // Recursively call convertToWords with the number excluding the last digit
        String result=convertowords(number/10);
        if (!result.isEmpty()) {
            result += " ";
        }
        result+=digittowordmap.get(lastdigit);
        return result;

    }
    public static void main(String[] args) {
        int number=1947;
        String result=convertowords(number);
        System.out.println(result);
    }
    
}
