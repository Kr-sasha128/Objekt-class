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

    public String getBookInfo() {
        return bookName + author.getFullname() + yearOfTheBook;
    }
}