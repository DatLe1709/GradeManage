package qldiemhs;

public class Grade extends Subject{
    private double processGrade;
    private double midtermGrade;
    private double finalGrade;
    private int academicYear;
    private String semester;


    public Grade(double processGrade, double midtermGrade, double finalGrade, int academicYear, String semester, String name, String studentId, String dob, String gender, String address, String phone, String email, String className, String major) {
        super(name, studentId, dob, gender, address, phone, email, className, major);
        this.processGrade = processGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
        this.academicYear = academicYear;
        this.semester = semester;
    }

    public double getProcessGrade() {
        return processGrade;
    }

    public void setProcessGrade(double processGrade) {
        this.processGrade = processGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    

    public double calculateGradeH10() {
        // Code to calculate grade on 10.0 scale
        return 0.0;
    }

    public double calculateGradeH4() {
        // Code to calculate grade on 4.0 scale
        return 0.0;
    }

    public String gradeLetter() {
        // Code to determine letter grade
        return "";
    }

    public String passFail() {
        // Code to determine pass/fail
        return "";
    }

    public void viewDetails() {
        // Code to view grade details
    }

    public int earnedCredits() {
        // Code to calculate earned credits
        return 0;
    }
}
