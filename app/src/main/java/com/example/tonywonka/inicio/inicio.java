package com.example.tonywonka.inicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio extends AppCompatActivity {

     Button LogDirector;
     Button LogTutor;
     Button LogProfe;
     Button LogChofer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        LogDirector = findViewById(R.id.director);
        LogTutor = findViewById(R.id.tutor);
        LogProfe = findViewById(R.id.profesor);
        LogChofer = findViewById(R.id.chofer);

        LogDirector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent direc = new Intent(inicio.this,IniciarSesion.class);
                startActivity(direc);
            }
        });

        LogTutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuto = new Intent(inicio.this,IniciarSesion.class);
                startActivity(tuto);
            }

        });

        LogProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prof = new Intent(inicio.this,IniciarSesion.class);
                startActivity(prof);
            }
        });

        LogChofer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chof = new Intent(inicio.this,IniciarSesion.class);
                startActivity(chof);
            }
        });
    }
}
