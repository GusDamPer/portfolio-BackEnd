
package com.porfolio.GustavoP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size (min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size (min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    private String img;
    
    private String puesto;
    
    private String compania;
    
    private String acerca;
    
    private String tel;
    
    private String email;
    
    private String ubicacion;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, String img, String puesto, String compania, String acerca, String tel, String email, String ubicacion) {
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
    
    
}
