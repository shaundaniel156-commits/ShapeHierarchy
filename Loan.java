import java.time.LocalDate;

public class Loan {

    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Loan(Book book, Member member,
                LocalDate borrowDate,
                LocalDate dueDate) {

        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return member.getName() +
               " borrowed " +
               book.getTitle() +
               " on " +
               borrowDate +
               " due " +
               dueDate;
    }
}
