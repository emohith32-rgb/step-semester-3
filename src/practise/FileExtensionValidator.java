package practise;

public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex != -1 && dotIndex < filename.length() - 1) {
            String extension = filename.substring(dotIndex + 1);

            if (extension.equalsIgnoreCase("pdf") || 
                extension.equalsIgnoreCase("docx") || 
                extension.equalsIgnoreCase("zip")) {
                return "Accepted";
            }
        }

        return "Rejected \u2014 invalid file type";
    }

    public static void main(String[] args) {
        System.out.println(validateFileExtension("Assignment1.PDF"));
        System.out.println(validateFileExtension("notes.txt"));
    }
}