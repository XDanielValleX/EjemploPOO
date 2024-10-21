
package co.edu.unicolombo.poo.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Business.Interfaces.Comands.IGuardarRolCommand;
import co.edu.unicolombo.poo.Business.Interfaces.Repositories.IRolRepository;
import co.edu.unicolombo.poo.Domain.Model.Rol;


public class GuardarRolCommandHandler implements IGuardarRolCommand{
    private IRolRepository rolRepository;

    public GuardarRolCommandHandler(IRolRepository repository) {
        rolRepository = repository;
    }

    @Override
    public int crearRol(Rol rol) throws Exception {

        rol.setNombre(rol.getNombre());
        rol.setDescripcion(rol.getDescripcion());
        return rolRepository.guardarRol(rol);
    }
    
}
