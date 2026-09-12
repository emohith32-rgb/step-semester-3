package practise;

public class TransactionReferenceValidator {

    public static String normalizeReference(String raw) {
        if (raw == null) return "";
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed.toUpperCase();

        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: remaining 11 characters must be digits";
            }
        }

        String bankCode = reference.substring(0, 3);
        String day = reference.substring(3, 5);
        String month = reference.substring(5, 7);
        String year = reference.substring(7, 9);
        String seq = reference.substring(9);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(bankCode).append("] DATE: ")
          .append(day).append("/").append(month).append("/").append(year)
          .append(" | SEQ: ").append(seq);

        return sb.toString();
    }

    public static void main(String[] args) {
        String raw1 = "  hdf03022600042 ";
        String norm1 = normalizeReference(raw1);
        System.out.println(validateAndFormat(norm1));

        String raw2 = "12F03022600042";
        String norm2 = normalizeReference(raw2);
        System.out.println(validateAndFormat(norm2));
    }
}