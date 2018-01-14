package com.pablo.probando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int contador = 0;

    public void sumaContador (View vista){

        contador++;
        mostrarResultado();
    }

    public void restaContador (View vista){

        contador--;
        mostrarResultado();
    }

    public void reseteaContador (View vista){

        contador=0;
        mostrarResultado();
    }

    public void mostrarResultado(){

        TextView textoResultado=(TextView) findViewById(R.id.contadorTexto);
        textoResultado.setText("" + contador);
    }



}
