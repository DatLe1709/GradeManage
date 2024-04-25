package qldiemhs;

public class Subject extends Student {
    private int order;
    private String name;
    private String subjectId;
    private String instructor;
    private int credit;
    private String group;

    public Subject(int order, String name, String subjectId, String instructor, int credit, String group, String name, String studentId, String dob, String gender, String address, String phone, String email, String className, String major) {
        super(name, studentId, dob, gender, address, phone, email, className, major);
        this.order = order;
        this.name = name;
        this.subjectId = subjectId;
        this.instructor = instructor;
        this.credit = credit;
        this.group = group;
    }

    

    public Subject(String name, String studentId, String dob, String gender, String address, String phone, String email, String className, String major) {
        super(name, studentId, dob, gender, address, phone, email, className, major);
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    

    

    public void addSubject() {
        // Code to add a subject
    }

    public void deleteSubject() {
        // Code to delete a subject
    }

    public void updateSubjectInfo() {
        // Code to update subject information
    }
}
