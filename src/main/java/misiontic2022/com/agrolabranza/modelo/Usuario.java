package misiontic2022.com.agrolabranza.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private Integer numDocumento;

    private Integer id_tipo;
    private String nombres_apellidos;
    private String tipo_documento;
    private String ciudad_municipio;
    private String direccion;
    private String email;
    private String celular;
    private String contraseña;

    
    public Usuario() {
        super();
    }

    

    public Usuario(Integer numDocumento, Integer id_tipo, String nombres_apellidos, String tipo_documento,
            String ciudad_municipio, String direccion, String email, String celular, String contraseña) {
        this.numDocumento = numDocumento;
        this.id_tipo = id_tipo;
        this.nombres_apellidos = nombres_apellidos;
        this.tipo_documento = tipo_documento;
        this.ciudad_municipio = ciudad_municipio;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
        this.contraseña = contraseña;
    }



    public Integer getNumDocumento() {
        return numDocumento;
    }
    public void setNumDocumento(Integer numDocumento) {
        this.numDocumento = numDocumento;
    }
    public Integer getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }
    public String getNombres_apellidos() {
        return nombres_apellidos;
    }
    public void setNombres_apellidos(String nombres_apellidos) {
        this.nombres_apellidos = nombres_apellidos;
    }
    public String getTipo_documento() {
        return tipo_documento;
    }
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    public String getCiudad_municipio() {
        return ciudad_municipio;
    }
    public void setCiudad_municipio(String ciudad_municipio) {
        this.ciudad_municipio = ciudad_municipio;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    

    // private Integer estadoProducto;

}
