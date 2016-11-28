/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Unidadacademica;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface UnidadAcademicaDao {

    public List<Unidadacademica> loadUnidad();

    public void newUnidad(Unidadacademica unidad);

    public void updateUnidad(Unidadacademica unidad);

    public void deleteUnidad(Unidadacademica unidad);

}
