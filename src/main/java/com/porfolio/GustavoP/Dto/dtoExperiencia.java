
package com.porfolio.GustavoP.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    private String img;
    private String fechaini;
    private String fechafin;
    
    //constructor

    public dtoExperiencia() {
    }
    
    public dtoExperiencia(String nombreE, String descripcionE, String img, String fechaini, String fechafin) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.img = img;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
    }
    
    //getters & setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

}
