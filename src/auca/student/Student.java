package auca.student;

import auca.abstracts.AcademicMember;
import auca.department.Department;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends AcademicMember {
    private String studentNumber;
    private String programName;
    private LocalDate admissionDate;
    private int studyYear;
    private String guardianPhone;
    private boolean scholarshipStatus;

    Scanner sc=new Scanner(System.in);

    public Student(String personId, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String memberNumber, Department department, LocalDate joinDate, String academicStatus, String institutionalEmail, String advisorName, String studentNumber, String programName, LocalDate admissionDate, int studyYear, String guardianPhone, boolean scholarshipStatus) {
        super(personId, firstName, lastName, email, phoneNumber, dateOfBirth, memberNumber, department, joinDate, academicStatus, institutionalEmail, advisorName);
        this.studentNumber = studentNumber;
        this.programName = programName;
        this.admissionDate = admissionDate;
        this.studyYear = studyYear;
        this.guardianPhone = guardianPhone;
        this.scholarshipStatus = scholarshipStatus;
    }

    public Student() {
    }

    @Override
    public void validate() {
        Department d=new Department();
        System.out.print("Person ID: ");
        String persId=sc.nextLine();
        System.out.print("First name: ");
        String fName=sc.nextLine();
        System.out.print("Last name: ");
        String lName=sc.nextLine();
        System.out.print("Email address: ");
        String email=sc.nextLine();
        System.out.print("Phone number: ");
        String phone=sc.nextLine();
        System.out.print("Date of birth: ");
        LocalDate DOB= LocalDate.parse(sc.nextLine());
        System.out.print("Member number: ");
        String memberId=sc.nextLine();
        System.out.print("Department name: ");
        String deptName=sc.nextLine();
        if(deptName.equalsIgnoreCase(d.getDepartmentName())){
            System.out.println("Department named: "+deptName+" not found.");
            System.out.print("Want to register a new department? (y if Yes/ n if No):");
            String ans="";
            if(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("Yes")){
                d.validate();
            } else if(ans.equalsIgnoreCase("N") || ans.equalsIgnoreCase("No")){
                return;
            } else{
                System.out.print("Invalid input. Please try again: ");
            }

        }
        System.out.print("Join Date: ");
        LocalDate joinDate=LocalDate.parse(sc.nextLine());
        System.out.print("Academic status: ");
        String acadStatus=sc.nextLine();
        System.out.print("Institutional Email: ");
        String institEmail=sc.nextLine();
        System.out.print("Advisor name: ");
        String advisorName=sc.nextLine();
        System.out.print("Student number: ");
        studentNumber=sc.nextLine();
        System.out.print("Program name: ");
        programName=sc.nextLine();
        System.out.print("Admission date: ");
        admissionDate=LocalDate.parse(sc.nextLine());
        System.out.print("Study year: ");
        studyYear=sc.nextInt();
        System.out.print("Guardian phone: ");
        guardianPhone=sc.nextLine();
        System.out.println("Scholarship status");
        System.out.print("Tap 'Yes' if you have a scholarship or 'No' if you don't have any: ");
        String ans=sc.nextLine();
        if (ans.equalsIgnoreCase("Yes")){
            scholarshipStatus=true;
        } else{
            scholarshipStatus=false;
        }
        Student s=new Student(persId,fName,lName,email,phone,DOB, memberId,getDepartment(),joinDate,acadStatus,institEmail,advisorName, studentNumber,programName,admissionDate,studyYear,guardianPhone,scholarshipStatus);
        ls.add(s);
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

    @Override
    public String getAcademicCategory() {
        return "";
    }

    @Override
    public String getRoleDescription() {
        return "";
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public boolean isScholarshipStatus() {
        return scholarshipStatus;
    }

    public void setScholarshipStatus(boolean scholarshipStatus) {
        this.scholarshipStatus = scholarshipStatus;
    }
}
