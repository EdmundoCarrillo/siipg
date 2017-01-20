/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.UsuarioDao;
import com.ipn.mx.siipg.impl.UsuarioDaoImpl;
import com.ipn.mx.siipg.modelo.Usuario;
import com.ipn.mx.siipg.modelo.UsuarioId;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import com.ipn.mx.siipg.dao.util.JsfUtil;
import java.util.ResourceBundle;

@Named
@SessionScoped

public class SessionController implements Serializable {

    private Usuario usuario = new Usuario();
    private UsuarioId usuarioId = new UsuarioId();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void accessCheck() {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        this.usuario.setId(this.usuarioId);
        try {
            Usuario user = usuarioDao.checkUser(this.usuario);

            if (user != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", user);
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");

            } else {
                JsfUtil.addErrorMessage(ResourceBundle.getBundle("Bundle").getString("msg4Error"));
                JsfUtil.addErrorMessage(ResourceBundle.getBundle("Bundle").getString("msg5Error"));
                // System.out.println("Error el usuario no existe");

            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

}
