/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.beans;

import com.ipn.mx.siipg.dao.MenuDao;
import com.ipn.mx.siipg.impl.MenuDaoImpl;
import com.ipn.mx.siipg.modelo.Menu;
import com.ipn.mx.siipg.modelo.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@Named
@SessionScoped
public class MenuController implements Serializable {

    private String pageLink;
    private String pageName;
    private List<Menu> menuList;

    public MenuController() {
        this.pageName = "index";
        this.pageLink = "login";

    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public String getPageName() {
        return pageName;
    }

    public List<Menu> getMenuList() {
        MenuDao menuDao = new MenuDaoImpl();
        Usuario usuario = (Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return menuList = menuDao.loadMenuByRol(usuario);
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void setCustomPage(String menuName, String pageLink) {

        setPageLink(pageLink);
        setPageName(menuName);

        System.out.println(menuName);
        System.out.println(pageLink);
    }
}
