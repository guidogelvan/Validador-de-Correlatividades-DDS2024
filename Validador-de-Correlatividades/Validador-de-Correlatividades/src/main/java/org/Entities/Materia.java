package org.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas = new ArrayList<Materia>();

    public void agregarCorrelativas(Materia... materias) {
        correlativas.addAll(Arrays.asList(materias));
    }
}
