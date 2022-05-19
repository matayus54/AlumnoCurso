package com.example.ventas.Utilidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.math.BigDecimal;

public class Utilidades  {
    //Constantes campos tabla usuario
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_TELEFONO="telefono";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " +
            ""+TABLA_USUARIO+" ("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_NOMBRE+" TEXT,"+CAMPO_TELEFONO+" TEXT)";

    //campos tabla producto
    public static final String TABLA_PRODUCTO="producto";
    public static final String CAMPO_ID_CLIENTE="id_Cliente";
    public static final String CAMPO_ID_PRODUCTO="id_Producto";
    public static final String CAMPO_NOMBRE_PRODUCTO="nombre";
    public static final String CAMPO_PRECIO="precio";

    //Constantes campos tabla mascota
    public static final String TABLA_MASCOTA="mascota";
    public static final String CAMPO_ID_MASCOTA="id_mascota";
    public static final String CAMPO_NOMBRE_MASCOTA="nombre_mascota";
    public static final String CAMPO_RAZA_MASCOTA="raza_mascota";
    public static final String CAMPO_ID_DUENIO="id_duenio";

    public static final String CREAR_TABLA_MASCOTA="CREATE TABLE " +
            ""+TABLA_MASCOTA+" ("+CAMPO_ID_MASCOTA+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPO_NOMBRE_MASCOTA+" TEXT, "+CAMPO_RAZA_MASCOTA+" TEXT,"+CAMPO_ID_DUENIO+" INTEGER)";




    //Constantes campos tabla Alumno
    public static final String TABLA_ALUMNO="alumno";
    public static final String CAMPO_ID_ALUMNO="id_alumno";
    public static final String CAMPO_CODIGO_ALUMNO="codigo_alumno";
    public static final String CAMPO_NOMBRE_ALUMNO="nombre_alumno";
    public static final String CAMPO_DNI_ALUMNO="dni_alumno";
    public static final String CAMPO_ESCUELA_PROFESIONAL_ALUMNO="escuela_profesional_alumno";

    public static final String CREAR_TABLA_ALUMNO="CREATE TABLE " +
            ""+TABLA_ALUMNO+" ("+CAMPO_ID_ALUMNO+" " +
            "INTEGER, "+CAMPO_CODIGO_ALUMNO+" TEXT,"+CAMPO_NOMBRE_ALUMNO+" TEXT,"+CAMPO_DNI_ALUMNO+" TEXT,"+CAMPO_ESCUELA_PROFESIONAL_ALUMNO+" TEXT)";

    //Constantes campos tabla Curso
    public static final String TABLA_CURSO="curso";
    public static final String CAMPO_ID_CURSO="id_curso";
    public static final String CAMPO_NOMBRE_CURSO="nombre_curso";
    public static final String CAMPO_CREDITOS_CURSO="creditos_curso";
    public static final String CAMPO_TIPO_CURSO="tipo_curso";
    public static final String CAMPO_SEMESTRE="semestre";
    public static final String CAMPO_ID_CURSO_ALUMNO="id_curso_alumno";

    public static final String CREAR_TABLA_CURSO="CREATE TABLE " +
            ""+TABLA_CURSO+" ("+CAMPO_ID_CURSO+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPO_NOMBRE_CURSO+" TEXT, "+CAMPO_CREDITOS_CURSO+" INTEGER,"+CAMPO_TIPO_CURSO+" TEXT,"+CAMPO_SEMESTRE+" TEXT"+CAMPO_ID_CURSO_ALUMNO+" INTEGER)";



}