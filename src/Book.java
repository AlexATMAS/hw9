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
    public String toString() {
        return "Название книги: " + nameBook + "\nГод выпуска : " + ageOut + "\nАвтор произведения: " + author;
    }
}