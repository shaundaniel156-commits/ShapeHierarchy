public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(
            "001",
            "Java Programming",
            "James Gosling"
        );

        Book b2 = new Book(
            "002",
            "Database Systems",
            "Thomas Connolly"
        );

        Book b3 = new Book(
            "003",
            "Computer Networks",
            "Andrew Tanenbaum"
        );

        Member m1 = new Member(
            "M01",
            "Sarah"
        );

        Member m2 = new Member(
            "M02",
            "Daniel"
        );

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.registerMember(m1);
        library.registerMember(m2);

        System.out.println(
            "===== BEFORE OPERATIONS ====="
        );

        System.out.println(library);

        library.lendBook(b1, m1);

        library.lendBook(b1, m2);

        library.returnBook(b1, m1);

        library.lendBook(b1, m2);

        System.out.println(
            "===== AFTER OPERATIONS ====="
        );

        System.out.println(library);
        
    }
}
