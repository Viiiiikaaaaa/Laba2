import java.util.Arrays;
import java.util.Comparator;


public class BookDemo {
    public static void main(String[] args) {

        Author author1 = new Author("Шекспир У.");
        Author author2 = new Author("Маяковский В.");
        Author author3 = new Author("Сапане М.");

        Book book1 = new Book("Гамлет",216,author1);
        Book book2 = new Book("Ешь ананасы, рябчиков жуй…",448,author2);
        Book book3 = new Book("Репортаж из морга. Как судмедэксперт заставляет говорить мертвых",352,author3);

        System.out.println("\nСОРТИРОВКА ПО НАЗВАНИЮ");

        Book[] books = new Book[]{book1,book2,book3};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        System.out.println("\nСОРТИРОВКА ПО КОЛИЧЕСТВУ СТРАНИЦ");

        Comparator<Book> byNumPages = new Comparator<Book>(){
           @Override
           public int compare(Book o1, Book o2) {
               return o1.getNumPages() - o2.getNumPages();
           }
        };
        Arrays.sort(books, byNumPages);
        System.out.println(Arrays.toString(books));

        System.out.println("\nСОРТИРОВКА ПО ИМЕНИ АВТОРА");

        Comparator<Book> byAuthor = new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
            }
        };
        Arrays.sort(books, byAuthor);
        System.out.println(Arrays.toString(books));
    };
    }


