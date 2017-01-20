/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.IndicadorDao;
import com.ipn.mx.siipg.dao.IndicadorDao;
import com.ipn.mx.siipg.dao.util.EjeHasIndicadorView;
import com.ipn.mx.siipg.impl.IndicadorDaoImpl;
import com.ipn.mx.siipg.modelo.Indicador;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class IndicadorController implements Serializable {

    private Indicador current;
    private List<EjeHasIndicadorView> indicadorView;

    public List<EjeHasIndicadorView> getIndicadorView() {
        IndicadorDao indicadorDao = new IndicadorDaoImpl();
        return indicadorView = indicadorDao.loadIndicadores();
    }

    public void setIndicadorView(List<EjeHasIndicadorView> indicadorView) {
        this.indicadorView = indicadorView;
    }

    public Indicador getCurrent() {
        return current;
    }

    public void setCurrent(Indicador current) {
        this.current = current;
    }

    public void pruebaSubTable(Indicador indicador) {
        System.out.println(indicador.getId());
    }

}
