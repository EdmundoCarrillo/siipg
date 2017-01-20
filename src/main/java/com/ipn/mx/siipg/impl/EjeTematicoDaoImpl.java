/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.impl;

import com.ipn.mx.siipg.dao.EjeTematicoDao;
import com.ipn.mx.siipg.modelo.Ejetematico;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EjeTematicoDaoImpl implements EjeTematicoDao {

    @Override
    public List<Ejetematico> loadEjes() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        List ejesList = null;
        try {
            tx.begin();
            ejesList = session.createQuery("from Ejetematico").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return ejesList;
    }

    @Override
    public void newEjeTematico(Ejetematico ejeTematico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEjeTematico(Ejetematico ejeTematico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEjeTematico(Ejetematico ejeTematico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


//
//    public static void main(String[] args) {
//        EjeTematicoDao ejeDao = new EjeTematicoDaoImpl();
//        List lista = ejeDao.loadEjes();
//        System.out.println(lista.size());
//    }

}
