package co.edu.unicolombo.poo.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Business.Interfaces.Comands.IEliminarRolCommand;
import co.edu.unicolombo.poo.Business.Interfaces.Repositories.IRolRepository;
import co.edu.unicolombo.poo.Domain.Model.Rol;

public class EliminarRolCommandHandler implements IEliminarRolCommand {

    private IRolRepository rolRepository;

    public EliminarRolCommandHandler(IRolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public void eliminarRol(int rolId) throws Exception {
        Rol rol = rolRepository.buscarRolporId(rolId);
        if (rol == null) {
            throw new Exception("El rol con ID " + rolId + " no existe.");
        }
        rolRepository.eliminarRol(rolId);
    }

}
