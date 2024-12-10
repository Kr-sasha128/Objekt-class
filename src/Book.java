import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearOfTheBook;


    public Book(String bookName, Author author, int yearOfTheBook) {
        this.author = author;
        this.bookName = bookName;
        this.yearOfTheBook = yearOfTheBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getauthor(String name, String surname) {
        return this.author;
    }

    public int getyearOfTheBook() {
        return this.yearOfTheBook;
    }

    public void setYearOfTheBook(int yearOfTheBook) {
        this.yearOfTheBook = yearOfTheBook;
    }

//    public String getBookInfo() {
//        return bookName + author.getFullname() + yearOfTheBook;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfTheBook == book.yearOfTheBook && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfTheBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", yearOfTheBook=" + yearOfTheBook +
                '}';
    }
}