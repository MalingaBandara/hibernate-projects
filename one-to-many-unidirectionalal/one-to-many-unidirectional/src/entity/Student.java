package entity;

import javax.persistence.*;
import java.util.List;

@Entity ( name = "student_table" )
public class Student {

                @Id
                @GeneratedValue (strategy = GenerationType.IDENTITY)
                @Column ( name = "student_id" )
                private long studentId;

                private String studentName;


    // ------------- mapping -----------------------

    @OneToMany ( cascade = CascadeType.ALL  )
    @JoinTable ( name = "student_laptop_details",
                   joinColumns = @JoinColumn( name = "stu_id" ),
                    inverseJoinColumns = @JoinColumn( name = "lap_id" )
            )
    private List<Laptop> laptops;

    // ------------- mapping -----------------------


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
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
