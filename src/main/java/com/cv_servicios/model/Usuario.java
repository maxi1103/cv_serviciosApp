/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cv_servicios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/*
 *
 * @author maxi
 */

@Table(name="usuarios")
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id_user")
    private int idUser;
    
    @Column(name="user")
    private String user;
    
    @Column(name="password")
    private String password;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="telefono")
    private long telefono;

    public Usuario() {
    }
    
    public Usuario(String user, String password, String correo, long telefono) {
        this.user = user;
        this.password = password;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    

}
