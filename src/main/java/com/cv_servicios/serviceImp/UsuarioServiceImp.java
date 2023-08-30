/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cv_servicios.serviceImp;
import com.cv_servicios.model.Usuario;
import com.cv_servicios.persistence.UsuarioJpaController;
import com.cv_servicios.service.IUsuarioService;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author maxi
 */
public class UsuarioServiceImp implements IUsuarioService{
    UsuarioJpaController usuarioRepository= new UsuarioJpaController();
    
    

    @Override
    public void createUsuario(Usuario usuario) {
        usuarioRepository.create(usuario);
    }

    @Override
    public Usuario getUsuario(int id) {
        return usuarioRepository.findUsuario(id);
    }

    @Override
    public void firstUsuario() {
        if(usuarioRepository.findUsuarioEntities().isEmpty()){
            Usuario admin= new Usuario("admin","admin","themaxi2012@gmail.com",3884558437l);
            usuarioRepository.create(admin);
        }
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios;
        usuarios=usuarioRepository.findUsuarioEntities();
        return usuarios;
    }
    
    @Override
    public Boolean login(Usuario usuario){
        Boolean salida=false;
        List<Usuario> usuarios= getUsuarios();
        for(Usuario user: usuarios){
            if(user.getUser().equals(usuario.getUser()) && user.getPassword().equals(usuario.getPassword()) ){
              salida=true;
            }
        }
        return salida;
    }
    
    
}
