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
        this.ageOut = age;
    }
}