
package com.hibernate.prueba.service;

import com.hibernate.prueba.model.Persona;
import java.util.List;

public interface IPersonaService {
    //traer personas
    //lectura
    public List<Persona> getPersonas();
    
    //alta
    public void savePersona(Persona perso);
    
    //baja
    public void deletePersona (Long id);
    
    //lectura de un solo objeto
    public Persona findPersona (Long id);
    
    //modificacion
    public void editPersona (Long idOriginal,
            Long idNueva,
            String nuevoNombre,
            String nuevoApellido, 
            int nuevaEdad);
}
