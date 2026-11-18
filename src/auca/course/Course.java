package auca.course;

import auca.department.Department;
import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;
import auca.teacher.Teacher;

import java.util.Scanner;

public class Course implements Identifiable, Registrable {
    private String courseId;
    private String courseCode;
    private String courseTitle;
    private int creditHours;
    private Department department;
    private Teacher assignedTeacher;

    Scanner sc=new Scanner(System.in);

    public Course(String courseId, String courseCode, String courseTitle, int creditHours, Department department, Teacher assignedTeacher) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.department = department;
        this.assignedTeacher = assignedTeacher;
    }

    public Course() {
    }

    public void showExistingRecords(){
        for(Identifiable course: li){
            if (course instanceof Course c){
                System.out.println("Course Code: "+ c.getCourseCode());
                System.out.println("Course Title: "+ c.getCourseTitle());
            }
        }
    }

    @Override
    public void validate() {
        Teacher t=new Teacher();
        Department d=new Department();
        System.out.println("Existing course records: \n");
        showExistingRecords();
        System.out.print("Course Id: ");
        courseId=sc.nextLine();
        System.out.print("Course code: ");
        courseCode=sc.nextLine();
        System.out.print("Course title: ");
        courseTitle=sc.nextLine();
        System.out.print("Credit hours: ");
        creditHours=sc.nextInt();
        System.out.print("Department name: ");
        String deptName=sc.nextLine();
        if (!deptName.equals(d.getDepartmentName())){
            System.out.println("Department named: "+deptName+" doesn't exist.");
            return;
        }
        System.out.print("Assigned teacher Id: ");
        String tId=sc.nextLine();
        if (!tId.equals(t.getMemberNumber())){
            System.out.println("Teacher with Id "+tId+" doesn't exist.");
            return;
        }
        Course c=new Course(courseId,courseCode,courseTitle,creditHours,department,assignedTeacher);
        li.add(c);
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


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setAssignedTeacher(Teacher assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }
}
