package misiontic2022.com.agrolabranza.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.ImageIcon;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto-numérico incremental
    private Integer idProducto;
    
    private String nomProducto;
    private String descripcion;
    private Double precio;
    private Double cantidad;
    private ImageIcon insertarFoto;


    public Producto() {
        super();
    }


    public Producto(Integer idProducto, String nomProducto, String descripcion, Double precio, Double cantidad,
            ImageIcon insertarFoto) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.insertarFoto = insertarFoto;
    }


    public Integer getIdProducto() {
        return idProducto;
    }


    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }


    public String getNomProducto() {
        return nomProducto;
    }


    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Double getCantidad() {
        return cantidad;
    }


    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }


    public ImageIcon getInsertarFoto() {
        return insertarFoto;
    }


    public void setInsertarFoto(ImageIcon insertarFoto) {
        this.insertarFoto = insertarFoto;
    }

    

    

    

    
    
}

