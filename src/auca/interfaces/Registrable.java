package auca.interfaces;

import auca.abstracts.Person;

import java.util.ArrayList;
import java.util.List;

public interface Registrable {
    List<Person> ls=new ArrayList<>();
    int MinNameLength=0;
    int MaxNameLength=0;
    int MaxEmailLength=0;
    int MinPhoneLength=0;
    int MaxPhoneLength=0;
    String DatePattern="";

    public abstract void validate();
    public abstract void printDetails();
    public abstract String getRegistrationSummary();
}
