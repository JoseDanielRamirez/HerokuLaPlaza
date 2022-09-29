package misiontic2022.com.agrolabranza.interfaceService;

import java.util.Optional;

import misiontic2022.com.agrolabranza.modelo.Producto;

import java.util.List;

public interface IproductoService {
    public List<Producto> listar();
    public Optional<Producto> listarId(int idProducto);
    public int  save (Producto p);
    public void delete(int idProducto);

    
}
