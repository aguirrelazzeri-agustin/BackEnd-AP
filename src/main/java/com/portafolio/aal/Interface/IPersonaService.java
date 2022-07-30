

package com.portafolio.aal.Interface;

import com.portafolio.aal.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Para traer una lista de persona utilizo//
    public List<Persona> getPersona();
    
    //Para guardar un objeto de tipo persona//
    public void savePersona (Persona persona);
    
    //Para eliminar una persona pero buscada desde un ID//
    public void deletePersona (Long id);
    
    //Buscar una persona por ID //
    public Persona findPersona(Long id);
    
}
