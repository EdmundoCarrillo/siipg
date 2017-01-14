/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Menu;
import com.ipn.mx.siipg.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface MenuDao {

    public List<Menu> loadMenus();

    public void newMenu(Menu menu);

    public void updateMenu(Menu menu);

    public void deleteMenu(Menu menu);
    
    public List<Menu> loadMenuByRol(Usuario usuario);
}
