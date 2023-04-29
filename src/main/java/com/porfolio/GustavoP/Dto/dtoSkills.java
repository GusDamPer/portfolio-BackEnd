
package com.porfolio.GustavoP.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    
    //constructor

    public dtoSkills() {
    }

    public dtoSkills(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void getPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    
}
