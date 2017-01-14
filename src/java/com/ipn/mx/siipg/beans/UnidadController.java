/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.impl.UnidadResponsableDaoImpl;
import com.ipn.mx.siipg.modelo.Unidadresponsable;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import com.ipn.mx.siipg.dao.UnidadResponsableDao;

/**
 *
 * @author Edmundo Carrillo
 */

@Named
@SessionScoped
public class UnidadController implements Serializable {

    private Unidadresponsable current;
    private List<Unidadresponsable> items;

    public Unidadresponsable getCurrent() {
        return current;
    }

    public void setCurrent(Unidadresponsable current) {
        this.current = current;
    }

    public List<Unidadresponsable> getItems() {
        UnidadResponsableDao unidadDao = new UnidadResponsableDaoImpl();
        return items = unidadDao.loadUnidad();
    }

    public void setItems(List<Unidadresponsable> items) {
        this.items = items;
    }

}
