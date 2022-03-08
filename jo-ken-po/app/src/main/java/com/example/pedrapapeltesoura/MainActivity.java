package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pedra(View view){
        this.opçaoSelecionada("pedra");
    }

    public void papel(View view){
        this.opçaoSelecionada("papel");
    }

    public void tesoura(View view){
        this.opçaoSelecionada("tesoura");
    }

    public void opçaoSelecionada(String opcao){
        ImageView resultado = findViewById(R.id.imgRes);
        TextView res = findViewById(R.id.txtResultado);
            System.out.println("A OPÇÃO SELECIONADA FOI:"+opcao);
            int x = new Random().nextInt(3);
            String[] opcaoPC = {"pedra","papel","tesoura"};
            String decisao = opcaoPC[x];

            switch (decisao){
                case "pedra":
                    resultado.setImageResource(R.drawable.pedra);
                    break;
                case "papel":
                    resultado.setImageResource(R.drawable.papel);
                    break;
                case "tesoura":
                    resultado.setImageResource(R.drawable.tesoura);
                    break;
                default:
                    break;
            }
            if(
                    (decisao == "pedra" && opcao == "tesoura") ||
                    (decisao == "tesoura" && opcao == "papel") ||
                    (decisao == "papel" && opcao == "pedra")
            ){
                res.setText("Você perdeu :(((((");
            }
            else if(
                    (opcao == "pedra" && decisao == "tesoura") ||
                    (opcao == "tesoura" && decisao == "papel") ||
                    (opcao == "papel" && decisao == "pedra")

            ){
                res.setText("Você VENCEU!!!! :))))))))");
            }
            else{
                res.setText("Deu nada, circulando");
            }
    }
}