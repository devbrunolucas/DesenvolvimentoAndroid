package com.cursoandroid.aplicativosorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define a cor de fundo do layout raiz
        View rootLayout = getWindow().getDecorView().findViewById(android.R.id.content);
        rootLayout.setBackgroundColor(Color.parseColor("#1C1C1C"));

        // Define a cor de fundo do layout raiz
        View botaoLayout = getWindow().getDecorView().findViewById(R.id.button);
        botaoLayout.setBackgroundColor(Color.parseColor("#4B0082"));

        // Altere a cor do texto
        TextView textView2 = findViewById(R.id.textView);
        textView2.setTextColor(Color.parseColor("#F1F1F1"));

        TextView textobotao = findViewById(R.id.button);
        textobotao.setTextColor(Color.parseColor("#F1F1F1"));

        TextView textoautor = findViewById(R.id.autor);
        textoautor.setTextColor(Color.parseColor("#F1F1F1"));

        TextView textoResultado = findViewById(R.id.textoResultado);
        textoResultado.setTextColor(Color.parseColor("#F1F1F1"));
    }

    public void sortearNumero(View view){

        TextView texto = findViewById(R.id.textoResultado);

        int numero = new Random().nextInt(11);
        String numeroString = String.valueOf(numero);

        texto.setText(numeroString);

    }

}
