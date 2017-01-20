/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.RolDao;
import com.ipn.mx.siipg.impl.RolDaoImpl;
import com.ipn.mx.siipg.modelo.Rol;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;


@Named
@SessionScoped
public class RolController implements Serializable {

    private Rol current;
    //Lista de roles
    private List<Rol> items;

    public Rol getCurrent() {
        return current;
    }

    public void setCurrent(Rol current) {
        this.current = current;
    }

    public List<Rol> getItems() {
        RolDao rolDao = new RolDaoImpl();
        return items = rolDao.loadRoles();
    }

    public void setItems(List<Rol> items) {
        this.items = items;
    }

}
