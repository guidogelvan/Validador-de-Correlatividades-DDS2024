package org.Inscripcion;

import org.Entities.Alumno;
import org.Entities.Inscripcion;
import org.Entities.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class InscripcionTest {

    public Inscripcion unaInscripcion;
    public Alumno unAlumno;
    public Materia materia1;
    public Materia materia2;
    public Materia materia3;


    @BeforeEach
    public void crearEntorno(){
        unaInscripcion = new Inscripcion();
        materia1 = new Materia();
        materia2 = new Materia();
        materia3 = new Materia();
        unAlumno = new Alumno();
        ArrayList<Materia> materiasAInscribir = new ArrayList<Materia>();
        materia1.setNombre("Analisis Matematico 2");
        materia2.setNombre("Analisis Matematico 1");
        materia3.setNombre("Algebra");
        ArrayList<Materia> correlativas = new ArrayList<Materia>();
        correlativas.add(materia2);
        correlativas.add(materia3);
        materia1.setCorrelativas(correlativas);
        materiasAInscribir.add(materia1);
        unaInscripcion.setMateriasAInscribir(materiasAInscribir);
        unAlumno.setNombre("Juan");
        unAlumno.setLegajo("12345");
        unaInscripcion.setAlumno(unAlumno);

    }

    @Test
    public void inscripcionConCorrelativaAprobada(){
        ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();
        materiasAprobadas.add(materia2);
        materiasAprobadas.add(materia3);
        unAlumno.setMateriasAprobadas(materiasAprobadas);

        Assertions.assertEquals( true, unaInscripcion.aprobada());
    }

    @Test
    public void inscripcionConCorrelativaNoAprobada(){
        ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();
        materiasAprobadas.add(materia2);
        unAlumno.setMateriasAprobadas(materiasAprobadas);

        Assertions.assertEquals( false, unaInscripcion.aprobada());
    }
}
