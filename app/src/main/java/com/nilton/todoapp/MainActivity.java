package com.nilton.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    EditText nome;
    TextView resposta;
    TextView resultado;
    Switch btnUrgente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.editNomeId);
        resposta = (TextView) findViewById(R.id.txtRespostaId);
        btnUrgente = (Switch) findViewById(R.id.SwitchUrgente);
        resultado = (TextView) findViewById(R.id.txtResultado);
        resultado.setVisibility(View.INVISIBLE);



        btnUrgente.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    resultado.setText("Urgente");
                }else{
                    resultado.setText("Não urgente");
                }


            }
        });




    }

    public void pressionado(View view) {
        String n = nome.getText().toString();
        String frase =  n;
               resposta.setText(frase);
        resultado.setVisibility(View.VISIBLE);







    }

    }

