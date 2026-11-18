package auca.teacher;

import auca.abstracts.AcademicMember;
import auca.department.Department;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Teacher extends AcademicMember {
    private String employeeNumber;
    private String specialization;
    private LocalDate hireDate;
    private BigDecimal salary;
    private String officeNumber;
    private String employmentType;

    Scanner sc=new Scanner(System.in);

    public Teacher(String personId, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String memberNumber, Department department, LocalDate joinDate, String academicStatus, String institutionalEmail, String advisorName, String employeeNumber, String specialization, LocalDate hireDate, BigDecimal salary, String officeNumber, String employmentType) {
        super(personId, firstName, lastName, email, phoneNumber, dateOfBirth, memberNumber, department, joinDate, academicStatus, institutionalEmail, advisorName);
        this.employeeNumber = employeeNumber;
        this.specialization = specialization;
        this.hireDate = hireDate;
        this.salary = salary;
        this.officeNumber = officeNumber;
        this.employmentType = employmentType;
    }

    public Teacher() {
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
        Department d= new Department();
        System.out.println("\nPERSONAL INFORMATION\n");
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
        System.out.println("\nJOB INFORMATION\n");
        System.out.print("Member number: ");
        String memberId=sc.nextLine();
        System.out.print("Department name: ");
        String deptName=sc.nextLine();
        if(deptName.equalsIgnoreCase(d.getDepartmentName())){
            System.out.println("Department named: "+deptName+" not found.");
            return;

        }
        System.out.print("Join Date: ");
        LocalDate joinDate=LocalDate.parse(sc.nextLine());
        System.out.print("Academic status: ");
        String acadStatus=sc.nextLine();
        System.out.print("Institutional Email: ");
        String institEmail=sc.nextLine();
        System.out.print("Advisor name: ");
        String advisorName=sc.nextLine();
        System.out.print("Employee number: ");
        employeeNumber=sc.nextLine();
        System.out.print("Specialization: ");
        specialization=sc.nextLine();
        System.out.print("Hire date: ");
        hireDate=LocalDate.parse(sc.nextLine());
        System.out.print("Salary: ");
        salary=sc.nextBigDecimal();
        sc.nextLine();
        System.out.print("Office number: ");
        officeNumber=sc.nextLine();
        System.out.print("Employment type: ");
        employmentType=sc.nextLine();
        Teacher th=new Teacher(persId,fName,lName,email,phone,DOB,memberId,getDepartment(),joinDate,acadStatus,institEmail,advisorName,employeeNumber,specialization,hireDate,salary,officeNumber,employmentType);
        ls.add(th);

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

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }
}
