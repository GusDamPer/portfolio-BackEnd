
package com.porfolio.GustavoP.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    
    @NotBlank
    private String img;
    
    private String puesto;
    
    private String compania;
    
    private String acerca;
    
    private String tel;
    
    private String email;
    
    private String ubicacion;
    
    //constructor

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String img, String puesto, String compania, String acerca, String tel, String email, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.puesto = puesto;
        this.compania = compania;
        this.acerca = acerca;
        this.tel = tel;
        this.email = email;
        this.ubicacion = ubicacion;
    }

    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    
}
