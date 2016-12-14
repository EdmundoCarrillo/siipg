/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.UsuarioDao;
import com.ipn.mx.siipg.dao.util.JsfUtil;
import com.ipn.mx.siipg.impl.UsuarioDaoImpl;
import com.ipn.mx.siipg.modelo.Rol;
import com.ipn.mx.siipg.modelo.Unidadresponsable;
import com.ipn.mx.siipg.modelo.Usuario;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class UserController implements Serializable {

    private Usuario current;
    private List<Usuario> items;
    private Usuario selected;
    private String selectedRol;
    private String selectedUnidad;

    public Usuario getSelected() {
        return selected;
    }

    public void setSelected(Usuario selected) {
        this.selected = selected;
    }

    public UserController() {
    }

    public Usuario getCurrent() {
        return current;
    }

    public void setCurrent(Usuario current) {
        this.current = current;
    }

    public List<Usuario> getItems() {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        return items = usuarioDao.loadUsers();
    }

    public void setItems(List<Usuario> items) {
        this.items = items;
    }

    public String prepareCreate() {
        current = new Usuario();
        return "Create";
    }

    public String prepareEdit(Usuario user) {
        current = user;
        return "Edit";
    }

    public String prepareEdit2() {

        return "Edit";
    }

    public void createItem() {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        Unidadresponsable unidad = new Unidadresponsable();
        Rol rol = new Rol();
        unidad.setId(Integer.valueOf(selectedUnidad));
        rol.setId(Integer.valueOf(selectedRol));
        current.setUnidadresponsable(unidad);
        current.setRol(rol);
        usuarioDao.newUser(current);
    }

    public String editItem() {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        Unidadresponsable unidad = new Unidadresponsable();
        Rol rol = new Rol();
        unidad.setId(Integer.valueOf(selectedUnidad));
        rol.setId(Integer.valueOf(selectedRol));
        current.setUnidadresponsable(unidad);
        current.setRol(rol);
        usuarioDao.updateUser(current);
        JsfUtil.addSuccessMessage(ResourceBundle.getBundle("Bundle").getString("Usuarios.update"));
        return "View";
    }

    public void deleteItem() {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        usuarioDao.deleteUser(current);
        JsfUtil.addSuccessMessage(ResourceBundle.getBundle("Bundle").getString("Usuarios.delete"));
        current = new Usuario();
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
