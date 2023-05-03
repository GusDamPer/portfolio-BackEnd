
package com.porfolio.GustavoP.Repository;

import com.porfolio.GustavoP.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RAcerca extends JpaRepository<Acerca, Integer> {
    public Optional<Acerca> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
