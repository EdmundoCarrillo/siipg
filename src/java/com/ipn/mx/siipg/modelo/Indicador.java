package com.ipn.mx.siipg.modelo;

public class Indicador implements java.io.Serializable {

    private Integer id;
    private Ejetematico ejetematico;
    private String nombre;
    private String rutaPdf;
    private Float resultado;

    public Indicador() {
    }

    public String getRutaPdf() {
        return rutaPdf;
    }

    public void setRutaPdf(String rutaPdf) {
        this.rutaPdf = rutaPdf;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ejetematico getEjetematico() {
        return this.ejetematico;
    }

    public void setEjetematico(Ejetematico ejetematico) {
        this.ejetematico = ejetematico;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getResultado() {
        return resultado;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }

}
