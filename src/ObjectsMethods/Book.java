package ObjectsMethods;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int year;
    public Book(String bookName,  Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Книга: " + bookName  + ", " + author + ", год издания: " + year;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return year == book.year && Objects.equals(bookName, bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, year);
    }

}
