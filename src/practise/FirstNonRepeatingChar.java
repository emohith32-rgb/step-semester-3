package practise;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequencyArray = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequencyArray[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequencyArray[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void processString(String input) {
        char result = findFirstNonRepeatingChar(input);
        System.out.printf("Input: \"%s\"\n", input);
        if (result != '\0') {
            System.out.printf("Output: First Non-Repeating Character: '%c'\n\n", result);
        } else {
            System.out.println("Output: No Non-Repeating Character Found\n");
        }
    }

    public static void main(String[] args) {
        processString("swiss");
        processString("aabbcc");
    }
}