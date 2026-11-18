package auca.assessment;

import auca.enrollment.Enrollment;
import auca.interfaces.Identifiable;
import auca.interfaces.Registrable;

import java.time.LocalDate;
import java.util.Scanner;

public class Assessment implements Identifiable, Registrable {
    private String assessmentId;
    private Enrollment enrollment;
    private String assessmentType;
    private double maximumScore;
    private double obtainedScore;
    private LocalDate assessmentDate;

    Scanner sc=new Scanner(System.in);

    public Assessment(String assessmentId, Enrollment enrollment, String assessmentType, double maximumScore, double obtainedScore, LocalDate assessmentDate) {
        this.assessmentId = assessmentId;
        this.enrollment = enrollment;
        this.assessmentType = assessmentType;
        this.maximumScore = maximumScore;
        this.obtainedScore = obtainedScore;
        this.assessmentDate = assessmentDate;
    }

    public Assessment() {
    }

    @Override
    public void validate() {
        Enrollment e=new Enrollment();
        System.out.print("Assessment Id: ");
        assessmentId=sc.nextLine();
        System.out.print("Enrollment Id: ");
        String enrollId=sc.nextLine();
        if (enrollId.equals(e.getEnrollmentId()) && !e.isActive()){
            System.out.println("Enrollment with Id: "+enrollId+" is not active.");
            return;
        } else if(!enrollId.equals(e.getEnrollmentId())){
            System.out.println("Enrollment with Id: "+enrollId+" not found.");
            return;
        }
        System.out.print("Assessment type: ");
        assessmentType=sc.nextLine();
        System.out.print("Maximum score: ");
        maximumScore=sc.nextDouble();
        System.out.print("Obtained score: ");
        obtainedScore=sc.nextDouble();
        System.out.print("Assessment date: ");
        assessmentDate=LocalDate.parse(sc.nextLine());
        Assessment ass=new Assessment(assessmentId,enrollment,assessmentType,maximumScore,obtainedScore,assessmentDate);
        li.add(ass);
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

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    public double getMaximumScore() {
        return maximumScore;
    }

    public void setMaximumScore(double maximumScore) {
        this.maximumScore = maximumScore;
    }

    public double getObtainedScore() {
        return obtainedScore;
    }

    public void setObtainedScore(double obtainedScore) {
        this.obtainedScore = obtainedScore;
    }

    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }
}
