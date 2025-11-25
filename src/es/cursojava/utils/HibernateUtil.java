package es.cursojava.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.cursojava.hibernate.ejercicio1.entites.Curso;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Crea y configura el SessionFactory una sola vez
            Configuration cfg = new Configuration().configure(); // carga hibernate.cfg.xml si está en el classpath
            // Aseguramos que la entidad Curso esté registrada (útil si hibernate.cfg.xml no se carga o le falta el mapping)
            cfg.addAnnotatedClass(Curso.class);
            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

}