package assignment;

public class ExamHallSeatChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        // Compare every seat number against every other seat number
        for (int i = 0; i < seatNumbers.length; i++) {
            // Check if seatNumbers[i] has already been printed as a duplicate
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check for duplicate in remaining elements
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break; // Break inner loop to avoid multiple prints for the same number
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] test1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(test1);

        int[] test2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(test2);
    }
}