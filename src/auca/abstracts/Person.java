package auca.abstracts;

import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Identifiable, Registrable {

    private String personId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Person(String personId, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public abstract String getRoleDescription();

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        if(personId.equals(getPersonId())){
            System.out.println("Person with this ID already exists.");
        }
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.matches(".{2,60}")){
            System.out.println("Error! Name must contain 2 to 60 characters");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.matches(".{2,60}")){
            System.out.println("Error! Name must contain 2 to 60 characters");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@gmail.com")){
            System.out.println("Error! Invalid Email Address.");
        }
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(!phoneNumber.matches(".{10,15}")){
            System.out.println("Error! Phone number must contain 10 to 15 digits");
        }
        if(phoneNumber.matches("[0-9]+")){
            System.out.println("Error! Phone Number should contain only digits");

        }        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
