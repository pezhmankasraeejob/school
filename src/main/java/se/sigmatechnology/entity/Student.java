package se.sigmatechnology.entity;

/**
 * Created by pke on 2017-09-01.
 */
public class Student {

    private String studentId;
    private String studentFullName;
    private String programme;

    public Student(){
        // TODO: 2017-09-01
    }

    public Student(String studentId, String studentFullName, String programme) {
        this.studentId = studentId;
        this.studentFullName = studentFullName;
        this.programme = programme;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}
