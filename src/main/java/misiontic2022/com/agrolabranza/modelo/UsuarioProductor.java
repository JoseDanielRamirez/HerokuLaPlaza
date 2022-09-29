package misiontic2022.com.agrolabranza.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario_productor")

public class UsuarioProductor {

    @Id
    private int numDocumento;

    private int idProducto;

    public UsuarioProductor() {
        super();
    }

    public UsuarioProductor(int numDocumento, int idProducto) {
        this.numDocumento = numDocumento;
        this.idProducto = idProducto;
    }

    
    


    
    
    
}
