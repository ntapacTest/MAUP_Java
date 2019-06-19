package library;

public class TestLibrary {
    public static void main(String[] args) {
        Library lib = new Library(10);
        lib.add(new Book("Book5", "Author6", 2010));
        lib.add(new Book("Book1", "Author1", 2001));
        lib.add(new Book("Book2", "Author2", 2002));
        lib.add(new Book("Book3", "Author3", 2013));
        lib.add(new Book("Book4", "Author1", 2004));
        lib.add(new Book("Book1", "Author5", 2005));
//        lib.add(new Book("Book6", "Author6", 2006));
//        lib.add(new Book("Book7", "Author7", 2007));
//        lib.add(new Book("Book8", "Author8", 2008));
//        lib.add(new Book("Book9", "Author9", 2009));

        lib.printAll();

        BookByNameComparator nameComp=new BookByNameComparator();
        BookByAuthorComparator authorComp=new BookByAuthorComparator();

        lib.sort(null);
        lib.printAll();

        lib.sort(Library.BY_AUTHOR);
        lib.printAll();

        lib.sort(Library.BY_NAME);
        lib.printAll();

    }
}
