package practise;

public class LibraryBook {
    private String title;
    private String isbn;

    // Constructor with title and isbn
    public LibraryBook(String title, String isbn) {
        this.title = title;
        if (isbn == null || isbn.trim().isEmpty()) {
            this.isbn = "PENDING";
        } else {
            this.isbn = isbn;
        }
    }

    // Constructor chaining using this()
    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    public void displayStatus() {
        System.out.println(this.title + " | " + this.isbn + " | Catalogued: true");
    }

    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        for (int i = 0; i < titles.length; i++) {
            LibraryBook book = new LibraryBook(titles[i], isbns[i]);
            book.displayStatus();
        }
    }
}