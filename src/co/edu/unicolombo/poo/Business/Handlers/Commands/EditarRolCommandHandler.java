
package co.edu.unicolombo.poo.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Business.Interfaces.Comands.IEditarRolCommand;
import co.edu.unicolombo.poo.Business.Interfaces.Repositories.IRolRepository;
import co.edu.unicolombo.poo.Domain.Model.Rol;


public class EditarRolCommandHandler implements IEditarRolCommand {

    private IRolRepository rolRepository;

    public EditarRolCommandHandler(IRolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public void editarRol(EditarRolCommand comando) throws Exception {
        Rol rol1 = new Rol();
        rol1.setId(comando.getId());
        rol1.setNombre(comando.getNombre());
        rol1.setDescripcion(comando.getDescripcion());
        rolRepository.editarRol(rol1);
    }
    
}
