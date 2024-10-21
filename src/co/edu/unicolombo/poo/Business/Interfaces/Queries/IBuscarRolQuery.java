
package co.edu.unicolombo.poo.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Domain.Model.Rol;


public interface IBuscarRolQuery {
    public Rol GetRol(Rol rol) throws Exception;
    public Rol GetRol(String nombre) throws Exception;
}
