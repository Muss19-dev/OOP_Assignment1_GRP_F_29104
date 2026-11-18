package auca.enrollment;

import auca.course.Course;
import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;
import auca.student.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class Enrollment implements Identifiable, Registrable {
    private String enrollmentId;
    private Student student;
    private Course course;
    private LocalDate enrollmentDate;
    private String semester;
    private String enrollmentStatus;

    Scanner sc=new Scanner(System.in);

    public Enrollment(String enrollmentId, Student student, Course course, LocalDate enrollmentDate, String semester, String enrollmentStatus) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.semester = semester;
        this.enrollmentStatus = enrollmentStatus;
    }

    public Enrollment() {
    }

    @Override
    public void validate() {
        Student s=new Student();
        Course c=new Course();
        System.out.print("Enrollment Id: ");
        enrollmentId=sc.nextLine();
        System.out.print("Student Id: ");
        String stId=sc.nextLine();
        if (!stId.equals(s.getStudentNumber())){
            System.out.print("Student with Id "+ stId+" doesn't exist.");
        }
        System.out.print("Course name: ");
        String cName=sc.nextLine();
        if (!cName.equalsIgnoreCase(c.getCourseTitle())){
            System.out.println("Course named: "+cName+" deosn't exist. Register a course before enrolling a student.");
            System.out.print("Tap 1 to register new course and 2 to return to Menu:");
            int choice=sc.nextInt();
            switch (choice){
                case 1: c.validate();
                case 2: return;
                default:
                    System.out.println("Invalid Input.");
                    return;
            }
        }
        System.out.print("Enrollment date: ");
        enrollmentDate=LocalDate.parse(sc.nextLine());
        System.out.print("Semester: ");
        semester=sc.nextLine();
        System.out.print("Enrollment status: ");
        enrollmentStatus=sc.nextLine();
        Enrollment e=new Enrollment();
        li.add(e);
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
        return getEnrollmentStatus().equalsIgnoreCase("Active");
    }

    @Override
    public void printDetails() {

    }

    @Override
    public String getRegistrationSummary() {
        return "";
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }
}
