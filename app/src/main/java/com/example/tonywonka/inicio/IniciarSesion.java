package com.example.tonywonka.inicio;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesion extends AppCompatActivity {

    Button Bregistro;
    Button StarSesion;
    EditText N_usuario;
    EditText Password;



    @SuppressLint({"WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        Bregistro = findViewById(R.id.llevarRegistro);
        N_usuario = findViewById(R.id.user);
        StarSesion = findViewById(R.id.InicioSesion);
        Password = findViewById(R.id.contrasena);


        Bregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bregistro = new Intent(IniciarSesion.this,Registro.class);
                startActivity(bregistro);
            }
        });

        StarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameUser = N_usuario.getText().toString();
                String passworValid = Password.getText().toString();


                if(nameUser.contentEquals("tony")){
                     Toast.makeText(IniciarSesion.this,"Hola Tony",Toast.LENGTH_LONG).show();

                }else {Toast.makeText(IniciarSesion.this,"Usuario incorrecto",Toast.LENGTH_LONG).show();}

                if(passworValid.length() == 0 )
                {
                    Toast.makeText(IniciarSesion.this, "El pasword esta vacio", Toast.LENGTH_SHORT).show();
                }else{
                    if(passworValid.length() < 4)

                    Toast.makeText(IniciarSesion.this, "Caracteres insuficientes", Toast.LENGTH_SHORT).show();}
            }
        });

    }
}
