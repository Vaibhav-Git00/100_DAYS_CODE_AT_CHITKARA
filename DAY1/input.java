import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.next(); //next use only for one word.
        System.out.println(input);
        
        String input1 = sc.nextLine(); //nextline use for all string including space
        System.out.println(input1);

        int input2 = sc.nextInt();
        System.out.println(input2);

        Float input3 = sc.nextFloat();
        System.out.println(input3);
    }
}
