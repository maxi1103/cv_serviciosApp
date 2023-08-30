/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cv_servicios.controller;

import com.cv_servicios.service.IUsuarioService;
import com.cv_servicios.model.Usuario;
import com.cv_servicios.serviceImp.UsuarioServiceImp;
import java.util.List;
/**
 *
 * @author maxi
 */
public class UsuarioController {
    IUsuarioService usuarioService = new UsuarioServiceImp();
    
    public boolean createUsuario(Usuario usuario){
        if(usuario!=null){
           usuarioService.createUsuario(usuario);
           return true;
        }
        else
            return false;
          
    }
    public Usuario getUsuario(int id){
        if(usuarioService.getUsuario(id)==null)
            return null;
        else
          return usuarioService.getUsuario(id);
    }
    
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }
    public Boolean login(Usuario usuario){
        return usuarioService.login(usuario);
    }
}
