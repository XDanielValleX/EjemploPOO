
package co.edu.unicolombo.poo.Business.Interfaces.Comands;

import co.edu.unicolombo.poo.Domain.Model.Rol;


public interface IGuardarRolCommand {
    public int crearRol(Rol rol) throws Exception;
}
