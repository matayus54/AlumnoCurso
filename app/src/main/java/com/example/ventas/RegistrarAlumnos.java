package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ventas.Conexiones.ConexionSqliteOpenHelper;
import com.example.ventas.Utilidades.Utilidades;

public class RegistrarAlumnos extends AppCompatActivity {
    EditText  campoId,campoCodigo,campoNombre,campoDni,campoEscuela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_alumnos);

        campoId= (EditText) findViewById(R.id.campoId);
        campoCodigo= (EditText) findViewById(R.id.campoCodigo);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoDni= (EditText) findViewById(R.id.campoDni);
        campoEscuela= (EditText) findViewById(R.id.campoEscuela);
    }
    public void onClick(View view) {
        registrarAlumnos();
        //registrarUsuariosSql();
    }



    private void registrarAlumnos() {
        ConexionSqliteOpenHelper conn=new ConexionSqliteOpenHelper(this,"bd_alumnos",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_ID_ALUMNO,campoId.getText().toString());
        values.put(Utilidades.CAMPO_CODIGO_ALUMNO,campoCodigo.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE_ALUMNO,campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_DNI_ALUMNO,campoDni.getText().toString());
        values.put(Utilidades.CAMPO_ESCUELA_PROFESIONAL_ALUMNO,campoEscuela.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_ALUMNO,Utilidades.CAMPO_ID_ALUMNO,values);

        Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }
}