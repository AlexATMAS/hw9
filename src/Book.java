import java.util.Objects;

public class Book {
    private  int ageOut;
    private Author author;
   private String nameBook;
    public Book(int ageOut, Author author,String nameBook) {
        this.ageOut = ageOut;
        this.author = author;
        this.nameBook = nameBook;
    }
    public int getAgeOut() {
        return ageOut;
    }
    public Author getAuthor() {
        return  author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public String getNameWriter() {
        return author.getNameWriter();
    }
    public String getSurNameWriter() {
        return author.getSurnameWriter();
    }

    public void setAgeOut(int age) {
        ageOut = age;
    }


    @Override
    public String toString() {                  /// уже был реализован
        return "Название книги: " + nameBook + "\nГод выпуска : " + ageOut + "\nАвтор произведения: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (ageOut != book.ageOut) return false;
        if (!Objects.equals(author, book.author)) return false;
        return Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        int result = ageOut;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (nameBook != null ? nameBook.hashCode() : 0);
        return result;
    }
}