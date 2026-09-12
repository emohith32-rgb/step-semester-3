package assignment;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int matchedCount = 0;
        int totalChars = original.length();
        int firstMismatchPos = -1;
        char origChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < totalChars; i++) {
            char c1 = original.charAt(i);
            char c2 = typed.charAt(i);

            if (c1 == c2) {
                matchedCount++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based position indexing
                origChar = c1;
                typedChar = c2;
            }
        }

        double accuracy = ((double) matchedCount / totalChars) * 100;

        StringBuilder output = new StringBuilder();
        output.append(String.format("Matched: %d/%d | Accuracy: %.2f%% | ", matchedCount, totalChars, accuracy));

        if (firstMismatchPos != -1) {
            output.append(String.format("First Mismatch at position %d ('%c' vs '%c')", firstMismatchPos, origChar, typedChar));
        } else {
            output.append("No Mismatches");
        }

        System.out.println(output.toString());
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}