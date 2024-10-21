
package co.edu.unicolombo.poo.Domain.Model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Rol {
    private int id;
    private String nombre;
    private String descripcion;
    private List<Usuario> usuarios;
    
    private static AtomicInteger incrementId;
    
    public Rol(){
        id = getIncrementeId();
    }

    public Rol(String nombre, String descripcion) throws Exception{
        if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("El nombre es requerido");
        }
        
        if(descripcion == null || descripcion.trim().isEmpty()){
            throw new Exception("La descripcion es requerida");
        }
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        id = getIncrementeId();
    }

    public Rol(int id) throws Exception{
        if(id <= 0){
            throw new Exception("El ID del Rol es requerido");
        }
        this.id = id;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public static AtomicInteger getIncrementId() {
        return incrementId;
    }

    public static void setIncrementId(AtomicInteger incrementId) {
        Rol.incrementId = incrementId;
    }

    private int getIncrementeId(){
        if (incrementId == null){
            incrementId = new AtomicInteger(0);
        }
        return incrementId.incrementAndGet();
    }
    
    
}
