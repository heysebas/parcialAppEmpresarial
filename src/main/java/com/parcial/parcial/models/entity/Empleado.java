package com.parcial.parcial.models.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Empleado {
    
    @NotEmpty(message = "El id no puede estar vacio")
    private String id;

    @NotEmpty(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotEmpty(message = "El apellido no puede estar vacio")
    private String apellido;

    @NotEmpty(message = "El correo no puede estar vacio")
    private String correo;

    @NotEmpty(message = "El direecion no puede estar vacio")
    private String direccion;

    @NotEmpty(message = "El telefono deve ser 10 digitos")
    @Size(min = 10, max = 13)
    private String telefono;




    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
}
