/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Rol;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface RolDao {

    public List<Rol> loadRoles();

    public void newRol(Rol rol);

    public void updateRol(Rol rol);

    public void deleteRol(Rol rol);
}
