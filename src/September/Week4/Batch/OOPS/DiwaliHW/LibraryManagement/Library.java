package September.Week4.Batch.OOPS.DiwaliHW.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String title) {
        boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));

        if (removed) {
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book: books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found" + title);
        }
    }

    public void displayBooks() {
        System.out.println("Library Collection: ");
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("The great Gatsby", "Jay Sagar", "123467891"));
        lib.addBook(new Book("Harry Potter", "J.K. Rowling", "87654421"));
        lib.addBook(new Book("The Greatest Pianist", "Beethoven", "31241412"));

        lib.displayBooks();

        lib.searchBook("Harry Potter");
        lib.removeBook("The great Gatsby");

        lib.displayBooks();
    }

}
