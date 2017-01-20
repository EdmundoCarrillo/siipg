/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.impl;

import com.ipn.mx.siipg.dao.VariableDao;
import com.ipn.mx.siipg.modelo.Variable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VariableDaoImpl implements VariableDao {

    @Override
    public List<Variable> loadVars() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        List varList = null;
        try {
            tx.begin();
            varList = session.createQuery("from Variable").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return varList;
    }

    @Override
    public void newVar(Variable var) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.save(var);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public void updateVar(Variable var) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.update(var);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteVar(Variable var) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.delete(var);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
    }

}
