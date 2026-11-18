package auca.department;

import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;
import auca.teacher.Teacher;

import java.util.Scanner;

public class Department implements Identifiable, Registrable {
    private String departmentId;
    private String departmentName;
    private String departmentCode;
    private String officeLocation;
    private String contactEmail;
    private Teacher headTeacher;

    Scanner sc=new Scanner(System.in);

    public Department(String departmentId, String departmentName, String departmentCode, String officeLocation, String contactEmail, Teacher headTeacher) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.officeLocation = officeLocation;
        this.contactEmail = contactEmail;
        this.headTeacher = headTeacher;
    }

    public Department() {
    }

    @Override
    public void validate() {
        Teacher t=new Teacher();
        System.out.print("Department Id: ");
        departmentId=sc.nextLine();
        System.out.print("Department name: ");
        departmentName=sc.nextLine();
        System.out.print("Department code: ");
        departmentCode=sc.nextLine();
        System.out.print("Office location: ");
        officeLocation=sc.nextLine();
        System.out.print("Contact Email: ");
        contactEmail=sc.nextLine();
        System.out.print("Head teacher Id: ");
        String tId=sc.nextLine();
        if (!tId.equals(t.getEmployeeNumber())){
            System.out.println("Teacher with Id: "+tId+" doesn't exist.");
        }
        Department d=new Department(departmentId,departmentName,departmentCode,officeLocation,contactEmail,headTeacher);
        li.add(d);
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Teacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(Teacher headTeacher) {
        this.headTeacher = headTeacher;
    }
}
