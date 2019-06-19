package library;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;
    int bookCount;
    public static final Comparator<Book> BY_NAME;
    public static final Comparator<Book> BY_AUTHOR;
    public static final Comparator<Book> BY_YEAR;

    static {
        BY_NAME=new BookByNameComparator();
        BY_AUTHOR=new BookByAuthorComparator();
        BY_YEAR=null;
    }


    public Library(int booksCount) {
        books=new Book[booksCount];
        bookCount=-1;
        //BY_NAME=new BookByNameComparator();
        //BY_AUTHOR=new BookByAuthorComparator();
    }

    public void add(Book book){
        books[++bookCount]=book;
    }

    public void printAll(){
        System.out.println("#######################");
        for (int i = 0; i <= bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    public int getCurrentCounter() {
        return bookCount;
    }

    public void sort(Comparator<Book> comparator){
        Arrays.sort(books,0,bookCount+1,comparator);
    }

}
