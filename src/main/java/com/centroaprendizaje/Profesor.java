package com.centroaprendizaje;

import java.util.ArrayList;

public class Profesor extends PersonalAcademico{
    private ArrayList<Curso> cursosACargo = new ArrayList<>();
    

    //metodos
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){}
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){}
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){}
    public void crearNuevoForo(Foro foro){}
}
