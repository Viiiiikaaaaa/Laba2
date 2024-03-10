import java.util.Arrays;

public record BookRecord(String title, int numPages, AuthorRecord authorRecord) implements Comparable<BookRecord> {
    public BookRecord(String title, int numPages, AuthorRecord authorRecord) {
        if (numPages <= 0) {
            throw new IllegalArgumentException("Количество страниц не может быть меньше или равно нулю");
        }
        this.title = title;
        this.numPages = numPages;
        this.authorRecord = authorRecord;
    }
    @Override
    public int compareTo(BookRecord o) {
        return title.compareTo(o.title());
    }
    }

