public class Author {
    private String nameWriter;
    private String surnameWriter;
    public Author(String nameWriter, String surnameWriter) {
        this.nameWriter = nameWriter;
        this.surnameWriter = surnameWriter;
    }
    public String getNameWriter() {
        return nameWriter;
    }
    public String getSurnameWriter() {
        return surnameWriter;
    }
    public String toString() {
        return nameWriter + " " + surnameWriter;
    }
}