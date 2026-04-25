package assignment7;

class Book
{
	String title;
    String author;
    
    final int ISBN = 12345;          // Final variable
    static String libraryName = "City Library";   // Static variable
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    String getDescription() {
        return "This is a physical book.";
    }
    static void showLibrary() {
        System.out.println("Library: " + libraryName);
    }
}

class EBook extends Book {
    String fileSize;

    // Constructor using super
    EBook(String title, String author, String fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
    void display() {
        super.display();
        System.out.println("File Size: " + fileSize);
    }
    String getDescription() {
        return "This is an electronic book.";
    }
}
public class Assignment1 {
	 public static void main(String[] args) {

	        // Question 1
	        EBook b1 = new EBook("Atomic Habits", "James Clear", "5MB");
	        b1.display();

	        System.out.println();
	     // Question 2
	        Book b2 = new Book("Book1", "Author1");
	        EBook b3 = new EBook("Book2", "Author2", "10MB");

	        System.out.println(b2.getDescription());
	        System.out.println(b3.getDescription());

	        System.out.println();

	        // Question 3
	        Book.showLibrary();

	        System.out.println();

	        // Question 4
	        System.out.println("ISBN: " + b1.ISBN);

	     // b1.ISBN = 99999;   // Error: cannot assign value to final variable

}
}
