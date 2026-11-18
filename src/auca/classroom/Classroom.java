package auca.classroom;

import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;

import java.util.Scanner;

public class Classroom implements Identifiable, Registrable {
    private String classroomId;
    private String buildingName;
    private String roomNumber;
    private int capacity;
    private int floorNumber;
    private boolean available;

    Scanner sc=new Scanner(System.in);

    public Classroom(String classroomId, String buildingName, String roomNumber, int capacity, int floorNumber, boolean available) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.floorNumber = floorNumber;
        this.available = available;
    }

    public Classroom() {
    }

    @Override
    public void validate() {
        System.out.print("Classroom Id: ");
        classroomId=sc.nextLine();
        System.out.print("Building name: ");
        buildingName=sc.nextLine();
        System.out.print("Room number: ");
        roomNumber=sc.nextLine();
        System.out.print("Capacity: ");
        capacity=sc.nextInt();
        System.out.print("Floor number: ");
        floorNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Availability (Yes if available/ No if not available): ");
        String ans=sc.nextLine();
        if (ans.equalsIgnoreCase("Yes")){
            available=true;
        } else{
            available=false;
        }
        Classroom cl=new Classroom(classroomId,buildingName,roomNumber,capacity,floorNumber,available);
        li.add(cl);
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

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
