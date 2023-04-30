import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String[] args) {


    /*try (Session session = HibernateUtill.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();

            Laptop laptop = new Laptop();
            laptop.setBrand("Lenovo");

            Student student = new Student();
            student.setStudentName("Nimal");
            student.setLaptop(laptop);

            session.persist(student);

            transaction.commit();
        }*/

        try(Session session = HibernateUtill.getSessionFactory().openSession()){ // find student from student
            Student student = session.get(Student.class, (long)1);
            if (null!=student){
                System.out.println(student.getStudentName());
            }
        }

        try(Session session = HibernateUtill.getSessionFactory().openSession()){ // find student from laptop
            Laptop laptop = session.get(Laptop.class, (long)1);
            if (null!=laptop){
                System.out.println(laptop.getStudent().getStudentName());
            }
        }

    }

}
