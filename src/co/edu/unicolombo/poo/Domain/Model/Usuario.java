
package co.edu.unicolombo.poo.Domain.Model;

import java.util.concurrent.atomic.AtomicInteger;


public class Usuario {
    private String cedula ;
    private String clave ;
    private String codigo;
    private String apellido ;
    private String nombre ;
    private String direccion ;
    private String correo ;
    private String telefono ;
    private Rol rol;
    
    private static AtomicInteger incrementId;

    public Usuario(String codigo, String nombre, Rol rol)throws Exception {
        if(codigo == null || codigo.trim().isEmpty()){
            throw new Exception("El codigo es requerido");
        }
        
        if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("El nombre es requerido");
        }
        
        if(rol == null){
            throw new Exception("El rol es requerido");
        }
        this.nombre = nombre;
        this.codigo = codigo;
        this.rol = rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public static AtomicInteger getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(AtomicInteger incrementId) {
        Usuario.incrementId = incrementId;
    }
    
    
    
    private int getIncrementeId(){
        if (incrementId == null){
            incrementId = new AtomicInteger(0);
        }
        return incrementId.incrementAndGet();
    }
}
