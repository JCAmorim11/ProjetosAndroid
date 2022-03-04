package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textFrase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFrase = findViewById(R.id.txtFrase);
        Button btnJogar =findViewById(R.id.btnGerar);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gerarFrase(view);
            }
        });
    }

    public void gerarFrase(View view){
        String[] frases = {
                "Ensinar não é transferir conhecimento, mas criar as possibilidades para a sua própria produção ou a sua construção.",
                "Ninguém ignora tudo. Ninguém sabe tudo. Todos nós sabemos alguma coisa. Todos nós ignoramos alguma coisa. Por isso aprendemos sempre.",
                "Ninguém ignora tudo. Ninguém sabe tudo. Todos nós sabemos alguma coisa. Todos nós ignoramos alguma coisa. Por isso aprendemos sempre.",
                "Nada ocorre na natureza de forma isolada. Cada fenômeno afeta outro e é, por seu turno, influenciado por este.",
                "Quando vires um homem bom, tenta imitá-lo; quando vires um homem mau, examina-te a ti mesmo.",
                "Não corrigir nossas falhas é o mesmo que cometer novos erros."
        };
        int seleciona= new Random().nextInt(5);
        textFrase.setText( frases[seleciona]);

    }
}