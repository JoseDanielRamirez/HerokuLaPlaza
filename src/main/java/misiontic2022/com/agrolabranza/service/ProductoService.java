package misiontic2022.com.agrolabranza.service;

import java.util.List;
import java.util.Optional;

import misiontic2022.com.agrolabranza.interfaceService.IproductoService;
import misiontic2022.com.agrolabranza.interfaces.IProducto;
import misiontic2022.com.agrolabranza.modelo.Producto;

public class ProductoService implements IproductoService{
    private IProducto data;

    @Override
    public void delete(int idProducto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Producto> listar() {
        return (List<Producto>) data.findAll();
    }

    @Override
    public Optional<Producto> listarId(int idProducto) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public int save(Producto p) {
        // TODO Auto-generated method stub
        return 0;
    }
    

}  
    

