
package co.edu.unicolombo.poo.Business.Handlers.Commands;


public class EditarRolCommand {
    private int id;
    private String nombre;
    private String descripcion;

    public EditarRolCommand(int id, String nombre, String descripcion) throws Exception{
        if(id <= 0){
            throw new Exception("El id es requerido");
        }
        
        if(nombre == null || nombre.trim().isEmpty()){
            throw new Exception("La descripcion es requerida");
        }
        
        if(descripcion == null || nombre.trim().isEmpty()){
            throw new Exception("La descripcion es requerida");
        }
        
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
