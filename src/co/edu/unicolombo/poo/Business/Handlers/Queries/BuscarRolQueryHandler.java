
package co.edu.unicolombo.poo.Business.Handlers.Queries;

import co.edu.unicolombo.poo.Business.Interfaces.Repositories.IRolRepository;
import co.edu.unicolombo.poo.Domain.Model.Rol;
import co.edu.unicolombo.poo.Business.Interfaces.Queries.IBuscarRolQuery;


public class BuscarRolQueryHandler implements IBuscarRolQuery {
    private IRolRepository rolRepository;
    
    public BuscarRolQueryHandler(IRolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol GetRol(Rol rol) throws Exception {
        int rolId = rol.getId();               
        return rolRepository.buscarRolporId(rolId);

    }
    
    @Override
    public Rol GetRol(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
