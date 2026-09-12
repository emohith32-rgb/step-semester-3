package practise;

public class CsvStudentParser {

    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNo = fields[1].trim();
        String dept = fields[2].trim();

        System.out.println("Name: " + name + " | Roll No: " + rollNo + " | Dept: " + dept);
    }

    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma, RA2211003010123,CSE");
        parseStudentRecord("Ananya Verma,CSE");
    }
}