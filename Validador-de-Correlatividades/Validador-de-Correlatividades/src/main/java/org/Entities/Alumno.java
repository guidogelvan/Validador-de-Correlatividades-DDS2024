package org.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class Alumno {
    private ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();
    private String nombre;
    private String legajo;

    public Boolean puedeCursar(Materia materia){
       return  materia.getCorrelativas().stream().allMatch(this::aprobo);
    }

    public Boolean aprobo(Materia materia){
        return materiasAprobadas.contains(materia);
    }

    public void agregarMateriaAprobada(Materia... materias) {
        materiasAprobadas.addAll(Arrays.asList(materias));
    }
}
