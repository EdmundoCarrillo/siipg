/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.impl;

import com.ipn.mx.siipg.dao.MenuDao;
import com.ipn.mx.siipg.modelo.Menu;
import com.ipn.mx.siipg.modelo.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MenuDaoImpl implements MenuDao {

    @Override
    public List<Menu> loadMenus() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.getTransaction();
        List menuList = null;
        try {
            tx.begin();
            menuList = session.createQuery("from Menu").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return menuList;
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

    @Override
    public List<Menu> loadMenuByRol(Usuario usuario) {
        List menuList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        String stringQuery = "From Menu m where m.rol.id='" + usuario.getRol().getId() + "'";
        try {

            Query query = session.createQuery(stringQuery);
            menuList = query.list();

        } catch (HibernateException ex) {

            System.out.println(ex.toString());
        } finally {
            session.close();
        }
        return menuList;

    }

//    public static void main(String[] args) {
//        Usuario usuario = new Usuario();
//        Rol rol = new Rol();
//        rol.setId(2);
//        usuario.setRol(rol);
//        MenuDao menuDao = new MenuDaoImpl();
//        List<Menu> menuList = menuDao.loadMenuByRol(usuario);
//
//        for (Menu menu : menuList) {
//            System.out.println(menu.getIcon());
//        }
//}

}
