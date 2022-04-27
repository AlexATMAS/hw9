public class Book {

    private  int ageOut;
    private String nameWriter;
    public Book(int ageOut, Author nameWriter) {
        this.ageOut = ageOut;
        this.nameWriter = nameWriter.toString();
    }
    public int getAgeOut() {
        return ageOut;
    }
    public String getNameWriter() {
        return  nameWriter;
    }
    public void setAgeOut(int age) {
        ageOut = age;
    }

    public String toString() {
        return "Автор книги : " + nameWriter + "\nГод выпуска : " + ageOut;
    }
}