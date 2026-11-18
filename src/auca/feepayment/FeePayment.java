package auca.feepayment;

import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;
import auca.student.Student;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class FeePayment implements Identifiable, Registrable {
    private String paymentId;
    private Student student;
    private BigDecimal amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    private String receiptNumber;

    Scanner sc=new Scanner(System.in);

    public FeePayment(String paymentId, Student student, BigDecimal amount, LocalDate paymentDate, String paymentMethod, String receiptNumber) {
        this.paymentId = paymentId;
        this.student = student;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.receiptNumber = receiptNumber;
    }

    public FeePayment() {
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
    public void validate() {
        Student s=new Student();
        System.out.print("Payment Id: ");
        paymentId=sc.nextLine();
        System.out.print("Student Id: ");
        String stId=sc.nextLine();
        if(!stId.equals(s.getStudentNumber())){
            System.out.println("Student with id "+ stId +" doesn't exist");
            return;
        }
        System.out.print("Amount: ");
        amount=sc.nextBigDecimal();
        System.out.print("Payment Date: ");
        paymentDate=LocalDate.parse(sc.nextLine());
        sc.nextLine();
        System.out.print("Payment method: ");
        paymentMethod=sc.nextLine();
        System.out.print("Receipt number: ");
        receiptNumber=sc.nextLine();
        FeePayment fp=new FeePayment(paymentId,student,amount,paymentDate,paymentMethod,receiptNumber);
        li.add(fp);
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String getRegistrationSummary() {
        return "";
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
}
