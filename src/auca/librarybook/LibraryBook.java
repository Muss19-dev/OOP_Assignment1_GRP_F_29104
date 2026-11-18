package auca.librarybook;

import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;

import java.util.Scanner;

public class LibraryBook implements Identifiable, Registrable {
    private String bookId;
    private String isbn;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    Scanner sc=new Scanner(System.in);

    public LibraryBook(String bookId, String isbn, String title, String author, int totalCopies, int availableCopies) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public LibraryBook() {
    }

    @Override
    public void validate() {
        System.out.print("Book Id: ");
        bookId=sc.nextLine();
        System.out.print("Book ISBN: ");
        isbn=sc.nextLine();
        System.out.print("Book title: ");
        title=sc.nextLine();
        System.out.print("Author: ");
        author=sc.nextLine();
        System.out.print("Total copies: ");
        totalCopies=sc.nextInt();
        availableCopies=totalCopies;
        LibraryBook lb=new LibraryBook(bookId,isbn,title,author,totalCopies,availableCopies);
        li.add(lb);
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

    public void borrowBook(){

    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
