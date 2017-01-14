/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao.util;

import com.ipn.mx.siipg.modelo.Indicador;
import java.util.List;

public class EjeHasIndicadorView {

    private String nombreEje;
    private List<Indicador> indocadoresList;

    public EjeHasIndicadorView(String nombreEje, List<Indicador> indocadoresList) {
        this.nombreEje = nombreEje;
        this.indocadoresList = indocadoresList;
    }

    public String getNombreEje() {
        return nombreEje;
    }

    public void setNombreEje(String nombreEje) {
        this.nombreEje = nombreEje;
    }

    public List<Indicador> getIndocadoresList() {
        return indocadoresList;
    }

    public void setIndocadoresList(List<Indicador> indocadoresList) {
        this.indocadoresList = indocadoresList;
    }

    @Override
    public String toString() {
        return "EjeHasIndicadorView{" + "nombreEje=" + nombreEje + ", indocadoresList=" + indocadoresList + '}';
    }

}
