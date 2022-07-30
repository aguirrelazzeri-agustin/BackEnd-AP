
package com.portafolio.aal.Repository;

import com.portafolio.aal.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
    
}
