package com.java.hib;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
	public static void main(String[] args) {
        try
        {
//        	1 : step to create configuration file i .e hibernate.cfg.xml
            Configuration config=new Configuration();
            config.configure();
//            System.out.println("I am calling the config");
            System.out.println(config);
            
//            2 : step to create sessionFactory and openSession
            SessionFactory sessionFactory=config.buildSessionFactory();
            Session session=sessionFactory.openSession();
//            System.out.println("I am calling session here");
            System.out.println(session);
//            List<Student> list1 = new ArrayList<Student>();
            // creating Student class object
            Student s1=new Student();
            s1.setId(100);
            s1.setName("harish");
           
            session.save(s1);
          
            Transaction t=session.beginTransaction();
            t.commit();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
