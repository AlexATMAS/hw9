public class StartBook {
    public static void main(String[] args) {
        Author author1 = new Author("Alex","Добров");
        Author author2 = new Author("Anna","Коренина");

        Book book1 = new Book(2020,author1);
        Book book2 = new Book(2012,author2);

        System.out.println("Изначальный год выпуска книги2 : " + book2.getAgeOut());
        book2.setAgeOut(2055);
        System.out.println("Измененный год выпуска книги2 : " + book2.getAgeOut());
        System.out.println("Имя автора книги1 = " + book1.getNameWriter());


        System.out.println(book1);
    }
}