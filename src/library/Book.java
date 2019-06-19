package library;

public class Book implements Comparable<Book> {
    String name;
    String author;
    int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        if(this.year>other.year) return 1;
        if(this.year<other.year) return -1;
        if(this.year==other.year) return 0;
        return 0;
    }
}
