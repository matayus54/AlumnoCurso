package com.example.ventas.Entidades;


import java.io.Serializable;

public class Curso implements Serializable {
    private Integer idCurso;
    private Integer idCursoAlumno;
    private String codigoCurso;
    private String nombreCurso;
    private Integer creditosCurso;
    private String tipoCurso;
    private String semestre;

    public Curso() {
    }

    public Curso(Integer idCurso, Integer idCursoAlumno, String codigoCurso, String nombreCurso, Integer creditosCurso, String tipoCurso, String semestre) {
        this.idCurso = idCurso;
        this.idCursoAlumno = idCursoAlumno;
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.creditosCurso = creditosCurso;
        this.tipoCurso = tipoCurso;
        this.semestre = semestre;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCursoAlumno() {
        return idCursoAlumno;
    }

    public void setIdCursoAlumno(Integer idCursoAlumno) {
        this.idCursoAlumno = idCursoAlumno;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCreditosCurso() {
        return creditosCurso;
    }

    public void setCreditosCurso(Integer creditosCurso) {
        this.creditosCurso = creditosCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}