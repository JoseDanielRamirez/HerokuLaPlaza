package misiontic2022.com.agrolabranza.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_usuario")
public class TipoUsuario {
    @Id
    private Integer id_tipo;
    @Basic
    private String nombre_tipo;

    
}
