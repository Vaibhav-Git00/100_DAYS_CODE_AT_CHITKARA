import java.util.Arrays;

public class oops_concept {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String num = s.replaceAll("[a-zA-Z]", " ").replaceAll("\\s+", " ").trim(); 
        String nu = s.replaceAll("[a-zA-Z]", " ").trim(); 
        String[] str = num.split(" ");
        System.out.println(nu);
        System.out.println(num);
        System.out.println(Arrays.toString(str));
    }
}
