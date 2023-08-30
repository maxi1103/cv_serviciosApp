/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cv_servicios.service;

import com.cv_servicios.model.Usuario;
import java.util.List;
/**
 *
 * @author maxi
 */
public interface IUsuarioService {
   
    public void createUsuario(Usuario usuario);
    
    public Usuario getUsuario(int id);
    
    public void firstUsuario();
    
    public List<Usuario> getUsuarios();
    
    public Boolean login(Usuario usuario);
    
}
