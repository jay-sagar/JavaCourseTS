package September.Week4.Batch.OOPS.DiwaliHW.LibraryManagement;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book (String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.ISBN;
    }

}