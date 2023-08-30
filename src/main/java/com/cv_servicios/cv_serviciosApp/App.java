package com.cv_servicios.cv_serviciosApp;

import com.cv_servicios.service.IUsuarioService;
import com.cv_servicios.serviceImp.UsuarioServiceImp;
import com.cv_servicios.ui.LoginUI;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        IUsuarioService usuarioService= new UsuarioServiceImp();
        usuarioService.firstUsuario();
        LoginUI login=  new LoginUI();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
