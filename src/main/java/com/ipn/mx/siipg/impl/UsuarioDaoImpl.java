/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.impl;

import com.ipn.mx.siipg.dao.UsuarioDao;
import com.ipn.mx.siipg.modelo.Usuario;
import com.ipn.mx.siipg.modelo.UsuarioId;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public List<Usuario> loadUsers() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        List usuarioList = null;
        try {
            tx.begin();
            usuarioList = session.createQuery("from Usuario").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return usuarioList;
    }

    @Override
    public void newUser(Usuario user) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.save(user);
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
    public void updateUser(Usuario user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.update(user);
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
    public void deleteUser(Usuario user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.delete(user);
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
    public Usuario checkUser(Usuario user) {
        Usuario us = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String stringQuery = "From Usuario u where u.password='" + user.getPassword() + "' and u.id.rfc='"+user.getId().getRfc()+"'";
        try {

            Query query = session.createQuery(stringQuery);
            if (!query.list().isEmpty()) {
                us = (Usuario) query.list().get(0);
            }
        } catch (HibernateException ex) {

            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return us;
    }

//    public static void main(String[] args) {
//        Usuario usu = new Usuario();
//        usu.setId(new UsuarioId(1, "CABE9211294D6"));
//        usu.setPassword("obiwan");
//        UsuarioDao usuarioDao = new UsuarioDaoImpl();
//        Usuario user = usuarioDao.checkUser(usu);
//        System.out.println(user.getNombre());
//    }
}
