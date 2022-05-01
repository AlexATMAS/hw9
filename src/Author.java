import java.util.Objects;

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


    @Override
    public String toString() {                      /// уже был реализован
        return nameWriter + " " + surnameWriter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameWriter, author.nameWriter) && Objects.equals(surnameWriter, author.surnameWriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameWriter, surnameWriter);
    }
}