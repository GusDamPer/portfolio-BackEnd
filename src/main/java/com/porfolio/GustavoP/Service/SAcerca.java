
package com.porfolio.GustavoP.Service;

import com.porfolio.GustavoP.Entity.Acerca;
import com.porfolio.GustavoP.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcerca {
    @Autowired
    RAcerca rAcerca;
    
    public List<Acerca> list(){
        return rAcerca.findAll();
    }
    
    public Optional<Acerca> getOne(int id){
        return rAcerca.findById(id);
    }
    
    public Optional<Acerca> getByNombre(String nombre){
        return rAcerca.findByNombre(nombre);
    }
    
    public void save(Acerca acerca){
        rAcerca.save(acerca);
    }
    
    public void delete(int id){
        rAcerca.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rAcerca.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rAcerca.existsByNombre(nombre);
    }
}
