package assignment;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyReporter {

    public static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            // Check if the word is in the stop-words array
            boolean isStopWord = false;
            for (String stop : stopWords) {
                if (stop.equals(word)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }

        // Print frequency from highest to lowest by finding the maximum count repeatedly
        while (!counts.isEmpty()) {
            String maxWord = null;
            int maxCount = -1;

            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxWord = entry.getKey();
                }
            }

            System.out.println(maxWord + ": " + maxCount);
            counts.remove(maxWord);
        }
    }

    public static void main(String[] args) {
        String input = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(input);
    }
}