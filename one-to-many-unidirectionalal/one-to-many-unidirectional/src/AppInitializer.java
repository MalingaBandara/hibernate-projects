import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;

public class AppInitializer {

    public static void main(String[] args) {

    try (Session session = HibernateUtill.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();

                    Laptop laptop1 = new Laptop();
                            laptop1.setBrand("Lenovo");

                    Laptop laptop2 = new Laptop();
                            laptop2.setBrand("Mac");

                    Student student = new Student();
                            student.setStudentName("Nimal");

            student.setLaptops(Arrays.asList( laptop1, laptop2 ) );

            session.save(student);

            transaction.commit();
        }

    }

}
