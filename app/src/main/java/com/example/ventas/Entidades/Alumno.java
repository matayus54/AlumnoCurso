package com.example.ventas.Entidades;

import java.io.Serializable;

public class Alumno implements Serializable {
    private Integer idAlumno;
    private String codigoAlumno;
    private String nombreAlumno;
    private String dniAlumno;
    private String escuelaProfesionalAlumno;

    public Alumno() {
    }

    public Alumno(Integer idAlumno, String codigoAlumno, String nombreAlumno, String dniAlumno, String escuelaProfesionalAlumno) {
        this.idAlumno = idAlumno;
        this.codigoAlumno = codigoAlumno;
        this.nombreAlumno = nombreAlumno;
        this.dniAlumno = dniAlumno;
        this.escuelaProfesionalAlumno = escuelaProfesionalAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getEscuelaProfesionalAlumno() {
        return escuelaProfesionalAlumno;
    }

    public void setEscuelaProfesionalAlumno(String escuelaProfesionalAlumno) {
        this.escuelaProfesionalAlumno = escuelaProfesionalAlumno;
    }
}