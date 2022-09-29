package misiontic2022.com.agrolabranza.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import misiontic2022.com.agrolabranza.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto,Integer> {
    

}
