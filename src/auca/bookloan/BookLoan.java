package auca.bookloan;

import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;
import auca.librarybook.LibraryBook;
import auca.student.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class BookLoan implements Identifiable, Registrable {
    private String loanId;
    private Student student;
    private LibraryBook book;
    private LocalDate borrowedDate;
    private LocalDate dueDate;
    private LocalDate returnedDate;

    Scanner sc=new Scanner(System.in);

    public BookLoan(String loanId, Student student, LibraryBook book, LocalDate borrowedDate, LocalDate dueDate, LocalDate retruendDate) {
        this.loanId = loanId;
        this.student = student;
        this.book = book;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
        this.returnedDate = retruendDate;
    }

    public BookLoan() {
    }

    @Override
    public void validate() {
        Student s=new Student();
        LibraryBook lb=new LibraryBook();
        System.out.print("Loan Id: ");
        loanId=sc.nextLine();
        System.out.print("Student Id: ");
        String stId=sc.nextLine();
        if (!stId.equals(s.getStudentNumber())){
            System.out.print("Student with Id: "+stId+" doesn't exist.");
            return;
        }
        System.out.print("Book Id: ");
        String bId=sc.nextLine();
        if (!bId.equals(lb.getBookId())){
            System.out.print("Book with Id: "+bId+" doesn't exist.");
            return;
        }
        System.out.print("Borrowed date: ");
        borrowedDate=LocalDate.parse(sc.nextLine());
        dueDate=borrowedDate.plusWeeks(2);
        returnedDate=null;
        BookLoan bl=new BookLoan(loanId,student,book,borrowedDate,dueDate,returnedDate);
        li.add(bl);
    }

    public void bookReturn(){
        System.out.print("Loan Id: ");
        loanId=sc.nextLine();
        for(Identifiable book:li){
            if(book instanceof BookLoan){
                BookLoan bl= (BookLoan) book;
                if(bl.getLoanId().equals(loanId)){
                    bl.setReturnedDate(LocalDate.now());
                    System.out.println("Book returned successfully");
                    return;
                }
            }
        }
        System.out.println("Book with Loan Id: "+loanId+" not found.");

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getDisplayName() {
        return "";
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String getRegistrationSummary() {
        return "";
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LibraryBook getBook() {
        return book;
    }

    public void setBook(LibraryBook book) {
        this.book = book;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
    }
}
