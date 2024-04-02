package org.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas = new ArrayList<Materia>();
}
