/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Ejetematico;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface EjeTematicoDao {

    public List<Ejetematico> loadEjes();

    public void newEjeTematico(Ejetematico ejeTematico);

    public void updateEjeTematico(Ejetematico ejeTematico);

    public void deleteEjeTematico(Ejetematico ejeTematico);



}
