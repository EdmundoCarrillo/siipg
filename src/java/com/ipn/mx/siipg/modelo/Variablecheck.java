package com.ipn.mx.siipg.modelo;
// Generated 12/12/2016 01:27:14 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Variablecheck generated by hbm2java
 */
public class Variablecheck  implements java.io.Serializable {


     private Integer id;
     private Variable variable;
     private String comentario;
     private int estatus;
     private Set indicadors = new HashSet(0);

    public Variablecheck() {
    }

	
    public Variablecheck(Variable variable, String comentario, int estatus) {
        this.variable = variable;
        this.comentario = comentario;
        this.estatus = estatus;
    }
    public Variablecheck(Variable variable, String comentario, int estatus, Set indicadors) {
       this.variable = variable;
       this.comentario = comentario;
       this.estatus = estatus;
       this.indicadors = indicadors;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Variable getVariable() {
        return this.variable;
    }
    
    public void setVariable(Variable variable) {
        this.variable = variable;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
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


