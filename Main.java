import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        AuthorRecord authorRecord1 = new AuthorRecord("Шекспир У.");
        AuthorRecord authorRecord2 = new AuthorRecord("Маяковский В.");
        AuthorRecord authorRecord3 = new AuthorRecord("Сапане М.");

        BookRecord bookRecord1 = new BookRecord("Гамлет",216,authorRecord1);
        BookRecord bookRecord2 = new BookRecord("Ешь ананасы, рябчиков жуй…",448,authorRecord2);
        BookRecord bookRecord3 = new BookRecord("Репортаж из морга. Как судмедэксперт заставляет говорить мертвых",352,authorRecord3);

        System.out.println("\nСОРТИРОВКА ПО НАЗВАНИЮ");

        BookRecord[] bookRecords = new BookRecord[]{bookRecord1,bookRecord2,bookRecord3};
        Arrays.sort(bookRecords);
        System.out.println(Arrays.toString(bookRecords));

        System.out.println("\nСОРТИРОВКА ПО КОЛИЧЕСТВУ СТРАНИЦ");

        Comparator<BookRecord> byNumPages = new Comparator<BookRecord>(){
            @Override
            public int compare(BookRecord o1, BookRecord o2) {
                return o1.numPages() - o2.numPages();
            }
        };
        Arrays.sort(bookRecords, byNumPages);
        System.out.println(Arrays.toString(bookRecords));

        System.out.println("\nСОРТИРОВКА ПО ИМЕНИ АВТОРА");

        Comparator<BookRecord> byAuthorRecord = new Comparator<BookRecord>(){
            @Override
            public int compare(BookRecord o1, BookRecord o2) {
                return o1.authorRecord().name().compareTo(o2.authorRecord().name());
            }
        };
        Arrays.sort(bookRecords, byAuthorRecord);
        System.out.println(Arrays.toString(bookRecords));
    }
}
