package auca.main;

import auca.administrator.Admninistrator;
import auca.assessment.Assessment;
import auca.bookloan.BookLoan;
import auca.classroom.Classroom;
import auca.course.Course;
import auca.department.Department;
import auca.enrollment.Enrollment;
import auca.feepayment.FeePayment;
import auca.librarybook.LibraryBook;
import auca.student.Student;
import auca.teacher.Teacher;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Student s=new Student();
        Department d=new Department();
        Teacher t= new Teacher();
        Admninistrator admin=new Admninistrator();
        Course c=new Course();
        Classroom cl=new Classroom();
        Enrollment e=new Enrollment();
        Assessment ass=new Assessment();
        FeePayment fp=new FeePayment();
        LibraryBook lb=new LibraryBook();
        BookLoan bl=new BookLoan();
        Scanner sc=new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("     WELCOME TO AUCA MANAGEMENT SYSTEM");
        System.out.println("=============================================\n");
        while(true){
            System.out.println("                     SELECT FROM THE MENU\n");
            System.out.println("1.  Register Department               11. Borrow Library Book");
            System.out.println("2.  Register Student                  12. Return Library Book");
            System.out.println("3.  Register Teacher                  13. View All Records");
            System.out.println("4.  Register Administrator            14. Search Record by Id:");
            System.out.println("5.  Register Course                   15. Update existing record");
            System.out.println("6.  Register Classroom                16. Student Academic Summary");
            System.out.println("7.  Enroll Student                    17. Student Payment History");
            System.out.println("8.  Record Assessment                 18. View available books");
            System.out.println("9.  Record Fee Payment                19. Demonstrate Polymorphism");
            System.out.println("10. Register Library Book             0.  Exit\n");
            System.out.print("Your Choice Here: ");
            int choice=sc.nextInt();

            switch (choice){
                case 1: d.validate();
                case 2: s.validate();
                case 3: t.validate();
                case 4: admin.validate();
                case 5: c.validate();
                case 6: cl.validate();
                case 7: e.validate();
                case 8: ass.validate();
                case 9: fp.validate();
                case 10: lb.validate();
                case 11: bl.validate();
                case 12: bl.bookReturn();
                case 13:
                case 14:

            }
        }
    }
}
