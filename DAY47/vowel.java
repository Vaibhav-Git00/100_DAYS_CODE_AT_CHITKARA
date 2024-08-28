import java.util.*;

public class vowel {
    public static long countVowels(String word) {
        long n = word.length();
        long sum = 0;
        List<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        for (int i = 0; i < n; i++) {
            if (vowel.contains(word.charAt(i))) {
                sum += (i + 1) * (n - i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "aba"; // Correct string initialization
        long result = countVowels(s); // Call the countVowels method directly without an instance
        System.out.println(result); // Print the result
    }
}
