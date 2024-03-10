import java.util.Objects;

public class Book implements Comparable <Book> {
    private String title;
    private int numPages;
    private Author author;
    public Book(String title, int numPages, Author author){
        this.title = title;
        this.numPages = numPages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "название = '" + title + '\'' +
                ", количество страниц = " + numPages +
                ", автор = " + author.getName() +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numPages == book.numPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, numPages, author);
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
