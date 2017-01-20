/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.VariableDao;
import com.ipn.mx.siipg.impl.VariableDaoImpl;
import com.ipn.mx.siipg.modelo.Variable;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class VariableController implements Serializable {

    private Variable current;
    private List<Variable> items;
    private String selectedRol;
    private String selectedUnidad;

    public Variable getCurrent() {
        return current;
    }

    public void setCurrent(Variable current) {
        this.current = current;
    }

    public List<Variable> getItems() {
        VariableDao variableDao = new VariableDaoImpl();
        return items = variableDao.loadVars();
    }

    public void setItems(List<Variable> items) {
        this.items = items;
    }

    public String getSelectedRol() {
        return selectedRol;
    }

    public void setSelectedRol(String selectedRol) {
        this.selectedRol = selectedRol;
    }

    public String getSelectedUnidad() {
        return selectedUnidad;
    }

    public void setSelectedUnidad(String selectedUnidad) {
        this.selectedUnidad = selectedUnidad;
    }

}
