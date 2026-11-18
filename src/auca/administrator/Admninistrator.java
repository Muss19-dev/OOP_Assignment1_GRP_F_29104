package auca.administrator;

import auca.abstracts.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Admninistrator extends Person {
    private String staffNumber;
    private String jobTitle;
    private String assignedOffice;
    private LocalDate employmentDate;
    private int accessLevel;
    private boolean active;

    Scanner sc=new Scanner(System.in);

    public Admninistrator(String personId, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth, String staffNumber, String jobTitle, String assignedOffice, LocalDate employmentDate, int accessLevel, boolean active) {
        super(personId, firstName, lastName, email, phoneNumber, dateOfBirth);
        this.staffNumber = staffNumber;
        this.jobTitle = jobTitle;
        this.assignedOffice = assignedOffice;
        this.employmentDate = employmentDate;
        this.accessLevel = accessLevel;
        this.active = active;
    }

    public Admninistrator() {
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
    public void validate() {
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
        System.out.print("Staff number: ");
        staffNumber=sc.nextLine();
        System.out.print("Job Title: ");
        jobTitle=sc.nextLine();
        System.out.print("Assigned office: ");
        assignedOffice=sc.nextLine();
        System.out.print("Employment date: ");
        employmentDate=LocalDate.parse(sc.nextLine());
        System.out.print("Access level: ");
        accessLevel=sc.nextInt();
        sc.nextLine();
        System.out.print("Are you active? (yes or no): ");
        String ans=sc.nextLine();
        if (ans.equalsIgnoreCase("yes")){
            active=true;
        } else {
            active=false;
        }
        Admninistrator ad=new Admninistrator(persId,fName,lName,email,phone,DOB,staffNumber,jobTitle,assignedOffice,employmentDate,accessLevel,active);
        ls.add(ad);


    }

    @Override
    public void printDetails() {

    }

    @Override
    public String getRegistrationSummary() {
        return "";
    }

    @Override
    public String getRoleDescription() {
        return "";
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAssignedOffice() {
        return assignedOffice;
    }

    public void setAssignedOffice(String assignedOffice) {
        this.assignedOffice = assignedOffice;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
