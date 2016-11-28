/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface UsuarioDao {

    public List<Usuario> loadUsers();

    public void newUser(Usuario user);

    public void updateUser(Usuario user);

    public void deleteUser(Usuario user);
}
