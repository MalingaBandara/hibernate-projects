import entity.Laptop;
import entity.Student;
import org.hibernate.Session;

public class AppInitializer {

    public static void main(String[] args) {


        try ( Session session = HibernateUtill.getSessionFactory().openSession() ) {

            Laptop laptop = new Laptop();
            laptop.setBrand( "Lenovo" );
            session.save( laptop );

            //-----------
            Student student = new Student();
            student.setLaptop(laptop);
            student.setStudentName( "Nimal" );

            session.save( student );

        }


    }

}
