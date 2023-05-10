
package com.porfolio.GustavoP.Controller;

import com.porfolio.GustavoP.Dto.dtoAcerca;
import com.porfolio.GustavoP.Entity.Acerca;
import com.porfolio.GustavoP.Security.Controller.Mensaje;
import com.porfolio.GustavoP.Service.SAcerca;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/acerca")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-frontend-gustavo.web.app")
public class CAcerca {
    @Autowired
    SAcerca sAcerca;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Acerca>> list(){
        List<Acerca> list = sAcerca.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id") int id){
        if(!sAcerca.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        Acerca acerca = sAcerca.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sAcerca.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        sAcerca.delete(id);
        return new ResponseEntity(new Mensaje("Campo eliminado"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcerca dtoacerca){
        if(StringUtils.isBlank(dtoacerca.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sAcerca.existsByNombre(dtoacerca.getNombre()))
            return new ResponseEntity(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        
        Acerca acerca = new Acerca(dtoacerca.getNombre(), dtoacerca.getDescripcion(), dtoacerca.getImg());
        sAcerca.save(acerca);
        
        return new ResponseEntity(new Mensaje("Descripción agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAcerca dtoacerca){
        if(!sAcerca.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        if(sAcerca.existsByNombre(dtoacerca.getNombre()) && sAcerca.getByNombre(dtoacerca.getNombre()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoacerca.getNombre()))
            return new ResponseEntity(new Mensaje ("El título es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Acerca acerca = sAcerca.getOne(id).get();
        acerca.setNombre(dtoacerca.getNombre());
        acerca.setDescripcion(dtoacerca.getDescripcion());
        acerca.setImg(dtoacerca.getImg());
        
        sAcerca.save(acerca);
        return new ResponseEntity(new Mensaje("Acerca de actualizado"), HttpStatus.OK);
        
    }
    
}
