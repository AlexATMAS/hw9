public class StartBook {
    public static void main(String[] args) {
        Author author1 = new Author("Alex","Добров");
        Author author2 = new Author("Anna","Коренина");
        Author author3 = new Author("Anna","Коренина");

        Book book1 = new Book(2020,author1,"Тени");
        Book book2 = new Book(2012,author2,"Рассвет");
        Book book3 = new Book(2012,author2,"Рассвет");
        Book book4 = new Book(2012,author2,"Рассвеет");

        /*System.out.println("Изначальный год выпуска книги2 : " + book2.getAgeOut());
        book2.setAgeOut(2055);
        System.out.println("Измененный год выпуска книги2 : " + book2.getAgeOut());
        System.out.println("Имя автора книги1 = " + book1.getNameWriter());*/

        ////////////////////////////////////////////////////////////////////////////

        System.out.println(book1);

        System.out.println(author1.equals(author2)); // false
        System.out.println(author2.equals(author3)); // true

        System.out.println(book1.equals(book2)); // false
        System.out.println(book2.equals(book3)); // true

        System.out.println(book2.hashCode()); // 439030467
        System.out.println(book3.hashCode()); // 439030467

        System.out.println(book4.hashCode()); // 107182836





    }
}