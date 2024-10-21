/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Rol;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IRolRepository {
    public Rol buscarRolporId(int rolId) throws Exception;
    public Rol buscarRolporNombre(String nombre) throws Exception;
    public int guardarRol(Rol rol) throws Exception;
    public void editarRol(Rol rol) throws Exception;
    public int eliminarRol(int rolId) throws Exception;
    public List<Rol> getAllRol();
    

}
