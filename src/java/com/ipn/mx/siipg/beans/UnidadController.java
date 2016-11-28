/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.UnidadAcademicaDao;
import com.ipn.mx.siipg.impl.UnidadAcademicaDaoImpl;
import com.ipn.mx.siipg.modelo.Unidadacademica;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class UnidadController implements Serializable {

    private Unidadacademica current;
    private List<Unidadacademica> items;

    public Unidadacademica getCurrent() {
        return current;
    }

    public void setCurrent(Unidadacademica current) {
        this.current = current;
    }

    public List<Unidadacademica> getItems() {
        UnidadAcademicaDao unidadDao = new UnidadAcademicaDaoImpl();
        return items = unidadDao.loadUnidad();
    }

    public void setItems(List<Unidadacademica> items) {
        this.items = items;
    }

    
}
