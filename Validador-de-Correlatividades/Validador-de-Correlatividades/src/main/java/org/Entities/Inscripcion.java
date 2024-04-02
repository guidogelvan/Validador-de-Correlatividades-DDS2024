package org.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Inscripcion {
    private Alumno alumno;
    private ArrayList<Materia> materiasAInscribir = new ArrayList<Materia>();

    public Boolean aprobada(){
        return materiasAInscribir.stream().allMatch(m -> alumno.puedeCursar(m));
    }
}
