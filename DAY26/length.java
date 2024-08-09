// public class length {

//     // Recursive function to find the length of a string
//     public static int recursiveLength(String str) {
//         // Base case: if the string is empty, return 0
//         if (str.isEmpty()) {
//             return 0;
//         }
//         // Recursive case: return 1 plus the length of the string without the first character
//         return 1 + recursiveLength(str.substring(1));
//     }

//     public static void main(String[] args) {
//         String input = "hello";
//         int length = recursiveLength(input);
//         System.out.println("The length of the string \"" + input + "\" is: " + length);
//     }
// }



// public class length {
//     public static int count(String str){
//         if(str.isEmpty()) return 0;
//         return 1+count(str.substring(1));
//     }

//     public static void main(String[] args) {
//         String input="hello";
//         int length=count(input);
//         System.out.println(length);
//     }
// }
















public class length {
    public static String scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        // Convert score to a character based on its ASCII value
        char resultChar = (char) score;
        return Character.toString(resultChar);
    }

    public static void main(String[] args) {
        String str = "zaz";
        System.out.println(scoreOfString(str));
    }
}




