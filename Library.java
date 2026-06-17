import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public Book searchBookByTitle(String title) {

        for (Book book : books) {

            if (book.getTitle()
                .equalsIgnoreCase(title)) {

                return book;
            }
        }

        return null;
    }

    public void lendBook(Book book, Member member) {

        if (!book.isAvailable()) {

            System.out.println(
                "Loan rejected. The book is already on loan."
            );

            return;
        }

        Loan loan = new Loan(
            book,
            member,
            LocalDate.now(),
            LocalDate.now().plusDays(14)
        );

        member.addLoan(loan);
        book.setAvailable(false);

        System.out.println(
            book.getTitle() +
            " has been lent to " +
            member.getName()
        );
    }

    public void returnBook(Book book, Member member) {

        Loan foundLoan = null;

        for (Loan loan : member.getLoans()) {

            if (loan.getBook() == book) {
                foundLoan = loan;
                break;
            }
        }

        if (foundLoan != null) {

            member.removeLoan(foundLoan);
            book.setAvailable(true);

            System.out.println(
                book.getTitle() +
                " returned successfully."
            );
        }
    }

    @Override
    public String toString() {

        String result = "\nBOOKS\n";

        for (Book book : books) {
            result += book + "\n";
        }

        result += "\nMEMBERS\n";

        for (Member member : members) {
            result += member + "\n";
        }

        return result;
    }
}