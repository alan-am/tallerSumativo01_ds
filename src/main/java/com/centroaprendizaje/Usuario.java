package com.centroaprendizaje;

import java.util.ArrayList;

public class Usuario {
    //atributos
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes = new ArrayList<>();


    //metodos
    protected boolean logIng(){
        return true;
    }

     protected boolean logOut(){
        return true;
    }

}
