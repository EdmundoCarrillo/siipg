/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.impl;

import com.ipn.mx.siipg.dao.MenuDao;
import com.ipn.mx.siipg.modelo.Menu;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MenuDaoImpl implements MenuDao {

    @Override
    public List<Menu> loadMenus() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        List rolList = null;
        try {
            tx.begin();
            rolList = session.createQuery("from Menu").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return rolList;
    }

    @Override
    public void newMenu(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMenu(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMenu(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        MenuDao menuDao = new MenuDaoImpl();
        List<Menu> menuList = menuDao.loadMenus();

        for (Menu menu : menuList) {
            System.out.println(menu.getIcon());
        }
    }
}
