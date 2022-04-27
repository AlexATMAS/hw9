public class Author {
    private String nameWriter;
    private String surnameWriter;
    public Author(String nameWriter, String surnameWriter) {
        this.nameWriter = nameWriter;
        this.surnameWriter = surnameWriter;
    }
    public String getNameWriter() {
        return this.nameWriter;
    }
    public String getSurnameWriter() {
        return this.surnameWriter;
    }
    public String toString() {
        return "Автор книги : " + nameWriter + " " + surnameWriter;
    }
}