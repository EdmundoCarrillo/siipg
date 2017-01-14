package com.ipn.mx.siipg.modelo;

import java.util.HashSet;
import java.util.Set;

public class Ejetematico  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String descripcion;
     private int estatus;
     private Set indicadors = new HashSet(0);

    public Ejetematico() {
    }

	
    public Ejetematico(String nombre, int estatus) {
        this.nombre = nombre;
        this.estatus = estatus;
    }
    public Ejetematico(String nombre, String descripcion, int estatus, Set indicadors) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.estatus = estatus;
       this.indicadors = indicadors;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    public Set getIndicadors() {
        return this.indicadors;
    }
    
    public void setIndicadors(Set indicadors) {
        this.indicadors = indicadors;
    }




}


