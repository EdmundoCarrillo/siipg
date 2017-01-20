/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Variable;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface VariableDao {

    public List<Variable> loadVars();

    public void newVar(Variable var);

    public void updateVar(Variable var);

    public void deleteVar(Variable var);
}
