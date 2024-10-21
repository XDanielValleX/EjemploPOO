
package co.edu.unicolombo.poo.infrastructure.Repositories;

import co.edu.unicolombo.poo.Business.Interfaces.Repositories.IRolRepository;
import co.edu.unicolombo.poo.Domain.Model.Rol;
import java.util.ArrayList;
import java.util.List;


public class RolRepository implements IRolRepository{

    private static List<Rol> rolesDb;
    
    public RolRepository() {
        crearRolDb();
    }

    private void crearRolDb(){
        if(rolesDb == null){
            rolesDb = new ArrayList<>();
        }
    }
    
    @Override
    public Rol buscarRolporId(int rolId) throws Exception {
        if(rolesDb == null || rolesDb.isEmpty()){
            throw new Exception("El rol"+rolId+" No existe");
        }
        Rol rolFound = null;
        for(Rol r: rolesDb){
            if(r.getId()== rolId){
                rolFound = r;
                break;
            }
        }
        if(rolFound == null){
            throw new Exception("El rol"+rolId+" No existe");
        }
        return rolFound;
    }

    @Override
    public Rol buscarRolporNombre(String nombre) throws Exception {
        if(rolesDb.isEmpty()){
            throw new Exception("El rol"+nombre+" No existe");
        }
        Rol rolFound = null;
        for(Rol r: rolesDb){
            if(r.getNombre().equals(nombre)){
                rolFound = r;
                break;
            }
        }
        if(rolFound == null){
            throw new Exception("El rol"+nombre+" No existe");
        }
        return rolFound;
    }

    @Override
    public int guardarRol(Rol rol) throws Exception {
        if (rolesDb == null || rolesDb.isEmpty()) {
            rolesDb = new ArrayList<>();
            
//            throw new Exception("El rol es requerido");
        }

        try {
            Rol rolFound = buscarRolporNombre(rol.getNombre());

            if (rolFound != null) {
                throw new Exception("El rol " + rol.getNombre() + " ya existe");
            }
        } catch (Exception error) {
            if (!error.getMessage().contains("No existe")) {
                throw error;
            }

        }

        rolesDb.add(rol);
        return rolesDb.size();
    }


    @Override
    public void editarRol(Rol rol) throws Exception {  
        if(rol == null){
            throw new Exception("El rol es requerido");
        }
        if(rolesDb.isEmpty()){
            throw new Exception("El rol "+rol.getNombre()+ " No existe");
        }
        Rol rolFound = buscarRolporId(rol.getId());
        int pos =rolesDb.indexOf(rolFound);
        rolesDb.set(pos, rol);
    }

    @Override
    public int eliminarRol(int rolId) throws Exception {  

        if(rolesDb.isEmpty()){
            throw new Exception("El rol "+rolId+ " No existe");
        }
        Rol rolFound = buscarRolporId(rolId);
        rolesDb.remove(rolId);
        int pos =rolesDb.indexOf(rolFound);
        return rolesDb.size();
    }

    @Override
    public List<Rol> getAllRol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
