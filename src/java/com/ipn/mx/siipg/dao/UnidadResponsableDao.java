/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Unidadresponsable;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface UnidadResponsableDao {

    public List<Unidadresponsable> loadUnidad();

    public void newUnidad(Unidadresponsable unidad);

    public void updateUnidad(Unidadresponsable unidad);

    public void deleteUnidad(Unidadresponsable unidad);

}
