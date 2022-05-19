package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ventas.Conexiones.ConexionSqliteOpenHelper;
import com.example.ventas.Entidades.Alumno;
import com.example.ventas.Entidades.Usuario;
import com.example.ventas.Utilidades.Utilidades;

import java.util.ArrayList;

public class RegistrarCursos extends AppCompatActivity {
    EditText campoId,campoNombre,campoCreditosCurso,campoTipoCurso,campoSemestre;
    Spinner comboAlumno;

    ArrayList<String> listaPersonas;
    ArrayList<Alumno> personasList;

    ConexionSqliteOpenHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_cursos);


        campoId= (EditText) findViewById(R.id.campoId);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoCreditosCurso= (EditText) findViewById(R.id.campoCreditosCurso);
        campoTipoCurso= (EditText) findViewById(R.id.campoTipoCurso);
        campoSemestre= (EditText) findViewById(R.id.campoSemestre);

        comboAlumno= (Spinner) findViewById(R.id.comboAlumno);

        conn=new ConexionSqliteOpenHelper(getApplicationContext(),"bd_usuarios",null,1);

        consultarListaPersonas();

        ArrayAdapter<CharSequence> adaptador=new ArrayAdapter
                (this,android.R.layout.simple_spinner_item,listaPersonas);

        comboAlumno.setAdapter(adaptador);

        comboAlumno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long idl) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnRegistroCursos: registrarCurso();
        }
    }


    private void registrarCurso() {
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();

        values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_CREDITOS_CURSO,campoCreditosCurso.getText().toString());
        values.put(Utilidades.CAMPO_TIPO_CURSO,campoTipoCurso.getText().toString());
        values.put(Utilidades.CAMPO_SEMESTRE,campoSemestre.getText().toString());

        int idCombo= (int) comboAlumno.getSelectedItemId();
        /**
         * Valida la seleccion del combo de dueños, si el usuario elige "seleccione" entonces
         * se retorna el id 0 ya que la palabra "seleccione" se encuentra en la pos 0 del combo,
         * sinó entonces se retorna la posicion del combo para consultar el usuario almacenado en la lista
         */
        if (idCombo!=0){
            Log.i("TAMAÑO",personasList.size()+"");
            Log.i("id combo",idCombo+"");
            Log.i("id combo - 1",(idCombo-1)+"");//se resta 1 ya que se quiere obtener la posicion de la lista, no del combo
            int idAlumno=personasList.get(idCombo-1).getIdAlumno();
            Log.i("id Alumno",idAlumno+"");

            values.put(Utilidades.CAMPO_ID_CURSO_ALUMNO,idAlumno);

            Long idResultante=db.insert(Utilidades.TABLA_CURSO,Utilidades.CAMPO_ID_CURSO,values);

            Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
            db.close();

        }else{
            Toast.makeText(getApplicationContext(),"Debe seleccionar un Alumno",Toast.LENGTH_LONG).show();
        }




    }

    private void consultarListaPersonas() {
        SQLiteDatabase db=conn.getReadableDatabase();

        Alumno persona=null;
        personasList =new ArrayList<Alumno>();
        //select * from usuarios
        Cursor cursor=db.rawQuery("SELECT * FROM "+ Utilidades.TABLA_ALUMNO,null);

        while (cursor.moveToNext()){
            persona=new Alumno();
            persona.setIdAlumno(cursor.getInt(0));
            persona.setCodigoAlumno(cursor.getString(1));
            persona.setNombreAlumno(cursor.getString(2));
            persona.setDniAlumno(cursor.getString(3));
            persona.setEscuelaProfesionalAlumno(cursor.getString(4));

            Log.i("id",persona.getIdAlumno().toString());
            Log.i("Codigo",persona.getCodigoAlumno());
            Log.i("Nombre",persona.getNombreAlumno());
            Log.i("Dni",persona.getDniAlumno());
            Log.i("Escuela",persona.getEscuelaProfesionalAlumno());

            personasList.add(persona);

        }
        obtenerLista();
    }

    private void obtenerLista() {
        listaPersonas=new ArrayList<String>();
        listaPersonas.add("Seleccione");

        for(int i=0;i<personasList.size();i++){
            listaPersonas.add(personasList.get(i).getIdAlumno()+" - "+personasList.get(i).getNombreAlumno());
        }

    }




}