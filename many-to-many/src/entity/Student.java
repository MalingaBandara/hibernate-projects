package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity ( name = "student_table" )
public class Student {

                @Id
                @GeneratedValue (strategy = GenerationType.IDENTITY)
                @Column ( name = "student_id")
                private long studentId;

                private String studentName;


    // ------------- mapping -----------------------

    @ManyToMany ( mappedBy = "students" )
    private List<Course> courses = new ArrayList<>();

    // ------------- mapping -----------------------


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


                public Student() {}

                public Student(long studentId, String studentName) {
                    this.studentId = studentId;
                    this.studentName = studentName;
                }

                public long getStudentId() {
                    return studentId;
                }

                public void setStudentId(long studentId) {
                    this.studentId = studentId;
                }

                public String getStudentName() {
                    return studentName;
                }

                public void setStudentName(String studentName) {
                    this.studentName = studentName;
                }

                    @Override
                    public String toString() {
                        return "Student{" +
                                "studentId=" + studentId +
                                ", studentName='" + studentName + '\'' +
                                '}';
                    }
}
