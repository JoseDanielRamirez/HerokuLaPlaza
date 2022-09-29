package misiontic2022.com.agrolabranza.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import misiontic2022.com.agrolabranza.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario,Integer>{
    
}
