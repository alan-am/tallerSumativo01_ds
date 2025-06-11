package com.centroaprendizaje;

import java.time.LocalTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected LocalTime fecha_cerrado;
    protected String tipo;
    

}
