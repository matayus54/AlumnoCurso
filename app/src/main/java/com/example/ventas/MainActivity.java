package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ventas.Conexiones.ConexionSqliteOpenHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConexionSqliteOpenHelper conn= new ConexionSqliteOpenHelper(this,"bd_usuarios",null,1);
        ConexionSqliteOpenHelper connCuentas= new ConexionSqliteOpenHelper(this,"bd_alumnos",null,1);
    }

    public void onClick(View view) {
        Intent miIntent=null;
        switch (view.getId()){
//            alumnos
            case R.id.btnRegistroAlumnos:
                miIntent=new Intent(MainActivity.this,RegistrarAlumnos.class);
                break;
//            cuentas
            case R.id.btnRegistroCursos:
                miIntent=new Intent(MainActivity.this,RegistrarCursos.class);
                break;
//            usuarios
            case R.id.btnOpcionRegistro:
                miIntent=new Intent(MainActivity.this,RegistroUsuarios.class);
                break;

            case R.id.btnConsultaIndividual:
                miIntent=new Intent(MainActivity.this,ConsultarUsuarios.class);
                break;

            case R.id.btnConsultaSpinner:
                miIntent=new Intent(MainActivity.this, ConsultaUsuariosCombo.class);
                break;

            case R.id.btnConsultaLista:
                miIntent=new Intent(MainActivity.this, ConsultarUsuariosListView.class);
                break;
//productos
//            case R.id.btnConsultaListaPersonasRecycler:
//                miIntent=new Intent(MainActivity.this,ListaPersonasRecycler.class);
//                break;

            case R.id.btnRegistroMascota:
                miIntent=new Intent(MainActivity.this,RegistroMascotas.class);
                break;
            case R.id.btnConsultaListaMascota:
                miIntent=new Intent(MainActivity.this,ConsultarListaMascotas.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }

    }
}