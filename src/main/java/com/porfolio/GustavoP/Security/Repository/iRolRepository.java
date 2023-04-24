
package com.porfolio.GustavoP.Security.Repository;

import com.porfolio.GustavoP.Security.Entity.Rol;
import com.porfolio.GustavoP.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
